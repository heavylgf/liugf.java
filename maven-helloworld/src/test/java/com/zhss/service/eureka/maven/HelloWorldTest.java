package com.zhss.service.eureka.maven;

import com.zhss.maven.HelloWorld;
import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void sayHello() {
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.sayHello("leo");
//        assertEquals("hello, leo", result);
        System.out.println("hello, leo   " + result);
    }

}