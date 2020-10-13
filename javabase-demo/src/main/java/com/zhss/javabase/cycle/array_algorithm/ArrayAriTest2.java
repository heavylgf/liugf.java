package com.zhss.javabase.cycle.array_algorithm;

import java.util.Arrays;

/**
 * 数组的反转、查找(线性查找、二分法查找(了解))
 *
 */
public class ArrayAriTest2 {

	public static void main(String[] args) {
		int[] numbers = {10,20,6,5,3};
		//数组的反转 - 创建一个新的数组（倒序查找原来的数组，正序存放数组中的元素）
		int[] reverseNumbers = new int[numbers.length];
		// 倒着遍历numbers
		for(int i = numbers.length - 1; i >=0; i--){
			reverseNumbers[numbers.length - 1 - i] = numbers[i];
		}
		//输出数组中的元素
//		System.out.println(Arrays.toString(reverseNumbers));
		
		System.out.println("---------------------------------------------------");
		
		// 第二种方式
		for(int i = 0,j = numbers.length - 1; i < numbers.length / 2; i++,j--){
			// 数据交换
			int temp = numbers[i];
			numbers[i] = numbers[j];
			numbers[j] = temp;
		}
		
		System.out.println(Arrays.toString(numbers));

	}

}












