package com.zhss.javabase.cycle.array;

/**
	数组 ：相同数据类型的组合
	
	说明：
		1.数组是引用数据类型
		2.数组中的元素可以是基本数据类型也可以是引用数据类型。
 */
public class ArrayTest {

	public static void main(String[] args) {
		//1.数组的声明和初始化
		String[]  names; //建议使用第一种声明类型
		int age[]; //c语言声明的特点
		//初始化
		//①静态初始化 ：初始化和赋值同时进行
		names = new String[]{"小泽老师","小苍老师","小波老师","小泷老师"};
		//下面的方式：声明和初始化不能分开写
		int[] score  = {1,20,100,90};
		//②动态初始化 ：初始化和赋值分开进行
		age = new int[5];//5指的是数组的长度（可以放几个元素）
		
		
		//2.获取数组中的元素：通过使用数组的下角标（索引值）来获取
		//下角标（索引值）是从0开始的到数组的长度 - 1
		//获取数组中的数据：
		String name = names[1];
		System.out.println(name);
		//给数组中的元素赋值
		age[0] = 1000;
		System.out.println(age[0]);
		
		
		//3.数组的属性 ：length - 数组的长度
		int len = age.length;
		System.out.println(len);
		System.out.println(names.length);
		
		
		//4.遍历数组中的所有元素
		for(int i = 0; i < names.length; i++){//0 ~  3
			System.out.println(names[i]);
		}
		
		System.out.println("---------------------------------------");
		
		//5.数组元素的默认值
		/*
		 * byte,short,int,long -> 0
		 * 
		 * float,double -> 0.0
		 * 
		 * char -> \u0000
		 * 
		 * boolean ->  false
		 * 
		 * 
		 * 引用数据类型 ：null
		 * 
		 */
		byte[] b = new byte[2];
		System.out.println(b[0]);
		System.out.println(age[2]);
		boolean[] bs = new boolean[2];
		System.out.println(bs[0]);
		char[] cs = new char[2];
		System.out.println("ddd"+ cs[0] + "acc");
		String[] str = new String[2];
		System.out.println(str[0]);
		
	}

}










