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
 *   二分法查找的终止条件：一直折半，直到中间的那个元素恰好是被查找的元素，或者起点查询下标>=终点查询下标
 */
public class BinaryTest {

    public static void main(String[] args) {
        int[] arrays = {10,20,30,40,50,60,70};
        int index = binary(arrays,40);
        System.out.println(index);

    }
    public static int binary(int[] arrays,int element){
        int startIndex = 0;
        int endIndex = arrays.length-1;
        while (startIndex <= endIndex){
            if (arrays[(startIndex + endIndex)/2] > element){
                endIndex = (startIndex + endIndex)/2 - 1; // 在左半区时，下一次查找时，新的终点下标-1
            }else if(arrays[(startIndex + endIndex)/2] < element){
                startIndex = (startIndex + endIndex)/2 + 1; // 在右半区时，下一次查找时，新的起点下标+1
            }else {
                return (startIndex + endIndex)/2;
            }
        }
        return -1;
    }


}
