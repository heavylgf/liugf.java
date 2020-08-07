
![](025_2、kafka高吞吐低延迟（零拷贝）%20(11).png)


假设min.insync.replicas = 1，那么只要leader写入成功，生产者而就会认为写入成功

如果leader写入了两条数据，但是follower才同步了一条数据，第二条数据还没同步，假设这个时候leader HW = 2，follower HW = 1，
因为follower LEO小于leader HW，所以follower HW取自己的LEO

这个时候如果leader挂掉，切换follower变成leader，此时HW = 1，就一条数据，然后生产者又发了一条数据给新leader，此时HW变为2，
但是第二条数据是新的数据。接着老leader重启变为follower，这个时候发现两者的HW都是2

所以他们俩就会继续运行了

这个时候他们俩数据是不一致的，本来合理的应该是新的follower要删掉自己原来的第二条数据，跟新leader同步的，让他们俩的数据一致，
但是因为依赖HW发现一样，所以就不会截断数据了




