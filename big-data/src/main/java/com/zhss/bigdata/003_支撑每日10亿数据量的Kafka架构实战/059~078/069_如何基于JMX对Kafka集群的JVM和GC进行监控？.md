
kafka他的设计理念就是不要过度的依赖于通过jvm内存来进行数据管理，避免说过多的数据驻留在kafka jvm内存里面，会导致过多的gc

java.lang:type=GarbageCollector,name=G1 Old Generation
java.lang:type=GarbageCollector,name=G1 Young Generation

就是对垃圾回收进行监控
