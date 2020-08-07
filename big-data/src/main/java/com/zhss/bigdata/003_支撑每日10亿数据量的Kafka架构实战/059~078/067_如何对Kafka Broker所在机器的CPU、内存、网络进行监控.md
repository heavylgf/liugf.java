
一般来说如果你要对类似kafka这种集群进行监控，建议采用开源的工具，kafka-manager，kafka eagle，都可以使用，人家都做好了会
通过图表的形式来展现出来你的broker所在机器的CPU、网络、磁盘、内存的一些负载

就是一个小的公司，也可以直接基于linux的命令进行监控

使用top命令就可以查看CPU的负载，使用free命令就可以查看内存的使用情况，使用iostat -d -x -k 1 5来查看磁盘的使用率

磁盘的使用率: df -lh 也可以

留个作业，自己去百度，linux查看磁盘负载，查看网络负载

用 netstat 查看 Linux 网络状况。
netstat -n | awk '/^tcp/ {++S[$NF]} END {for(a in S) print a, S[a]}'

运行这一句之后，显示的结果类似如下：
TIME_WAIT 27
FIN_WAIT1 435
FIN_WAIT2 89
ESTABLISHED 82
SYN_RECV 64
CLOSING 4
LAST_ACK 90
内容解释如下：
TIME-WAIT：等待足够的时间以确保远程TCP接收到连接中断请求的确认
FIN-WAIT-1：等待远程TCP连接中断请求，或先前的连接中断请求的确认
FIN-WAIT-2：从远程TCP等待连接中断请求
ESTABLISHED：代表一个打开的连接
SYN-RECV：再收到和发送一个连接请求后等待对方对连接请求的确认
SYN-SENT：再发送连接请求后等待匹配的连接请求
CLOSING：等待远程TCP对连接中断的确认
CLOSED：没有任何连接状态
CLOSE-WAIT：等待从本地用户发来的连接中断请求
LAST-ACK：等待原来的发向远程TCP的连接中断请求的确认
LISTEN：侦听来自远方的TCP端口的连接请求

