package com.zhss.demo.jdk;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CTWLPC on 2018/10/29.
 */
public class ArrayListDemo {

    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<String>(50);
        list.add("张三");
        list.add("李四");
        list.set(1, "王五");

        // 随机读取
        System.out.println(list.get(1));
        // 删除元素
//        list.remove(1);
//        System.out.println("list_size: " + list.size());

        for (int i = 0; i < 8; i++) {
            list.add("string_" + i);
        }

        // 第一种遍历 使用迭代器进行相关遍历
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        // 第二种遍历方法使用foreach遍历List
//        for (String str : list) {            //也可以改写for(int i=0;i<list.size();i++)这种形式
//            System.out.println(str);
//        }
        for(int i = 0; i < 8 ; i ++){
            if(i == 7){
                System.out.println("进入断点");
            }
            list.add("string_" + i);

        }

        // 第三种遍历，把链表变为数组相关的内容进行遍历
        String[] strArray = new String[list.size()];
        // List容器类中有一个toArray()的方法，该方法是用来把List转化为数组的
        list.toArray(strArray);
        for (int i = 0; i < strArray.length; i++) //这里也可以改写为  foreach(String str : strArray)这种形式
        {
            System.out.println(strArray[i]);
        }

    }
}
