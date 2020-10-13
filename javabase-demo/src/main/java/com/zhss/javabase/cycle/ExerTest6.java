package com.zhss.javabase.cycle;

import java.util.Scanner;

/*
 * 随机产生10个元素（10——99范围），保存到数组中，查找里面是否有>80，如果有，显示有，否则提示没有

 */

public class ExerTest6 {

	public static void main(String[] args) {
		/*
		//random()产生一个随机数 ，数值范围[0.0,1.0)
		for (int i = 0; i < 50; i++) {
			System.out.println((int)(Math.random() * 90) + 10);
		}
		*/
		//1.创建一个数组长度为10
		int[] numbers = new int[5];
		
		for(int i = 0; i < numbers.length; i++){
			System.out.println("请输入一个数");
			numbers[i] = (int)(Math.random() * 90 + 10);
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
