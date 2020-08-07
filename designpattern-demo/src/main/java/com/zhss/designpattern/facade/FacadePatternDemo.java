package com.zhss.designpattern.facade;

/**
 * Created by CTWLPC on 2018/8/28.
 */
public class FacadePatternDemo {

    public static void main(String[] args) {

        // 假设是子系统2
        SystemFacade systemFacade = new SystemFacade();
        systemFacade.execute();

        // 好处1：子系统2不需要care太多的模块，只要care一个门面类的接口就可以了
        // 好处2：如果多个地方都要调用这段逻辑，那么如果这个逻辑变了，只需要在门面类一个地方修改就可以了

    }

    /**
     * 创建一个子系统 1 的门面类
     */
    public static class SystemFacade{

        public void execute(){
            // 子系统1，封装了自己的多个模块，ABC，基于自己多个模块的功能，对外统一暴露出去一个功能
            ModuleA moduleA = new ModuleA();
            ModuleB moduleB = new ModuleB();
            ModuleC moduleC = new ModuleC();

            moduleA.execute();
            moduleB.execute();
            moduleC.execute();
            System.out.println("新增业务模块");

        }
    }

    public static class ModuleA {

        public void execute(){
            System.out.println("子系统 1 的模块 A 的功能");
        }

    }

    public static class ModuleB {

        public void execute(){
            System.out.println("子系统 1 的模块 B 的功能");
        }

    }

    public static class ModuleC {

        public void execute(){
            System.out.println("子系统 1 的模块 C 的功能");
        }

    }

}
