package com.zhss.demo.concurrent;

/**
 * Created by CTWLPC on 2019/1/13.
 */
public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton instance;

    // java 技术比较好的人
    // 懂volatile底层原理的话，就知道。多线程访问一个共享资源的话，首先第一个问题
    // 就是一个共享变量的可见性问题
    // 我
    public DoubleCheckSingleton getInstance() {
        if (instance == null) {
            // 多个线程会卡在这里
            synchronized (DoubleCheckSingleton.class) {
                // 有一个线程先进来，发现是null
                // 第二个线程进来了，此时如果没有这个double check的判断的话
                // 然后就会导致再次创建一遍
                if (instance == null) {
                    // 创建一个单例
                    DoubleCheckSingleton.instance = new DoubleCheckSingleton();
                }
            }
            // 这时候第一个线程出来
            // 这个时候第二个线程进入if (instance == null)
            // 此时如果没有这个double check的判断的话，然后会导致他再次创建一遍实例
        }
        return instance;
    }

}
