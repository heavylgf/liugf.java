package com.zhss.javabase.cycle.array;

/**
 * 一维数组的内存解析

 */
public class ArrayTest2 {

	public static void main(String[] args) {
		
		String[] names = new String[3];
		names[0] = "吴京";
		names[2] = "章子怡";
		
		String[] names2 = names;
		names2[1] = "志玲";
		
		names2 = new String[3];
		
		for(int i = 0; i < names.length; i++){
			System.out.println(names[i]);
		}
		
		System.out.println("-------------names2----------------");
		
		for(int i = 0; i < names2.length; i++){
			System.out.println(names2[i]);
		}
	}
}
