package com.whut.javase.array;

import java.util.LinkedList;

public class ArrayTest03 {
    public static void main(String[] args) {

        int[] array1 = {1,2,3,4};
        // 传入一个静态数组
        printArray(array1);

        // printArray({7,8,9}); 没有这种语法
        printArray(new int[]{7, 8, 9});

        // 直接传入一个动态数组
        printArray(new String[3]);


    }

    // 参数是一个int类型的数组
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    // 参数是一个String类型的数组
    public static void printArray(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
