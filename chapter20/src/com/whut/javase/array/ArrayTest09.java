package com.whut.javase.array;
/*
* 关于二维数组中元素的读和改：
*   a[二维数组中的一维数组的下标][一维数组的元素的下标]
*   a[0][0]:表示第1个一维数组中的第1个元素
*/
public class ArrayTest09 {
    public static void main(String[] args) {

        int[][] array = {
                {1,2,33,221},
                {10,0,11},
                {20,320,21},
                {12}
        };
        System.out.println(array[0][0]);
        System.out.println(array[2][1]);

        // 遍历二维数组当中的所有元素
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j]+",");
            }
            System.out.println(); // 换行
        }

    }
}
