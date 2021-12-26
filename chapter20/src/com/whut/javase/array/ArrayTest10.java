package com.whut.javase.array;
/*
* 二维数组动态初始化
*/
public class ArrayTest10 {
    public static void main(String[] args) {

        // 二维数组动态初始化
        // 3行4列。表示该二维数组中存储3个一维数组，每个一维数组当中有4个元素
        int[][] array1 = new int[3][4];
        printArray(array1);

        // 静态初始化
        String[][] array2 = {
                {"abc", "def", "hello"},
                {"i", "am", "a", "bird"},
                {"animal", "is", "moving"}
        };
        printArray(array2);
    }

    public static void printArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printArray(String[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
