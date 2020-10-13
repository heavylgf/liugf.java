package com.zhss.javabase.cycle.array;

/**
 * 杨辉三角
 *
 * @Author: liugf
 * @Date: 2020/10/13 下午3:19
 */
public class YangHuiTest {

    public static void main(String[] args) {
        // 创建一个二维数组长度为10
        int[][] numbers = new int[10][];
        // 初始化二维数组的元素
        for(int i = 0; i < numbers.length; i++){
//            numbers[0] = new int[1];
//            numbers[1] = new int[2];
//            numbers[2] = new int[3];
            numbers[i] = new int[i + 1];
            // 给二维数组的元素的首个元素和最后一个元素赋值为1
            numbers[i][0] = numbers[i][i] = 1;
            
            // 给一维数组中的元素赋值（除第一个和最后一个）
            for (int j = 1; j < numbers[i].length - 1; j++) {
                numbers[i][j] = numbers[i - 1][j] + numbers[i - 1][j - 1];
            }
            
        }
        
        // 遍历二维数组
        for (int i = 0; i < numbers.length; i++) { //遍历二维数组的元素
            for (int j = 0; j < numbers[i].length; j++) { //遍历一维数组的元素
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }

}
