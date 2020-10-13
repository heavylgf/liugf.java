package com.zhss.javabase.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @Author: liugf
 * @Date: 2020/10/13 上午10:54
 */
public class BubbleSortTest {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 6, 5, 3};

        // 外层循环，控制几轮 {0,1,2,3,4}
        for (int i = 0; i < numbers.length - 1; i++) {
            // 控制每轮比较的次数 {第一轮的j的值 ：0，1，2，3 }
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        // 输出数组中的数据
        System.out.println(Arrays.toString(numbers));
    }
}
