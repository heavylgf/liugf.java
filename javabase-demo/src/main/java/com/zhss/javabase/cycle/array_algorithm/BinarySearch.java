package com.zhss.javabase.cycle.array_algorithm;

import java.util.Arrays;

/*
 *  二分法查找, 前提是必须先排好序
 */
public class BinarySearch {

	public static void main(String[] args) {
		int[] number = { 12, 30, -5, 6, 9, 10, 5 };
		// 排序
		Arrays.sort(number); // 必须排序好

		// 二分查找函数 binarySearch，返回下标
		Arrays.binarySearch(number, 6);

		System.out.println(Arrays.binarySearch(number, 6));
	
		System.out.println(Arrays.toString(number));

		int findNumber = 12; // 要查找的内容
		int start = 0; //起始位置
		int end = number.length - 1; //结束的位置
		int index = -1; // 所在的元素位置
		while (start <= end) {
			int mid = (start + end) / 2;
			if (number[mid] == findNumber) {
				index = mid;
				break;
			} else if (number[mid] < findNumber) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		if (index == -1) {
			System.out.println("没有找到您需要的内容");
		} else {
			System.out.println("元素所在的位置" + index);
		}
		
	}

}
