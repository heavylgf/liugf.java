package com.zhss.demo.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * Created by CTWLPC on 2019/2/22.
 */
public class CountDownLatchDemo {

    public static void main(String[] args) throws Exception {
        final CountDownLatch latch = new CountDownLatch(2);

        // 线程1
        new Thread(){

            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    System.out.println("线程1开始执行，休眠1秒......");
                    Thread.sleep(1000);

                    System.out.println("线程1准备执行countDown操作......");
                    latch.countDown();
                    System.out.println("线程1完成执行countDown操作......");

                }catch (Exception e){
                    e.printStackTrace();
                }
            }

        }.start();

        // 线程2
        new Thread(){

            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    System.out.println("线程2开始执行，休眠1秒......");
                    Thread.sleep(1000);

                    System.out.println("线程2准备执行countDown操作......");
                    latch.countDown();
                    System.out.println("线程2完成执行countDown操作......");

                }catch (Exception e){
                    e.printStackTrace();
                }
            }

        }.start();

        System.out.println("main线程准备执行countDownLatch的await操作，将会同步阻塞等待......");
        latch.await();

        System.out.println("所有线程都完成countDown的操作，main线程的await阻塞等待结束");
    }

}
