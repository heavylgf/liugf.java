package com.zhss.demo;

/**
 * Created by CTWLPC on 2019/1/10.
 */
public class ThreadTest {

    public static void main(String[] args) {

        // 线程的优先级：
        // main线程的优先级：5 ，这个是默认的优先级
        System.out.println(Thread.currentThread().getName() + "线程的优先级："
                + Thread.currentThread().getPriority());

        // 线程的线程组：
        // main线程的线程组是：java.lang.ThreadGroup[name=main,maxpri=10]
        System.out.println(Thread.currentThread().getName() + "线程的线程组是："
                + Thread.currentThread().getThreadGroup());


    }

}
