
    反正大家之前也看到了，hadoop1.x的时代，基本就是一个namenode,然后挂一个secondary namenode,
就这意思，namenode就是接收元数据变更操作，比如创建目录，创建文件，给写入文件的数据划分block,
给每个block映射到datanode，类似这些活儿是吧。

    namenode说白了，就是在自己的内存里搞一份元数据，有任何修改就在内存里改改，然后写一份变更日志到edits log文件里去，
不停的追加，如果重启，那么就读取fsimage文件和editslog，然后editslog与fsimage合并，然后写一份新的fsimage,同事清空
edits log，就这原理

    所以为了保证edits log不要太大，下次重启时间过长，就会搞一个secondary namenode,一般不停的执行checkpoint操作，
在另外一台机器上合并fsimage和edits log,然后更新namenode上的fsimage,清空edits log。

    同时其实secondary namenode之前也一直相当于是namenode的冷备份，因为有fsimage的快照，如果namenode上的元数据破损了，
你可以拷贝secondary namenode上的fsimage过去就ok了。

    然后这样不好就在于说，namenode的磁盘要是坏了，还是会丢失部分的元数据，因为上次chechpoint之后，在edits log里面的就
丢失了。

    所以说hadoop 1.x的namenode，首先元数据是可能丢失的，其次是不高可用的，如果namenode宕机了，
那么整个hdfs集群就无法使用了

    然后进入到了hadoop 2.x的时代，为了保证namenode上的元数据不会丢失，而且是高可用的，搞了一个双实例HA的机制

    就是说在集群里启动两个namenode，然后一个是active状态，一个是standby状态，一个是主，一个是备。所有的操作都是
发送给active namenode的，然后standby namenode就是一个热备，不停的同步元数据

    但是还要在集群里引入一组节点，叫做journal nodes，一般是启动3个journal nodes，这个journal是啥意思？就是日志的意思，
叫做journal，顾名思义，肯定是用来保存edits log这种操作日志的了

    每次namenode有一个元数据变更，就要将这个edits log发送给journal nodes里的大多数，什么叫做大多数呢？就是quorum，
比如3台journal nodes，大多数就是3 / 2 + 1 = 2,2台就是大多数了，只要namenode发送edit log大多数的journal nodes之后，
就认为这个元数据变更是安全的了

    standby namenode就一直监控着journal nodes里的edits log变更，只要变更了就会读取edits log，同时应用到自己本地的
内存里去，形成一个跟active namenode一致的fsiamge数据在内存里

    然后如果说active namenode挂掉了，那么此时standby namenode立刻就会感知到的，然后他会确保自己从journal nodes读取了
所有的edits log之后，内存的fsimage绝对是最新的之后，就会将自己切换为active namenode，形成主备切换。这个时候，
namenode第一数据不会丢失，因为有journal nodes在里面用多台机器保存着，第二，namenode高可用，一台挂了，另外一台立马接管，
数据都是一致的

    而且所有的datanode都是配置了两台namenode的，那么datanode会将自己的block report汇报给主备两台namenode，
确保他们都能感知到集群里的datanode的状态和block的情况啊。。

    那么两台namenode是如何在故障的时候自动faillover（失效者）的呢？靠的是ZKFC两个进程，就是每个namenode机器上都要跑一个
ZKFailoverController的进程，简称之ZKFC，他们俩会不断的监控两个namenode，同时在zookeeper集群上（至少3个节点）
维护namenode的状态

    如果active namenode挂了，那么ZKFC里的也给HealthMonitor就会监控到，然后就会告诉ZKFC里的一个FailoverController
通知说namenode挂了，接着FailoverContrller找ActiveStandbyElector组件说要主备重新选举

    ActiveStandbyElector就会基于zk集群完成主备选举，这个过程就不说了，总之会选举出来standby namenode作为主的

    然后zk会通知standby机器上的ZKFC中的ActiveStandbyElector组件，ActiveStandbyElector通知FailoverController要切换
standby为active了，然后FailoverController再通知standby namenode切换为active namenode

    而且journal nodes还仅仅只允许一台namenode给他写edits log，就是为了避免脑裂问题，两台namenode的网络环境不通了，
他们俩都以为自己是active往journal nodes写数据，此时只能有一台写



