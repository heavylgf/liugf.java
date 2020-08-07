package com.zhss.javabase.variable;

public class Test {

//    // 在以下实例中age是一个局部变量。定义在pupAge()方法中，它的作用域就限制在这个方法中。
//    // 局部变量没有默认值，所以局部变量被声明后，必须经过初始化，才可以使用。
//    public void pupAge(){
//        int age = 0;
//        age = age + 7;
//        System.out.println("小狗的年龄是: " + age);
//    }
//
//    public static void main(String[] args){
//        Test test = new Test();
//        test.pupAge();
//    }


//    // 在下面的例子中 age 变量没有初始化，所以在编译时会出错：
//    public void pupAge(){
//        int age;
//        age = age + 7;
//        System.out.println("小狗的年龄是 : " + age);
//    }
//
//    public static void main(String[] args){
//        Test test = new Test();
//        test.pupAge();
//    }


    public void pup(int age){
        age = age + 7;
        System.out.println("小狗的年龄是 : " + age);

    }

    public static void main(String[] args) {
        Test test = new Test();
        test.pup(2);

    }


}
