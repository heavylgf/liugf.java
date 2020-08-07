package com.zhss.algorithms.sort;

/**
 * 二分查找算法
 */
public class BinarySearch {

    /**
     * int[] 必须是有序的数组
     * @param key
     * @param a
     * @return
     */
    public static int rank(int key, int[] a){

        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi){
            // 查找出数组的中间下标 mid
            int mid = lo + (hi - lo) / 2;
            // 小于中间的数字
            if(key < a[mid]){
                hi = mid - 1;

             // 大于中间的数字
            }else if(key > a[mid]){
                lo = mid + 1;
            }else{
                return  mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        int[] whitelist = In.readInts(args[0]);
    }



}
