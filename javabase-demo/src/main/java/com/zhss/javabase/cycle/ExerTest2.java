package com.zhss.javabase.cycle;

/**
 * 创建一个char类型的36个元素的数组，前26个元素放置'A'-'Z‘,后10个元素放置'0'-'9‘。
 * @Author: liugf
 * @Date: 2020/10/12 下午10:48
 */
public class ExerTest2 {

    public static void main(String[] args) {
        // 创建数组
        char[] cs = new char[36];
        char c = 'A';
        char number = '0';
        // 给数组赋值
        for(int i =0; i < cs.length; i++){
            if(i < 26){
                cs[i] = c;
                c += 1;
            } else {
              cs[i] = number;
              number += 1;
            }
        }

        // 遍历数组
        for(int i = 0; i < cs.length; i++){
            System.out.println(cs[i]);
        }

    }

}
