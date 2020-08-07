package com.zhss.designpattern.singleton;

/**
 * Created by CTWLPC on 2018/8/28.
 * 内部类的实现才是保证线程最安全的
 */
public class TestSingleton {

    private TestSingleton(){

    }

    public static class InnerHolder{

        public static final TestSingleton instance = new TestSingleton();

    }

    public  static TestSingleton getInstance(){
        return InnerHolder.instance;
    }


}
