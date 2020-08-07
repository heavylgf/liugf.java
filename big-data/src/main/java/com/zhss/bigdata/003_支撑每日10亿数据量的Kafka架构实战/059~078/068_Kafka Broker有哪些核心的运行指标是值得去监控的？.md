
下面的JMX指标，都可以基于JConsole去连接到kafka的JMX端口来监控查看，也可以基于kafka自己提供的一个工具来监控

bin/kafka-run-class.sh kafka.tools.JmxTool --object-name kafka.server:type=BrokerTopicMetrics,name=BytesInPerSec 
--jmx-url service:jmx:rmi:///jndi/rmi://:9997/jmxrmi --date-format “YYYY-MM-dd HH:mm:ss” --attributes 
FifteenMinuteRate --reporting-interval 5000

上面的命令就是每隔5秒去监控过于15分钟的消息接收速率，kafka的JMX的指标，特别特别的多，官网去查一下，成百上千个JMX指标

（1）消息接收/发送速率：监控每个broker的负载压力

这个就是说leader broker接收消息的速率，以及follower broker接收消息的速率；还有就是leader broker发送给follower broker的
速率

kafka.server:type=BrokerTopicMetrics,name=BytesInPerSec,topic=test

（2）controller是否存活：监控controller是否存活

kafka.controller:type=KafkaController,name=ActiveControllerCount

（3）副本不足的分区数：某个分区的副本不足了

kafka.server:type=ReplicaManager,name=UnderReplicatedPartitions

（4）leader parttion在各个broker上的数量：确认集群的各个broker负载是均衡的

kafka.server:type=ReplicaManager,name=LeaderCount

（5）ISR变化速率：监控ISR不能变化太快

kafka.server:type=ReplicaManager,name=isExpandsPerSec
kafka.server:type=ReplicaManager,name=IsrShrinksPerSec

（6）Broker IO工作线程空闲率

kafka.server:type=KafkaRequestHandlerPool,name=RequestHandlerAvgIdlePercent

（7）Broker网络处理线程空闲率

kafka.network:type=SocketServer,name=NetworkProcessorAvgIdlePercent

这个JMX指标是非常非常多的，大家可以自己上官网去找，平时作为一个运维人员，需要经常对核心的一些指标看一看，这样你可以
对kafka集群当前的运行情况了解的很清晰，特别是在一些故障发生的时候


