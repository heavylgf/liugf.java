package com.zhss.javabase.cycle.array;

/*
 * 数据交换
 */
public class SwapDataTest {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		//方式一 （用的最多）：优点 ：基本数据类型和引用数据类型都可以使用
//		int temp = a;
//		a = b;
//		b = temp;
		
		//方式二： 缺点 ： 1.只能是基本数据类型中的数值类型 2.可能会损失精度。优点 ：省略了一个变量（节省了内存）
		a = a + b;
		b = a - b; // (a + b) - b
		a = a - b; // (a + b) - (a)
		
		System.out.println("a=" + a + " b=" + b);
	}
}
