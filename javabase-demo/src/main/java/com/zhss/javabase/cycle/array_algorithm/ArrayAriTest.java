package com.zhss.javabase.cycle.array_algorithm;

import java.util.Arrays;

/**
 * 数组中常见的算法：
 *
 * 2. 求数值型数组中元素的最大值、最小值、平均数、总和等
 *
 */
public class ArrayAriTest {

	public static void main(String[] args) {
		int[] numbers = {10,20,6,5,3};
		
		//求数值型数组中元素的最大值
		int maxNumber = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if(maxNumber < numbers[i]){
				maxNumber = numbers[i];
			}
		}
		System.out.println("最大值:" + maxNumber);
		
		//求数值型数组中元素的最小值
		int minNumber = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if(minNumber > numbers[i]){
				minNumber = numbers[i];
			}
		}
		System.out.println("最小值:" + minNumber);
		
		// 求数值型数组中元素的和 ，平均数
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("sum=" + sum + "  平均数:" + sum/numbers.length);
		
		// 数组的复制
		int[] copyNumbers = new int[numbers.length];
		for (int i = 0; i < copyNumbers.length; i++) {
			copyNumbers[i] = numbers[i];
		}
		//输出数组中的元素
		copyNumbers[0] = 100;
		//思考 ：如果修改了copyNumbers中的数据，numbers中的数据发生变化没？ 没有
		String str = Arrays.toString(numbers);//Arrays是操作数组的一个工具类
		System.out.println("numbers=" + str);
		System.out.println("copyNumbers=" + Arrays.toString(copyNumbers));

		int[] copyNumbers1 = new int[numbers.length];
		for(int i = 0; i < copyNumbers1.length; i++){
			copyNumbers1[i] = numbers[i];
		}

		System.out.println("copyNumbers1=" + Arrays.toString(copyNumbers1));

	}

}












