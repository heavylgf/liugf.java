package com.zhss.designpattern.factory;

/**
 * Created by CTWLPC on 2018/8/14.
 */
public class WithoutFactoryMethodPatternDemo {

    public static void main(String[] args) {
        Product product1 = Product1Factory.createProduct();
        product1.execute();

        Product product2 = Product2Factory.createProduct();
        product1.execute();

        Product product3 = Product3Factory.createProduct();
        product1.execute();


        // 问题在哪儿？
        // 跟模板方法模式的问题一模一样
        // 就是多个工厂类中，有生产产品的相同的通用逻辑，没有抽取出来，直接复制粘贴放多个工厂里了
        // 如果那段通用逻辑要修改
        // 就需要很麻烦到所有工厂中去修改代码；可能会忘记修改某个工厂的代码

    }

    public interface Product {

        void execute();

    }

    public static class Product1 implements Product {

        public void execute() {
            System.out.println("产品 1 的功能逻辑");
        }

    }

    public static class Product2 implements Product {

        public void execute() {
            System.out.println("产品 2 的功能逻辑");
        }

    }

    public static class Product3 implements Product {

        public void execute() {
            System.out.println("产品 3 的功能逻辑");
        }

    }

    public static class Product1Factory {

        public static Product createProduct() {
            System.out.println("生产产品的通用逻辑，修改");
            System.out.println("生产产品 1 的特殊逻辑");
            return new Product1();
        }

    }

    public static class Product2Factory {

        public static Product createProduct() {
            System.out.println("生产产品的通用逻辑，修改");
            System.out.println("生产产品 2 的特殊逻辑");
            return new Product2();
        }

    }

    public static class Product3Factory {

        public static Product createProduct() {
            System.out.println("生产产品的通用逻辑，修改");
            System.out.println("生产产品 3 的特殊逻辑");
            return new Product3();
        }

    }


}
