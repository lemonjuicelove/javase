package com.whut.javase.array;
/*
* 关于java中的二维数组
*   1、二维数组其实是一个特殊的一维数组，特殊在这个一维数组当中的每一个元素是一个一维数组
*   2、二维数组静态初始化
*       int[][] array = {{},{},{}};
*/
public class ArrayTest08 {
    public static void main(String[] args) {

        // 一维数组
        int[] array1 = {100,200,300};
        // 二维数组
        int[][] array2 = {
                {1,2,3},
                {10,20},
                {4,5,3,2,1}
        };
        System.out.println(array2.length); // 3 二维数组的长度
        System.out.println(array2[0].length); // 3 二维数组中第一个元素的长度
        System.out.println(array2[1].length); // 2 二维数组中第二个元素的长度
        System.out.println(array2[2].length); // 5 二维数组中第三个元素的长度
    }

}
