package com.zhss.demo.concurrent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLock的锁
 * Created by CTWLPC on 2019/1/19.
 */
public class ReentractLockDemo {

    static int data = 0;
    static ReentrantLock lock = new ReentrantLock();
    // 公平锁
//    static ReentrantLock lock1 = new ReentrantLock(true);
    static Condition condition = lock.newCondition();

    public static void main(String[] args) throws Exception {
        new Thread() {

            public void run() {
//                for (int i = 0; i < 10; i++) {
                    lock.lock();
//                    try {
//                        // 尝试等待10秒，超过时间就不尝试加锁了
//                        Boolean result = lock.tryLock(10, TimeUnit.SECONDS);
//                        if (result) {
//                            lock.unlock();
//                        }else {
//                            // 代表加锁失败
//                        }
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    ReentractLockDemo.data++;
//                    System.out.println(ReentractLockDemo.data);
                    System.out.println("第一个线程加锁");
                    try {
                        // await 之后，线程会陷入阻塞
                        System.out.println("第一个线程释放锁以及阻塞等待");
                        condition.await();
                        System.out.println("第一个线程重新获取到锁");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    lock.unlock();
                    System.out.println("第一个线程释放锁");
//                }
            };

        }.start();

        Thread.sleep(1000);

        new Thread() {

            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    lock.lock();
//                    ReentractLockDemo.data++;
//                    System.out.println(ReentractLockDemo.data);
//                    lock.unlock();
//                }
                lock.lock();
                System.out.println("第二个线程加锁");
                System.out.println("第二个线程唤醒第一个线程");
                condition.signal();
                lock.unlock();
                System.out.println("第二个线程释放锁");
            };

        }.start();

    }

}
