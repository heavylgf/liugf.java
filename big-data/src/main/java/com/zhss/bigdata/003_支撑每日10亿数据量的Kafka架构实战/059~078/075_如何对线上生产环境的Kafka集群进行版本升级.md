
第一步，在所有的broker的server.properties中填写当前的版本号，比如：

inter.broker.protocol.version=0.10.0
log.message.format.version=0.10.0

第二步，在每台机器上都用新版本（比如0.10.2.0）的kafka代码替换老版本的kafka代码，然后依次重启每台机器上的broker

第三步，更新上述两个版本号为0.10.2

第四步，再次在各个机器上重启broker即可

这个过程中可能会导致消息的**重复消费**，因为可能某个消息没法成功的提交offset消费记录到broker，
所以会导致broke给消费者重复消费某个消息

