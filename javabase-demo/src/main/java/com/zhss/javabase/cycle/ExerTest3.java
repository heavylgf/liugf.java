package com.zhss.javabase.cycle;

import java.util.Scanner;

/*
 * 输入五名同学成绩，求出总成绩和平均成绩

	快捷键 ：ctrl + 1
	
 */
public class ExerTest3 {

	public static void main(String[] args) {
		
		//创建数组用来存储成绩
		int[] scores = new int[5];
		//创建Scanner的对象用来读取键盘输入的数据
		Scanner scanner = new Scanner(System.in);
		//存储学生成绩
		for (int i = 0; i < scores.length; i++) {
			System.out.println("请输入学生的成绩");
			int score = scanner.nextInt();
			//把成绩放入到数组中
			scores[i] = score;
		}
		
		//输出学生的总成绩和平均成绩
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("总成绩:" + sum + " 平均成绩：" + sum / scores.length);
	}
}

















