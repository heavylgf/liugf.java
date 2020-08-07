package com.zhss.designpattern.adapter;

/**
 * 不用适配器设计模式的实现
 * <p>
 * 场景介绍：
 * （1）假设我们做了一个第一版的一个系统，这个系统里有一个接口和一个实现类
 * （2）接着我们开始做第二版的系统，这个系统我们定义了一个新的接口，和新的实现类
 * （3）但是我们同时在第二版的系统中，也要使用第一版系统中定义的那个老接口和老实现类
 * <p>
 * Created by CTWLPC on 2018/8/14.
 */
public class WithoutAdapterPatternDemo {

    public static void main(String[] args) {
        OldInterface oldInterface = new OldInterfaceImpl();
        NewInterface newInterface = new NewInterfaceImpl();
        oldInterface.oldExecute();
        newInterface.newExecute();

        // 如果不用任何设计模式，我们的问题在哪儿？
        // 问题其实很明显，就是说，我们的新的代码中，融合了新老两套接口，很麻烦的一个事情
        // 首先如果你这么干的话，就会导致代码很恶心，面向的是规范和风格完全不同的两套接口，你理解和维护的成本提高了
        // 其次，假如说，现在都不给你选择使用老版本接口的机会
        // 直接强制性公司规范要求按照新版本接口来走，你的老版本接口的实现类，就没法用了啊？
        // 难不成还要基于新版本的接口重新写一套？

    }

    /**
     * 老版本接口
     */
    public static interface OldInterface {

        void oldExecute();

    }

    /**
     *  老版本接口的实现类
     */
    public static class OldInterfaceImpl implements OldInterface {

        @Override
        public void oldExecute() {
            System.out.println("老版本接口实现的功能逻辑");
        }
    }

    /**
     * 新版本接口
     */
    public static interface NewInterface {

        void newExecute();

    }

    /**
     *  新版本接口的实现类
     */
    public static class NewInterfaceImpl implements NewInterface {

        @Override
        public void newExecute() {
            System.out.println("新版本接口实现的功能逻辑");
        }
    }

}
