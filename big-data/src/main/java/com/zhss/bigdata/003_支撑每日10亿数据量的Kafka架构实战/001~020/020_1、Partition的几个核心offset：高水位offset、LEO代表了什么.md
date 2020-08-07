
![](020_2、kafka高吞吐低延迟（零拷贝）%20(7).png)

实际上来说，每次leader接收到一条消息，都会更新自己的LEO，也就是log end offset，把最后一位offset + 1，这个大家都能理解吧？接着各个follower会从leader请求同步数据，这是持续进行的

offset = 0 ~ offset = 4，LEO = 5，代表了最后一条数据后面的offset，下一次将要写入的数据的offset，LEO，你一定要明白他的名词

然后follower同步到数据之后，就会更新自己的LEO

并不是leader主动推送数据给follower，他实际上是follower主动向leader尝试获取数据，不断的发送请求到leader来fetch最新的数据

然后对于接收到的某一条数据，所有follower的LEO都更新之后，leader才会把自己的HW（High Water Mark）高水位offset + 1，这个高水位offset表示的就是最新的一条所有follower都同步完成的消息

partition中最开始的一条数据的offset是base offset

LEO和HW分别是干什么的呢？

LEO很重要的一个功能，是负责用来更新HW的，就是如果leader和follower的LEO同步了，此时HW就可以更新

所有对于消费者来说，他只能看到base offset到HW offset之间的数据因为只有这之间的数据才表明是所有follower都同步完成的，这些数据叫做“已提交”的，也就是committed，是可以被消费到的

HW offset到LEO之间的数据，是“未提交的”，这时候消费者是看不到的

# HW offset表示的是当前已经提交的数据offset，LEO表示的是下一个要写入的数据的offset
