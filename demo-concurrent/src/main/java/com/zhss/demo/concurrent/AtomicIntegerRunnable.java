package com.zhss.demo.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 实现Runnable方法来创建多线程
 * Created by CTWLPC on 2019/1/18.
 */
class MyThread implements Runnable {

    static AtomicInteger j = new AtomicInteger(0);

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            j.getAndIncrement();
        }
    }

};

public class AtomicIntegerRunnable {

    public static void main(String[] args) throws Exception {
        MyThread mt = new MyThread();

        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt);
        t1.start();
        t2.start();
        Thread.sleep(100);
        System.out.println(MyThread.j.get());
    }

}
