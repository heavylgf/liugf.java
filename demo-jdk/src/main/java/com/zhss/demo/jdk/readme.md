2018-10-31

**jdk源码剖析**
------------------

**MyArrayList:**

    手写ArrayList底层源码

**MyLinkedList**

    手写LinkedList底层源码

****ArrayList：****

**LinkedList：**

****HashMap：****

1、HashMap源码剖析（六）：JDK 1.8引入红黑树优化hash冲突
    如果说出现大量的hash冲突之后，假设某给位置挂的一个链表特别的长，
就很恶心了，如果链表长度太长的话，会导致有一些get()操作的时间复杂度就是O(n)，
正常来说，table[i]数组索引直接定位的方式的话是O(1)。但是如果链表，大量的key冲突，
会导致get()操作，性能急剧下降，导致很多的问题
    所以说JDK 1.8以后人家优化了这块东西，会判断，如果链表的长度达到8的时候，那么
就会将链表转换为红黑树，如果用红黑树的话，get()操作，即使对一个很大的红黑树进行二
叉查找，那么时间复杂度会变成O(logn)，性能会比链表的O(n)得到大幅度的提升
    链表转红黑树是怎么搞的？
    
    
HashMap源码剖析（七）：通过红黑树来解决hash冲突

HashMap源码剖析（八）：基于数组的扩容原理图解

HashMap源码剖析（九）：JDK 1.8的高性能rehash算法
    JDK 1.8以后hash寻址这块，统一都是用的这个位操作

HashMap源码剖析（十）：get与remove操作的原理分析
