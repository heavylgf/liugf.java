

kafka 0.9.x之后去掉了原来的replica.lag.max.messages参数，引入了一个新的replica.lag.time.max.ms参数，
默认值是10秒，这个就不按照落后的条数来判断了，而是说如果某个follower的LEO一直落后leader超过了10秒，那么才
判定这个follower是out-of-sync的

这样假如说线上出现了流量洪峰，一下子导致几个follower都落后了不少数据，但是只要尽快追上来，在10秒内别一直落后，
就不会认为是out-of-sync，这个机制在线上实践会发现效果要好多了


