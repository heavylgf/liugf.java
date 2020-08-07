package com.zhss.demo.jdk;

import java.util.Stack;

/**
 * Created by CTWLPC on 2018/10/30.
 */
public class StackDemo {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("张三");
        stack.push("李四");
        stack.push("王五");

        System.out.println(stack);

        // pop()方法，从栈顶弹出来一个元素，最后一个压入栈的元素，会通过pop()方法弹出来，
        // 先是使用elementData[size - 1]获取最后一个元素，返回给用户，
        // removeElementAt(size - 1)删除了最后一个元素
        System.out.println(stack.pop());

    }
}
