package com.zhss.service.eureka.javabase.variable;

import org.junit.Test;

import static org.junit.Assert.*;

public class VariableTest {

    String str = "hello world";  // 实例变量

    @Test
    public void method(){

        int i =0;  // 局部变量
        i = 1 + 7;

        System.out.println("i的值是：" + i );
        System.out.println("str：" + str );

    }

}