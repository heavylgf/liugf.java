package com.zhss.demo.jdk;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by CTWLPC on 2018/10/31.
 */
public class HashMapDemo {

    public static void main(String[] args) {

        Map<String, String> mapString = new HashMap<String, String>();

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(2, "张三");
        map.put(1, "李四");
        map.put(3, "王五");
        map.put(4, "赵六");

//        System.out.println("map_size：" + map.size());

        for(Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println(entry);
        }

    }
}
