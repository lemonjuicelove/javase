package com.whut.javase.array;
/*
* 二分法查找(折半查找)：
*   第一：二分法查找建立在排序的基础上
*   第二：二分法查找效率高于遍历查找
*   第三：二分法查找原理：
*       10(0) 20 30 40 50 60 70 80 90 100(9)  array数组
*       目标：找出80元素的下标
*
*       (0 + 9) / 2 = 4(中间元素的下标)
*       array[4]: 50
*       50 < 80 说明被查找的元素在50的右边
*       那么此时起点下标变成: 4+1=5
*
*       (5 + 9) / 2 = 7(中间元素的下标)
*       array[7]:80
*       找到了要找的元素
*
*   二分法查找的终止条件：一直折半，直到中间的那个元素恰好是被查找的元素
*/

import java.util.Arrays;

public class ArraySearch02 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 7, 10, 100, 470};
        int index = arraySearch(array,10);
        System.out.println(index == -1 ? "数组中不存在该元素" : "数组中该元素的下标是：" + index);
    }

    public static int arraySearch(int[] array, int element){

        int leftStart = 0;
        int rightOver = array.length - 1;
        while (leftStart <= rightOver){ // 左起点大于右终点的时候，循环结束
            if (array[(leftStart+rightOver)/2] == element){
                return (leftStart+rightOver)/2;
            }else if (array[(leftStart+rightOver)/2] < element){
                leftStart = (leftStart+rightOver)/2 + 1; // 在右边的话，起点下标加1
            }else{
                rightOver = (leftStart+rightOver)/2 - 1; // 在左边的话，终点下标减1
            }
        }
        return -1;
    }

}
