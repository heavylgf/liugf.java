


kafka的消息格式如下：

crc32，magic，attribute，时间戳，key长度，key，value长度，value

kafka是直接通过NIO的ByteBuffer以二进制的方式来保存消息的，这种二级制紧凑保存格式可以比使用Java对象保存消息要节约40%的内存空间

然后这个消息实际上是封装在一个log entry里的，你可以认为是一个日志条目吧，在kafka里认为每个partition实际上就是一个磁盘上的日志文件，
写到parttion里去的消息就是一个日志，所以log entry就是一个日志

这个日志条目包含了一个offset，一个消息的大小，然后是消息自身，就是上面那个数据结构，但是这里要注意的一点，就是这个message里可能会包含
多条消息压缩在一起，所以可能找一条消息，需要从这个压缩数据里遍历搜索

而且这里还有一个概念就是消息集合，一个消息集合里包含多个日志，最新名称叫做RecordBatch

后来消息格式演化为了如下所示：

（1）消息总长度
（2）属性：废弃了，已经不用
（3）时间戳增量：跟RecordBatch的时间戳的增量差值
（4）offset增量：跟RecordBatch的offset的增量差值
（5）key长度
（6）key
（7）value长度
（8）value
（9）header个数
（10）header：自定义的消息元数据，key-value对

通过时间戳、offset、key长度等都用可变长度来尽可能减少空间占用，v2版本的数据格式比v1版本的数据格式要节约很多磁盘开销
