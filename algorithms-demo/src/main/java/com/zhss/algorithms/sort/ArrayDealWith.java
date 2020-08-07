package com.zhss.algorithms.sort;

public class ArrayDealWith {

    public static void main(String[] args) {

        int[] aa = {1, 1, 2, 3, 5, 8};
//        double maxNumber =  max(aa);
//        System.out.println("maxNumber: " + maxNumber);

        int[] b = copy(aa);
        System.out.println("b: " + b);
    }

    /**
     * 数组中最大值
     * @param a
     * @return
     */
    public static double max(int[] a){
        double max = a[0];
        for (int i = 0; i < a.length; i ++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }

    /**
     * 平均数
     * @param a
     * @return
     */
    public static double avg(int[] a){
        int n = a.length;
        double sum = 0.0;
        for (int i = 0; i < n; i ++){
            sum += a[i];
        }
        double avg = sum / n;
        return avg;
    }

    /**
     * 复制数组
     * @param a
     * @return
     */
    public static int[] copy(int[] a){
        int n = a.length;
        int[] b = new int[n];

        for (int i = 0; i < n; i ++){
            b[i] = a[i];
            System.out.println("b[" + i + "]" +": "+ b[i]);
        }
        return b;
    }

}
