
咱们来启动一个demo工程，在里面写写集合的代码，跟进去看看各种集合的实现原理，直接可以看JDK底层的源码

默认的构造函数，直接初始化一个ArrayList实例的话，会将内部的数组做成一个默认的空数组，{}，Object[]，他有一个默认的初始化的数组的大小的数值，是10，也就是我们可以认为他默认的数组初始化的大小就是只有10个元素

ArrayList的话，玩儿好的话，一般来说，你应该都不是使用这个默认的构造函数，你构造一个ArrayList的话，基本上来说就是默认他里面不会有太频繁的插入、移除元素的操作，大体上他里面有多少元素，你应该可以推测一下的

基本上最好是给ArrayList构造的时候，给一个比较靠谱的初始化的数组的大小，比如说，100个数据，1000,10000，避免数组太小，往里面塞入数据的时候，导致数据不断的扩容，不断的搞新的数组

 
ensureCapacityInternal(size + 1);  // Increments modCount!!

你每次往ArrayList中塞入数据的时候，人家都会判断一下，当前数组的元素是否塞满了，如果塞满的话，此时就会扩容这个数组，然后将老数组中的元素拷贝到新数组中去，确保说数组一定是可以承受足够多的元素的

（1）add()方法的源码

    public boolean add(E e) {
        ensureCapacityInternal(size + 1);  // Increments modCount!!
        elementData[size++] = e;
        return true;
    }

最开始：
elementData = []
size = 0

插入张三之后，会把第一个元素设置成张三，然后size++
element[0] = “张三”
size++

这个时候elementData数组就是如下：
elementData = [“张三”]
size = 1

插入李四之后
elementData[1] = “李四”
size++

这个时候elementData数组就是如下：
elementData = [“张三”, “李四”]
size = 2

elementData = [“张三”, “李四”, “王五”]
size = 3

（2）set()方法的源码

set(3, “赵六”) => 典型的数组越界

set(1, “赵六”)

E oldValue = elementData(index);
// 获取到了1这个位置的元素的值，李四

oldValue = “李四”

elementData[1] = “赵六”

elementData = [“张三”, “赵六”, “王五”]
返回了一个”李四”

（3）add(index, element)方法的源码

add(1, “麻子”)

index = 1
size = 3

System.arraycopy(elementData, index, elementData, index + 1, size - index);
System.arraycopy(elementData, 1, elementData, 2, 2);
size – index 相当于拷贝几个元素

你可以认为他这个方法的意思，就是说：elementeData这个数组，从第1位开始（第二个元素），拷贝2个元素，到elementData这个数组（还是原来的这个数组），从第2位开始（第三个元素开始）

执行完之后变成如下：
elementData = [“张三”, “赵六”, “赵六”, “王五”]

elementData[1] = “麻子”
elementData = [“张三”, “麻子”, “赵六”, “王五”]

size++
size = 4

（4）get()方法的源码

这个方法是最简单了，直接elementData[index]，基于数组直接定位到这个元素，获取这个元素，这个是ArrayList性能最好的一个操作，优点所在

（5）remove()方法的源码

remove(1)

size = 4
index = 1
elementData = [“张三”, “麻子”, “赵六”, “王五”]

int numMoved = size - index - 1;

numMoved = 4 - 1 - 1 = 2   //相当于，两个元素向前移动

相当于是不是要把后面的“赵六”和“王五”都要往前面挪动一位

System.arraycopy(elementData, index + 1, elementData, index, numMoved);
System.arraycopy(elementData, 2, elementData, 1, 2);

把elementData数组中，从index = 2开始的元素，一共有2个元素，拷贝到elementData数组中（原来的数组里），从index = 1开始，进行拷贝

// 拷贝完了之后如下：
elementData = [“张三”, “赵六”, “王五, “王五”]	

elementData[--size] = null
elementData[3] = null

elementData = [“张三”, “赵六”, “王五”]	
size = 3

（6）源码分析的总结

remove()
add(index, element)

这个两个方法，都会导致数组的拷贝，大量元素的挪动，性能都不是太高，基于数组来做这种随机位置的插入和删除，其实性能真的不是太高

add()、add(index, element)，这两个方法，都可能会导致数组需要扩容，数组长度是固定的，默认初始大小是10个元素，如果不停的往数组里塞入数据，可能会导致瞬间数组不停的扩容，影响系统的性能

set()、get()，定位到随机的位置，替换那个元素，或者是获取那个元素，这个其实还是比较靠谱的，基于数组来实现随机位置的定位，性能是很高的





