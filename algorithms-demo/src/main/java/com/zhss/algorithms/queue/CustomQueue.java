package com.zhss.algorithms.queue;

/**
 * 使用数组自定义循环队列
 *
 * 队列是一个有序列表，可以用数组或是链表来实现
 * 遵循先入先出的原则（FIFO）。即：先存入队列的数据，要先取出。后存入的要后取出
 *
 * 循环队列需要3个参数，head, tail, count
 * 1.队列初始化时，head和tail值都为零。
 * 2.count 用来记录队列中元素的个数
 *
 * @Author: liugf
 * @Date: 2020/9/22 上午10:15
 */
public class CustomQueue {

    public static void main(String[] args) throws Exception {
        ArrayQueue arrayQueue = new ArrayQueue<Integer>();
        // 队列中添加数据
        arrayQueue.enqueue(10);
        arrayQueue.enqueue(20);
        arrayQueue.enqueue(30);
        arrayQueue.enqueue(40);
        arrayQueue.enqueue(50);

        // 输出队列
        arrayQueue.printQueue();

        // 出队列
        System.out.println("出队列的值：" +  arrayQueue.dequeue());
        System.out.println("出队列的值：" +  arrayQueue.dequeue());
        System.out.println("出队列的值：" +  arrayQueue.dequeue());

        System.out.println("----------");

        arrayQueue.printQueue();

        arrayQueue.enqueue(60);
//        System.out.println("出队列的值：" +  arrayQueue.dequeue());
//        System.out.println("出队列的值：" +  arrayQueue.dequeue());
//        System.out.println("出队列的值：" +  arrayQueue.dequeue());
//        System.out.println("出队列的值：" +  arrayQueue.dequeue());

        System.out.println("----------");
        arrayQueue.printQueue();

    }

}

    class ArrayQueue<T> {
        // 数组初始化大小
        int initSize = 5;
        // 定义数组, 用来存储数据
        // 定义数组变量
        T[] arr = (T[])new Object[initSize];

//        List<T> arr = new ArrayList<T>(initSize);

        // 队头(出队的时候, 这个位置的元素出去)
        int head = 0;
        // 表示队列下一个元素的位置(入队的时候, 新的元素放在这个位置)
        int tail = 0;
        // 队列中元素的个数 (用来判断队列是否为空, 或者满了)
        int count = 0;

        // 判断队列是否为空
        public boolean isEmpty() {
            return count == 0;
        }

        // 表示队列已经满了
        public boolean isFull(){
            return count == initSize;
        }

        // 入队
        public void enqueue(T element) throws Exception {
            // 1. 判断队列是否满了, 如果已经满了, 则无法入队
            if(isFull()) {
                throw new Exception("队里已满, 无法添加元素!");
            }

            // 2. 如果没有满, 则入队. 把新入队的元素放在tail的位置
            arr[tail] = element;

            // 2.2 tail应该更新(tail + 1)
            tail += 1;
            // 2.3 队列中元素的个数也要+1
            count += 1;

            // 已经到最后一个位置, 那下次的元素去数组头部
            if (tail == initSize) {
                tail = 0;
            }

        }

        // 出队, 并返回出队的值
        public T dequeue() throws Exception {
            // 1. 判断队列是否空
            if (isEmpty()) {
                throw new Exception("队里为空, 无法出队!");
            }

            // 2. 把队头的位置出去
            T result = arr[head];
            head += 1;
            // 总数减1
            count -= 1;

            if (head == initSize) {
                head = 0;
            }

            return result;

        }

        // 输出队列
        public void printQueue() {
            int temp = head;
            for(int i = 0; i < count; i++){
                System.out.println("输出队列的值为：" + arr[temp]);
                temp += 1;
                if (temp == initSize) {
                    temp = 0;
                }
            }
        }

    }


