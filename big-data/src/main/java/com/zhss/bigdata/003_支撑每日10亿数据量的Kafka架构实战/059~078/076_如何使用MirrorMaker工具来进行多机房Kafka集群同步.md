
其实对很多一般公司来说，甚至说说话很多大公司来说，都不一定会做Kafka集群多机房，但是如果你要做的话，有可能是某些2B类的
大数据公司，会做Kafka集群多机房，也就是在不同的机房里搞多个kafka集群

互相之间要实现数据同步，这样就实现了多机房灾备，如果一个机房都挂了，另外一个机房的kafka集群可以立马顶上去，但是你要知道
这个东西的成本极高，我们还是讲一下Kafka在这里一个工具

consumer.properties

bootstrap.servers=localhost:9092
client.id=multi.datacenter.sync.consumer
group.id=multi.datacenter.sync.consumer.group
partition.assignment.strategy=org.apache.kafka.clients.consumer.RoundRobinAssignor

producer.properties

bootstrap.servers=localhost:9092
client.id=multi.datacenter.sync.producer

bin/kafka-mirror-maker.sh --consumer.config consumer.properties --producer.config producer.properties --whitelist test01

可以搞多份consumer和producer的配置，把client.id设置为不一样的，这样就可以启动多个mirror-maker来进行数据同步了，他其实
就是消费某个topic的数据来写入到另外一个集群里去罢了
