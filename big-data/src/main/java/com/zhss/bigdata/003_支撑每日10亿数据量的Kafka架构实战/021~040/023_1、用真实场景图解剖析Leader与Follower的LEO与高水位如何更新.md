
![](023_2、kafka高吞吐低延迟（零拷贝）%20(10).png)

假设leader收到第一条数据，此时leader LEO = 1，HW = 0，因为他发现其他follower的LEO也是0，所以HW必须是0

接着follower来发送fetch请求给leader同步数据，带过去follower的LEO = 0，所以leader上维护的follower LEO = 0，更新了一下，
此时发现follower的LEO还是0，所以leader的HW继续是0

接着leader发送一条数据给follower，这里带上了leader的HW = 0，因为发现leader的HW = 0，此时follower LEO更新为1，
但是follower HW = 0，取leader HW

接着下次follower再次发送fetch请求给leader的时候，就会带上自己的LEO = 1，leader更新自己维护的follower LEO = 1，
此时发现follower跟自己的LEO同步了，那么leader的HW更新为1

接着leader发送给follower的数据里包含了HW = 1，此时follower发现leader HW = 1，自己的LEO = 1，此时follower的HW有更新为1

5个数据：全部都要往前推进更新，需要2次请求，第一次请求是仅仅是更新两边的LEO，第二次请求是更新另外leader管理的follower LEO，
以及两个HW
