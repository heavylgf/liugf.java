
机器（CPU、内存、磁盘、网络），Broker（JMX指标监控），Broker JVM进程（GC JMX指标），每个broker的安装目录下都有logs目录，
监控和查阅系统级的一些异常和报错，也是需要进行监控的

哪怕是你开发一个java的系统，你写好的一个系统上线在运行了，此时你也应该对这个系统的监控做到比较完善，一个是监控你部署的
机器本身的负载，另外一个是在你自己的代码运行的过程中

对一些比较关键和核心的业务指标进行监控

就比如说你可以监控一下，每秒钟接口收到的订单的数量，业务指标，对这个业务指标可以进行监控，每秒最多就100笔订单，结果突然
发现每秒订单数量暴增，出现了每秒钟有10000个订单

JVM的GC的一些情况，一分钟之内连续进行了3次GC，就是有问题的，你的Java系统里面肯定是有哪些地方有问题，导致full gc特别的
频繁

一旦说你的系统里任何一个地方有异常和报错，必须要报警，发短信或者邮件，都是可以的，给到你，说你的系统出现了异常，你可以
去翻看那个报错的日志

**留一个作业：** 查阅一下Kafka JMX指标，有没有哪个指标可以帮助你进行异常报错的监控，有米有其他的什么JMX的指标是比较
关键的，需要你来进行监控的

----------------------------------------------------------------------------------------------

机器、业务、JVM、异常 -> 监控

当然通常来说，我们需要一个完善的工具来帮助我们监控kafka集群了，需要可视化的工具来做到这个，雅虎开源的kafka-manager是
非常好的一个工具

从官网下载kafka-manager-maser的zip文件，解压缩

然后还需要先安装sbt构建工具，这个过程很慢，直接用构建好的工具

解压缩构建好的包，然后进入conf/application.conf，修改里面的kafka-manager.zkhosts，修改成你的zk地址就可以了

chmod u+x bin/kafka-manager，bin/kafka-manager，就可以运行，进入9000端口号的界面，此时要先添加一个要监控的kafka集群，
但是现在只能支持到0.11.0.0，我们部署的kafka版本太新了，还监控不了

所以大家最好还是在生产环境考虑一下，是用最新版本的，还是用老一点点的0.11.0.0版本

自己注意勾选一个JMX指标轮询就可以，然后可以实时看到JMX指标了，而且包括机器本身的指标，葛洪东西，你都是可以看到的，还有
就是当前的consumer group等，你有哪些消费者，都可以看到

这不是什么很难的事情

如果你发现开源的工具无法完全满足你的监控的需求，很正常，监控类的工具开发起来是很容易的，你需要的东西，人家kafka都通过
API，或者一些脚本，提供给你了，你完全可以自己也封装一个监控的平台，把我说的那些监控全部都给实现了

机器、核心的JMX指标、JVM GC、异常日志监控，报警某块，你可以配置一些报警的阈值

比如说，broker接收数据的速率如果超过了300mb/s，就要进行报警，完全可以跟一些第三方的短信和邮件的平台集成起来，一旦说有
报警，就发送短信或者邮件到对应的同事的手机上和邮箱里去

一开始可能最多就投入个1人/月，1个数据工程师，1个月的时间，就可以把这个kafka监控报警平台可以做出来了，后续就是这个人抽
一点点的时间维护就可以了

