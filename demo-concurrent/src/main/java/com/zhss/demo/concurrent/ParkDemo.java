package com.zhss.demo.concurrent;

import java.util.concurrent.locks.LockSupport;

/**
 * LockSupport的操作
 * Created by CTWLPC on 2019/1/20.
 */
public class ParkDemo {

    public static void main(String[] args) {
        final Thread thread1 = new Thread() {

            public void run() {
                System.out.println("挂起之前执行的操作");
                // LockSupport的park操作，就是将一个线程进行挂起，不让你动了
                // 必须得有另外一个线程来对当前线程执行unpark操作，唤醒挂起的线程
                LockSupport.park();
                System.out.println("被唤醒之后执行的操作");
            }
        };
        thread1.start();

        Thread thread2 = new Thread() {

            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1000);
                        System.out.println("等待" + (i + 1) + "秒");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("尝试唤醒第一个线程");
                LockSupport.unpark(thread1);
            }
        };
        thread2.start();

    }

}
