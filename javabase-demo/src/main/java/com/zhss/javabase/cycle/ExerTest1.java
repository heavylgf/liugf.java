package com.zhss.javabase.cycle;

/**
 * 创建一个char类型的26个元素的数组，分别 放置'A'-'Z‘。
 * 使用for循环访问所有元素并打印出来。
 * 提示：char类型数据运算 'A'+1 -> 'B'，'0'+1 -> ‘1‘
 * @Author: liugf
 * @Date: 2020/10/12 下午10:42
 */
public class ExerTest1 {

    public static void main(String[] args) {
        // 创建一个数组
        char[] cs = new char[26];
        char c = 'A';
        // 使用循环赋值
        for(int i = 0; i < cs.length; i++){
            cs[i] = c;
            c += 1;
        }

        // 遍历数组中的内容
        for(int i = 0; i < cs.length; i++){
            System.out.println(cs[i]);
        }

    }


}
