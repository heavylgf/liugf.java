
中小型公司里面，其实是不需要类似这样子的一个可视化平台

你们主要就是一个大数据团队，也就20个人以内，你除了kafka以外，还要负责管理和运维zookeeper、hbase，5个人是数据平台工程师，
专门负责搭建和运维各种集群，把集群给搞好，提供给负责业务的同学来使用

比如可能也就几个人搞实时这块的，flink、spark streaming之类的东西，他们会来使用kafka，如果他们需要创建或者删除topic，
直接跟你说一声就可以了，他们就直接用client API去访问kafka就可以了

查看所有的topic的一些信息，可能就你平时看看就可以了，人家根本不关注这个topic他的各个分区的副本在哪些broker.id的机器上，
ISR列表，都不知道ISR是什么东西，所以说这是中小公司很现实的一个场景

其实上一讲说了一些topic管理的命令，大家可以想一下，平时topic管理无非就是几块，增删查，如果有新的业务场景需要接入kafka，
首先就得创建自己的topic是不是，接着有可能某一天不需要一个topic了，就得把他给删了

然后平时就是查看这个topic的列表，查询 topic的详细信息

所以说，如果这些事儿都依赖kafka管理员来做，那他也太累了吧，在中小公司里其实是可以完全依赖kafka管理员手工管理topic的，
但是中大公司里，技术团队都几百人，很多不同的team都要接入kafka，完全应该提供一个自助式接入的方式

其实自助式接入也很简单，就是kafka运维团队需要做一个web平台，你用python做，用java web做，都可以，要写出来一些界面，
允许用户可以自行创建topic，申请删除topic，查看topic列表，查看topic详情

比如说创建topic，你完全可以让用户填入一个表单：

（1）topic名称
（2）业务方自己预估一下这个topic每天会有多少GB的数据
（3）业务方需要这个topic的数据保留几天

接着表单发送请求到后台，你就可以调用kafka的Java API来发送请求去创建一个topic出来

如果要在java web里使用kafka api，需要引入maven依赖

<dependency>
<groupId>org.apache.kafka</groupId>
<artifactId>kafka_2.11</artifactId>
<version>0.11.0.1</version>
</dependency>

下面的代码就是用来发送请求去创建一个topic的，在这里把用户指定的topic名称放进去，然后根据用户预估每天的数据量来计算出来
需要几个Partition，通常来说一个Partition存放个10GB的数据是没问题的

所以比如用户预估一天有20GB的数据量，那么就给他2个分区就可以了

假设说一天是2GB的数据量，保留最近7天的数据，这个topic一共就是14G的数据，这个时候你给他分配一个parttiion也可以，或者
给2个partition也可以，你还要根据你的机器的数量来决定

至于说副本因子，建议不要让业务方自己手动去设置，直接给一个默认的2个副本因子，提供一定的容错性就可以了

ZkUtils zk = ZkUtils.apply(“localhost:2181”, 30000, 30000, JaasUtils.ksZkSecurityEnabled());

AdminUtils.createTopic(
zk, 
“test01”, 5, 2, 
new Properties(), 
RackAwareMode.Enforced$.MODULE$);

此外，用户可以手动指定需要保留最近几天的数据，此时可以利用API动态修改一下那个topic级别的参数，比如就保留最近一天的数据，
当然前端页面可以限制一下最多只能设置保留14天的数据

Properties props = AdminUtils.fetchEntityConfig(zk, ConfigType.Topic(), “test01”);
props.put(“delete.retention.hour”, 24);
AdminUtils.changeTopicConfig(zk, “test01”, props);

接着如果用户想要删除topic，需要在web界面上提交一个申请，说明自己删除他的原因，比如某个业务不再需要这个topic里的数据了，
此时由kafka管理员在后台查看到这个申请，确认没问题，再点击确定可以删除

然后后台的java api可以执行删除topic的操作：AdminUtils.deleteTopic(“zk”, “test01”)

最后给大家留个小作业，自己去探索一下AdminUtils提供的API如何查询topic列表，以及如何查看某个topic的详细信息，这些都可以
展示在前端页面上，平时让业务方可以查看一下topic的信息

另外给大家说一下，大家可以想想，平时你在界面上希望看到自己的topic除了有哪些partition，还有partition的各个副本在哪些机器
上，ISR列表，还希望看到的是不是就是这个topic里的消息数量？

**有一个命令可以查看，大家看看：**

bin/kafka-run-class.sh kafka.tools.GetOffsetShell --broker-list localhost:9092 --topic test01 --time -1，

这个命令可以看到每个分区当前的最大位移

bin/kafka-run-class.sh kafka.tools.GetOffsetShell --broker-list localhost:9092 --topic test01 --time -2，

这个命令可以看到每个分区当前的最小位移

把上面两个命令的最大最小位移分别相减，就知道每个分区的消息数量了，之所以要相减，是因为消息会不断的被删除，所以不能光靠
最大位移判断消息数量

其实不光是脚本，他也是用的GetOffsetShell这个类，传入一些参数来做到的，大家也可以在java代码里尝试自己实现，都非常简单。
现在开源的kafka运维管理的平台也有，也可以直接基于他的来创建topic等等

