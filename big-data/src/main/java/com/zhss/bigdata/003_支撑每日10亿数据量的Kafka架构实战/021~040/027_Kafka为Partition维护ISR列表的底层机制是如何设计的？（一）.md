


很多公司比较常用的一个kafka的版本，是0.8.2.x系列，这个系列的版本是非常经典的，在过去几年相当大比例的公司都是用这个版本的kafka。
当然，现在很多公司开始用更新版本的kafka了，就是0.9.x或者是1.x系列的

我们先说说在0.9.x之前的版本里，这个kafka到底是如何维护ISR列表的，什么样的follower才有资格放到ISR列表里呢？

在之前的版本里，有一个核心的参数：replica.lag.max.messages。这个参数就规定了follower如果落后leader的消息数量超过了这个
参数指定的数量之后，就会认为follower是out-of-sync，就会从ISR列表里移除了

咱们来举个例子好了，假设一个partition有3个副本，其中一个leader，两个follower，然后replica.lag.max.messages = 3，
刚开始的时候leader和follower都有3条数据，此时HW和LEO都是offset = 2的位置，大家都同步上来了

现在来了一条数据，leader和其中一个follower都写入了，但是另外一个follower因为自身所在机器性能突然降低，导致没及时去同步数据，
follower所在机器的网络负载、内存负载、磁盘负载过高，导致整体性能下降了，此时leader partition的HW还是offset = 2的位置，
没动，但是LEO变成了offset = 3的位置

依托LEO来更新ISR的话，在每个follower不断的发送Fetch请求过来的时候，就会判断leader和follower的LEO相差了多少，如果差的数量
超过了replica.lag.max.messages参数设置的一个阈值之后，就会把follower给踢出ISR列表

但是这个时候第二个follower的LEO就落后了leader才1个offset，还没到replica.lag.max.messages = 3，所以第二个follower实际
上还在ISR列表里，只不过刚才那条消息没有算“提交的”，在HW外面，所以消费者是读不到的

而且这个时候，生产者写数据的时候，如果默认值是要求必须同步所有follower才算写成功的，可能这个时候会导致生产者一直卡在那儿，
认为自己还没写成功，这个是有可能的

一共有3个副本，1个leaderr，2个是follower，此时其中一个follower落后，被ISR踢掉了，ISR里还有2个副本，此时一个leader和另外
一个follower都同步成功了，此时就可以让那些卡住的生产者就可以返回，认为写数据就成功了

min.sync.replicas = 2，ack = -1，生产者要求你必须要有2个副本在isr里，才可以写，此外，必须isr里的副本全部都接受到数据，
才可以算写入成功了，一旦说你的isr副本里面少于2了，其实还是可能会导致你生产数据被卡住的

假设这个时候，第二个follower fullgc持续了几百毫秒然后结束了，接着从leader同步了那条数据，此时大家LEO都一样，而且leader发现
所有follower都同步了这条数据，leader就会把HW推进一位，HW变成offset = 3

这个时候，消费者就可以读到这条在HW范围内的数据了，而且生产者认为写成功了

但是要是此时follower fullgc一直持续了好几秒钟，此时其他的生产者一直在发送数据过来，leader和第一个follower的LEO又推进了2位，
LEO offset = 5，但是HW还是停留在offset = 2，这个时候HW后面的数据都是消费不了的，而且HW后面的那几条数据的生产者可能都会认为
写未成功

现在导致第二个follower的LEO跟leader的LEO差距超过3了，此时触发阈值，follower认为是out-of-sync，就会从ISR列表里移除了

一旦第二个follower从ISR列表里移除了，世界清静了，此时ISR列表里就leader和第一个follower两个副本了，此时leader和第一个
follower的LEO都是offset = 5，是同步的，leader就会把HW推进到offset = 5，此时消费者就可以消费全部数据了，生产者也认为
他们的写操作成功了

那如果第二个follower后来他的fullgc结束了，开始大力追赶leader的数据，慢慢LEO又控制在replica.lag.max.messages限定的范围
内了，此时follower会重新加回到ISR列表里去

上面就是ISR的工作原理和机制，一般导致follower跟不上的情况主要就是以下三种：

（1）follower所在机器的性能变差，比如说网络负载过高，IO负载过高，CPU负载过高，机器负载过高，都可能导致机器性能变差，同步 过慢，
这个时候就可能导致某个follower的LEO一直跟不上leader，就从ISR列表里移除了


（2）follower所在的broker进程卡顿，常见的就是fullgc问题

（3）kafka是支持动态调节副本数量的，如果动态增加了partition的副本，就会增加新的follower，此时新的follower会拼命从leader上
同步数据，但是这个是需要过程的，所以此时需要等待一段时间才能跟leader同步

replica.lag.max.messages主要是解决第一种情况的，还有一个replica.lag.time.max.ms是解决第二种情况的，比如设置为500ms，
那么如果在500ms内，follower没法送请求找leader来同步数据，说明他可能在fullgc，此时就会从ISR里移除




