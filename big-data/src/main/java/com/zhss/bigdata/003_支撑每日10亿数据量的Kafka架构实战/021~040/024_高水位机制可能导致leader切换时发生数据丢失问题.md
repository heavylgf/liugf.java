
基于之前说的高水位机制，可能会导致一些问题，比如数据丢失

假如说生产者的min.insync.replicas设置为1，这个就会导致说生产者发送消息给leader，leader写入log成功后，生产者就会认为写成功了，
此时假设生产者发送了两条数据给leader，leader写成功了

此时leader的LEO = 1，HW = 0，因为follower还没同步，HW肯定是0

接着follower发送fetch请求，此时leader发现follower LEO = 0，所以HW还是0，给follower带回去的HW也是0，然后follower开始同步
数据也写入了两条数据，自己的LEO = 1，但是HW = 0，因为leader HW为0

接着follower再次发送fetch请求过来，自己的LEO = 1，leader发现自己LEO = 1，follower LEO = 1，所以HW更新为1，同时会把
HW = 1带回给follower，但是此时follower还没更新HW的时候，HW还是0

这个时候假如说follower机器宕机了，重启机器之后，follower的LEO会自动被调整为0，因为会依据HW来调整LEO，而且自己的那两条数据
会被从日志文件里删除，数据就没了

这个时候如果leader宕机，就会选举follower为leader，此时HW = 0，接着leader那台机器被重启后作为follower，这个follower会从
leader同步HW是0，此时会截断自己的日志，删除两条数据

这种场景就会导致数据的丢失

非常极端的一个场景，数据可能会莫名其妙的丢失


