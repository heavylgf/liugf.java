package com.zhss.designpattern.adapter;

/**
 * Created by CTWLPC on 2018/8/14.
 * 适配器模式
 */
public class AdapterPatterDemo {

    public static void main(String[] args) {
        NewInterfaceAdapter newInterfaceAdapter = new NewInterfaceAdapter(new OldInterfaceImpl());
        NewInterface newInterface = new NewInterfaceImpl();
        newInterfaceAdapter.newExecute();
        newInterface.newExecute();

        // 适配器模式
        // 就是你手上有新老俩接口和一个老接口的实现类
        // 但是现在系统中要面向新接口来开发，老接口的实现类就不能直接用了，不能直接面向老接口来开发
        // 开发一个老接口到新接口的一个适配器
        // 适配器是实现了新接口的，但是适配器中持有老接口实现类实例的引用
        // 适配器的新接口方法的实现，全部基于老接口实现类的老方法来实现即可
        // 对于调用方而言，只要使用适配器来开发即可，就可以通过面向新接口开发，底层使用老接口实现类
    }

    /**
     * 定义一个适配器类去掉用老版本的接口
     */
    public static class NewInterfaceAdapter implements NewInterface{

        private OldInterface oldObject;

        public NewInterfaceAdapter(OldInterface oldObject) {
            this.oldObject = oldObject;
        }

        public OldInterface getOldObject() {
            return oldObject;
        }

        public void setOldObject(OldInterface oldObject) {
            this.oldObject = oldObject;
        }

        @Override
        public void newExecute() {
            oldObject.oldExecute();
        }
    }

    /**
     * 老版本接口
     */
    public static interface OldInterface {

        void oldExecute();

    }

    /**
     * 老版本接口的实现类
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

    public static class NewInterfaceImpl implements NewInterface {

        @Override
        public void newExecute() {
            System.out.println("新版本接口实现的功能逻辑");
        }
    }

}
