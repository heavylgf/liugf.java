package com.zhss.demo.jdk;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by CTWLPC on 2018/11/2.
 */
public class SetDemo {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>(100);
        set.add("张三");
        set.add("李四");
        set.add("王五");
        set.add("王五");

//        for(String element: set){
//            System.out.println("element:" + element);
//        }

//        System.out.println(set);

        // LinkedHashSet 插入的时候是有顺序的
        Set<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("张三");
        linkedHashSet.add("李四");
        linkedHashSet.add("王五");
        linkedHashSet.add("王五");

//        for(String element: linkedHashSet){
//            System.out.println("element:" + element);
//        }


        Set<String> treeSet = new TreeSet<String>();
        treeSet.add("张三");
        treeSet.add("李四");
        treeSet.add("王五");
        treeSet.add("王五");

        for(String element: treeSet){
            System.out.println("element:" + element);
        }

    }
}
