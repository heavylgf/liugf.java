
![](04_hdfs整体架构原理(6).png)

所以如果是hadoop 2.x的双实例HA机制里面，checkpoint是怎么执行的呢？

其实在standy namenode上，会运行一个CheckpointerThread后台线程，他默认是要么1小时一次，要么是有100万条edits log没有合并到fsimage去了，此时就会执行一个checkpoint操作

他执行checkpoint其实非常简单的，因为这个standby namenode有点儿像是hadoop 1.x中的backup node，所以说其实就是将内存中最新的那份fsimage写到磁盘文件上的fsimage文件里去，同时清空掉edits log不就得了

然后会将最新的fsimage文件发送到active namenode上去覆盖之前旧的fsimage，同时将active namenode的edtis logs给清空掉，不就ok了么





