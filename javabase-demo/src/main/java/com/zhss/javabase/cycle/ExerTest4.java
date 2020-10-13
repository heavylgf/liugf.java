package com.zhss.javabase.cycle;

/*
 *  小明要去买一部手机，他询问了4家店的价格，分别是2800.5元，2900元，2750.0元和3100元，显示输出最低价
 *
 */
public class ExerTest4 {

	public static void main(String[] args) {
		
		double[] price = {2800.5,2900,2750.0,3100};
		
		double minPrice = price[0];//用来记录最低价格
		
		for (int i = 0; i < price.length; i++) {
			//取出数组中的每一个值
			double p = price[i];
			//比较价格
			if(minPrice > p){
				//记录比较后的低的价格
				minPrice = p;
			}
		}
		
		System.out.println("最低价格为 ： " + minPrice);
	}
}
