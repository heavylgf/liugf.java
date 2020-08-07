
ArrayList里面最关键的一块，就是如果数组填充满了以后，如何进行扩容

ensureCapacityInternal(size + 1);

假设我们现在用的是默认的一个数组的大小，也就是10，现在呢已经往这个数组中添加了10个元素了，此时数组的size = 10，capacity = 10

此时调用add()方法插入一个元素，插入第11个元素咯，肯定是插入不进去的

ensureCapacityInternal(11)

calculateCapacity(elementData, minCapacity)

elementData已经填充了10个元素了，minCapacity = 11

elementData.length是默认的值，其实就是10，也就是说默认的情况下，这个数组最多只能放10个元素

要放第11个元素，elementData.length，最多只能放10个，同时现在已经放了10个了，你现在是要放第11个元素，所以此时会对数组进行扩容 

// Grow()就是在扩容
private void grow(int minCapacity) {
    // overflow-conscious code
    int oldCapacity = elementData.length;
    int newCapacity = oldCapacity + (oldCapacity >> 1);
    if (newCapacity - minCapacity < 0)
        newCapacity = minCapacity;
    if (newCapacity - MAX_ARRAY_SIZE > 0)
        newCapacity = hugeCapacity(minCapacity);
    // minCapacity is usually close to size, so this is a win:
    elementData = Arrays.copyOf(elementData, newCapacity);
}


int newCapacity = oldCapacity + (oldCapacity >> 1);

oldCapacity = 10
oldCapacity >> 1 = oldCapacity / 2 = 5
newCapacity = 15

elementData = Arrays.copyOf(elementData, newCapacity);

数组扩容的时候，他是怎么扩的，老的大小 + 老的大小 >> 1（相当于除以2），实现了一个数组的拷贝

最新的数组，变成了可以容纳15个元素的数组，但是此时数组中只有10个元素

看完了这个JDK的源码，非常简单的，算扩容的新数组的大小，你就知道是怎么来计算的，搞一个新数组，Arrays.copyOf()工具方法，完成老数组到新数组的一个拷贝

ArrayList源码，其实大家就已经看完了

基于数组来玩儿，最大的问题就是不要频繁的往里面灌入大量的数据，导致频繁的数组的扩容，新老数组元素拷贝，中间的位置插入元素，删除元素，会导致大量的元素的移动

随机获取一个元素，get(10)操作，性能极高，他适合随机读，不适合大量频繁的写入以及插入
