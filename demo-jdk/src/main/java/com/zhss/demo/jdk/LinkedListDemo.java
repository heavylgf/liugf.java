package com.zhss.demo.jdk;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by CTWLPC on 2018/10/30.
 */
public class LinkedListDemo {

    public static void main(String[] args) {
//        List<String> list = new LinkedList<String>();
//        list.add("张三");
//        list.add(1, "李四");

        LinkedList<String> lList = new LinkedList<String>();
        lList.add("1");
        lList.add("2");
        lList.add("3");
        lList.add("4");
        lList.add("5");
        System.out.println(lList);
        // 队列头部添加一个元素
        lList.addFirst("0");
        System.out.println(lList);
        lList.addLast("6");
        System.out.println(lList);

        System.out.println(lList.getFirst());
        System.out.println(lList.peek());

        System.out.println(lList.getLast());


    }
}
