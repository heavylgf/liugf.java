package com.zhss.javabase.variable;

public class Variable {

    /**
     * 类变量：独立于方法之外的变量，用 static 修饰。
     * 实例变量：独立于方法之外的变量，不过没有 static 修饰。
     * 局部变量：类的方法中的变量。
     */
    static int allClicks = 0;    // 类变量

    String str = "hello world";  // 实例变量

    public void method(){

        int i =0;  // 局部变量
        i = 1 + 7;

        System.out.println("i的值是：" + i );
        System.out.println("str：" + str );

    }

}