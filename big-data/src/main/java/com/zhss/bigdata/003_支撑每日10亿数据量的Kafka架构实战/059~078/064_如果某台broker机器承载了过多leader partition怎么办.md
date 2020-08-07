
现在各个业务方可以自行申请创建topic，分区数量都是自动分配和后续动态调整的，kafka本身会自动把leader partition均匀分散在
各个机器上，这样可以保证每台机器的读写吞吐量都是均匀的

但是也有例外，那就是如果某些broker宕机，会导致leader partition过于集中在其他少部分几台broker上，这会导致少数几台broker
的读写请求压力过高，其他宕机的broker重启之后都是follower partition，读写请求很低，造成集群负载不均衡

有一个参数，auto.leader.rebalance.enable，默认是true，每隔300秒（leader.imbalance.check.interval.seconds）会执行一次
preferred leader选举，如果一台broker上的不均衡的leader超过了10%，leader.imbalance.per.broker.percentage，就会对这个
broker进行选举

也可以手动执行，bin/kafka-preferred-replica-election.sh，但是不建议手动执行，让他自动执行就好了

topic创建自助的，分区扩容自动的，leader partition均匀分散也是自动的

