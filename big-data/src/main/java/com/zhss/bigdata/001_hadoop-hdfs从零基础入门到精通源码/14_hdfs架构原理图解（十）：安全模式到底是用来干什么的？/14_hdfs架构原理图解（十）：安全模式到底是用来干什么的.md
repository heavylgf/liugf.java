
现在大家都学过了什么block拉，副本之类的东西，可以来看一个机制，叫做安全模式的了。这个安全模式的机制，是在namenode刚启动的时候，就会进入一个模式，叫做安全模式，safe mode，在这个模式下，hdfs集群是不会进行block的复制的

这个时候namenode会等着从各个datanode获取心跳和block report，然后看看集群里的整体的block情况，以及每个block有几个副本，默认是要有3个副本的。如果一个block有3个副本，那么就ok了，安全了

如果一定比例（80%）的block都是有足够的3个副本的，那么namenode就会退出安全模式，namenode一直处于safe mode状态下，就是因为没有达到一定的比例，block是足够的3个副本的，只有50%的block是有3个副本的

此时如果发现有某个block副本数量不够（比如只有2个副本）的，就指示datanode复制足够的副本数量，那么就ok了








