package com.zhss.demo.concurrent;

import java.util.Date;
import java.util.PriorityQueue;

/**
 * Created by CTWLPC on 2019/1/14.
 */
public class ThreadUnsafeDemo {

    private static int data = 0;

    public static void main(String[] args) throws Exception {
        // 创建一个实例变量
        final ThreadUnsafeDemo demo = new ThreadUnsafeDemo();

        Thread thread1 = new Thread(){

            @Override
            public void run() {
                for (int i = 0; i < 10; i++){
                    // 方法：
//                    ThreadUnsafeDemo.data++;
//                    System.out.println(data);
                    // 方法：调用静态方法，对静态方法进行加锁
//                    increment();
                    // 方法：对类进行加锁
//                    synchronized (ThreadUnsafeDemo.class){
//                        ThreadUnsafeDemo.data++;
//                        System.out.println(data);
//                    }
                    // 方法：调用对象的非静态方法
//                    demo.increment1();
                    // 方法：对对象进行加锁
                    synchronized (demo){
                        ThreadUnsafeDemo.data++;
                        System.out.println(data);
                    }

                }
            }
        };
        thread1.start();

        Thread thread2 = new Thread(){

            @Override
            public void run() {
                for (int i = 0; i < 10; i++){
//                    ThreadUnsafeDemo.data++;
//                    System.out.println(data);
//                    increment();
//                    synchronized (ThreadUnsafeDemo.class){
//                        ThreadUnsafeDemo.data++;
//                        System.out.println(data);
//                    }
//                    demo.increment1();
                    synchronized (demo){
                        ThreadUnsafeDemo.data++;
                        System.out.println(data);
                    }
                }
            }
        };
        thread2.start();

        // 等待thread1和thread2两个线程执行结束
        thread1.join();
        thread2.join();
    }

    private synchronized static void increment(){
        ThreadUnsafeDemo.data++;
        System.out.println(data);
    }

    private synchronized void increment1(){
        ThreadUnsafeDemo.data++;
        System.out.println(data);
    }

    // this 其实相当于对当前实例进行加锁
    // 代表上面的demo的对象
    private void increment2(){
        synchronized(this){
            ThreadUnsafeDemo.data++;
            System.out.println(data);
        }
    }

}
