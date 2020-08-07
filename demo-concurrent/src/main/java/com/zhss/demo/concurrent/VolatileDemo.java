package com.zhss.demo.concurrent;

/**
 * volatile 案例
 * Created by CTWLPC on 2019/1/12.
 */
public class VolatileDemo {
    // 加了volatile和不加的效果肯定是不一样的
    // static volatile int flag = 0;
    static int flag = 0;

    public static void main(String[] args) {
        new Thread() {

            public void run() {
                int localFlag = flag;
                while (true) {
                    // 在这个线程里，读到的一直都是flag的旧的值
                    // 读到的都是flag= 0 的值，没感觉到人家的值的变化和增加
                    if (localFlag != flag) {
                        System.out.println("读取到了修改后的标志位：" + flag);
                        localFlag = flag;
                    }
                }
            }

            ;

        }.start();

        new Thread() {

            public void run() {
                int localFlag = flag;
                while (true) {
                    System.out.println("标志位被修改为了：" + ++localFlag);
                    // 这个flag的值在不断的被修改
                    // 每秒钟，都会把这个flag的值给++，加1这样子
                    flag = localFlag;
                    try {
//                        TimeUnit.SECONDS.sleep(2);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            ;

        }.start();

    }
}
