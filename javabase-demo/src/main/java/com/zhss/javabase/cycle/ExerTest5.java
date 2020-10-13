package com.zhss.javabase.cycle;

import java.util.Scanner;

/*
 * 输入10个元素（10——99范围），保存到数组中，查找里面是否有>80，如果有，显示有，否则提示没有

 */
public class ExerTest5 {

	public static void main(String[] args) {
		//1.创建一个数组长度为10
		int[] numbers = new int[5];
		//2.读取数据 - 并将数据存放到数组中
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < numbers.length; i++){
			System.out.println("请输入一个数");
			/*
			int number = sc.nextInt();
			numbers[i] = number;
			*/
			numbers[i] = sc.nextInt();
		}
		//3.遍历数组-查找大于80的数据，如果有如果有，显示有，否则提示没有
		boolean boo = false; //true表示有大于80的，false则表示没有
		for (int i = 0; i < numbers.length; i++) {
			int num = numbers[i];
			if(num > 80){
				boo = true;
				break;
			}
		}
		
		//只要判断boo的值就可以推断出来是否有
		if(boo){
			System.out.println("有");
		}else{
			System.out.println("没有");
		}
	}
}










