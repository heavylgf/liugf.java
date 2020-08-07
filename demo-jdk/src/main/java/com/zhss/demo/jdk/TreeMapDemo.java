package com.zhss.demo.jdk;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by CTWLPC on 2018/11/1.
 */
public class TreeMapDemo {

    public static void main(String[] args) {

        // 可以传一个Comparator来自定义两个key怎样排序
        Map<Integer, String> map = new TreeMap<Integer, String>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1 - o2);
            }
        });

        // TreeMap天然就可以按照你的key的自然顺序来排序
//        Map<Integer, String> map = new TreeMap<Integer, String>();
        map.put(2, "张三");
        map.put(1, "李四");
        map.put(4, "李四");
        map.put(3, "王五");
        map.put(7, "赵六");

        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry);
        }

        System.out.println(new Integer(1).compareTo(new Integer(2)));

    }
}
