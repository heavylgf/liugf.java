package com.zhss.demo.concurrent;

/**
 * ThreadLocal：每个线程的本地副本
 * Created by CTWLPC on 2019/1/23.
 */
public class ThreadLocalDemo {

    public static void main(String[] args) {
        final ThreadLocal<Long> requestId = new ThreadLocal<Long>();
        final ThreadLocal<Long> txid = new ThreadLocal<Long>();

        new Thread(){

            public void run() {
                requestId.set(1L);
                txid.set(3L);
                System.out.println("线程1：" + requestId.get());
                System.out.println("线程3：" + txid.get());
            }

        }.start();

        new Thread(){

            public void run() {
                requestId.set(2L);
                System.out.println("线程2：" + requestId.get());
            }

        }.start();

    }

}
