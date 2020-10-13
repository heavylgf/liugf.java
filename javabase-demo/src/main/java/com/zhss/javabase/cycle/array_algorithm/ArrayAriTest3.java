package com.zhss.javabase.cycle.array_algorithm;

/*
 * 查找(线性查找)
 */
public class ArrayAriTest3 {

	public static void main(String[] args) {
		
		int[] numbers = {10,20,6,5,3};
		
		// 线性查找
		int findNumber = 20; //要查找的内容
		int index = -1;//用来记录查找到的数值的索引位置
		for (int i = 0; i < numbers.length; i++) {
			if(findNumber == numbers[i]){
				// 如果查找到，记录下该索引的位置
				index = i;
				break;
			}
		}
		//判断是否查找到了
		if(index == -1){
			System.out.println("亲！！没有找到您想要的内容哦");
		}else{
			System.out.println("您的数据在" + index + "索引位置");
		}
	}

}
