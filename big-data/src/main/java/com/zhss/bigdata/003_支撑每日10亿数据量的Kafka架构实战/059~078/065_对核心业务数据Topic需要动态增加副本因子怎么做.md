
如果对核心业务数据需要增加副本因子

{“version”:1,”partitions”:[{“topic”:”test01”,”partition”:0,”replicas”:[0,1,2]},{“topic”:”test01”,”
partition”:1,”replicas”:[0,1,2]},{“topic”:”test01”,”partition”:2,”replicas”:[0,1,2]}]}

bin/kafka-reassign-partitions.sh --zookeeper localhost:2181 --reassignment-json-file increase-replication-factor.json 
--execute

bin/kafka-reassign-partitions.sh --zookeeper --reassignment-json-file increase-replication-factor.json --verify
