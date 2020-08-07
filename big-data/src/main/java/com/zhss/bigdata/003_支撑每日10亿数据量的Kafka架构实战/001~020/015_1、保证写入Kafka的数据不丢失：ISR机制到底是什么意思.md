
![](015_2、kafka高吞吐低延迟（零拷贝）%20(4).png)

光是依靠多副本机制能保证Kafka的高可用性，但是能保证数据不丢失吗？不行，因为如果leader宕机，但是leader的数据还没同步到follower上去，
此时即使选举了follower作为新的leader，当时刚才的数据已经丢失了

ISR是：in-sync replica，就是跟leader partition保持同步的follower partition的数量，只有处于ISR列表中的follower才可以在leader
宕机之后被选举为新的leader，因为在这个ISR列表里代表他的数据跟leader是同步的

如果要保证写入kafka的数据不丢失，首先需要保证ISR中至少有一个follower，其次就是在一条数据写入了leader partition之后，要求必须复制
给ISR中所有的follower partition，才能说代表这条数据已提交，绝对不会丢失，这是Kafka给出的承诺



