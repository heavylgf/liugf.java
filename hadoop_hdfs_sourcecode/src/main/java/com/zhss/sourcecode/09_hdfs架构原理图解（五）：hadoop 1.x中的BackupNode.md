
09_hdfs架构原理图解（五）：hadoop 1.x中的BackupNode

    这个backup node其实也是在hadoop 1.x提供的一种机制，他的思路其实就是优化和替代掉checkpoint node的那种下载
fsimage和edits之后进行合并的思路

    backup node的思路，其实就是在内存里维护一份和namenode一模一样的fsimage数据，同时还接收namenode发送过来的edits log
数据流，获取到的edits log数据流，每次获取到一条就会往自己本地磁盘的edits log文件里写一条

    而且同时还会直接将edits log变更应用到自己内存的fsimage里去，这样就在内存中保存了一份和namenode一模一样的元数据了

    然后这个backup node会定时进行checkpoint操作的，说白了就是直接将内存里的fsimage数据直接写一份到磁盘文件里去覆盖之前
的那份老的fsimage文件，然后清空edits log不就得了

    一个namenode只能挂载一个backupnode，而且一旦使用了backupnode，就不能使用checkpoint node了

    其实用backup node，最好的一点，就是不用让namenode自己本地维护一份edits log文件了，自己不用写磁盘了，
直接namenode就是内存里一份fsimage数据，然后每次接收到一条元数据修改操作，就应用到自己内存里，然后发送一个edtis log
数据流给backup node不就得了

    backup node其实就是在负责磁盘上保存fsimage和edits log文件，而且定期进行checkpoint操作，如果要让namenode不要持久
化fsimage和edits log文件，只要将dfs.namenode.edits.dir参数设置为空的就可以了

    然后每次namenode重启的时候，要用-importCheckpoint指令，从其他地方去加载fsimage数据到自己内存中来，
dfs.namenode.name.dir指定一个目录，这个目录必须是空目录，然后指定一个dfs.namenode.checkpoint.dir专门用来加载fsimage文件，
然后启动namenode，使用-importCheckpoint就行了

    那么这个fsimage从哪儿来呢？其实就从backup node那儿不就可以拿到了，是不是

    但是说实话，这都是hadoop 1.x的策略了，现在hadoop 2.x时代，甚至都快进入hadoop 3.x时代了，早就不这么玩儿了




