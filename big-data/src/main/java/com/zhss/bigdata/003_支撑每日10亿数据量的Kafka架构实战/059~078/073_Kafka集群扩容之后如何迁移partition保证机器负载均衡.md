
vi topics-to-move.json

{“topics”: [{“topic”: “test01”}, {“topic”: “test02”}], “version”: 1} // 把你所有的topic都写在这里

bin/kafka-reassgin-partitions.sh --zookeeper hadoop03:2181,hadoop04:2181,hadoop05:2181 --topics-to-move-json-file 
topics-to-move.json --broker-list “5,6” --generate // 把你所有的包括新加入的broker机器都写在这里，
就会说是把所有的partition均匀的分散在各个broker上，包括新进来的broker

此时会生成一个迁移方案，可以保存到一个文件里去：expand-cluster-reassignment.json

bin/kafka-reassign-partitions.sh --zookeeper hadoop01:2181,hadoop02:2181,hadoop03:2181 --reassignment-json-file 
expand-cluster-reassignment.json --execute

bin/kafka-reassign-partitions.sh --zookeeper hadoop01:2181,hadoop02:2181,hadoop03:2181 --reassignment-json-file 
expand-cluster-reassignment.json --verify

这种数据迁移操作一定要在晚上低峰的时候来做，因为他会在机器之间迁移数据，非常的占用带宽资源



