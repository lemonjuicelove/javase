package com.whut.javase.array;
/*
* 冒泡排序算法：
*   1、每一次循环结束之后，都要找出最大的数据，放到参与比较的这堆数据的最右边
*   2、核心：拿着左边的数字和右边的数字比较，当左边>右边的时候，交换位置
*
* 7 5 2 10 4
*
* 第一次循环：5 2 7 4 10 比较4次
* 第二次循环：2 5 4 7 10 比较3次
* 第三次循环：2 4 5 7 10 比较2次
* ...
*/
public class BubbleTest {

    public static void main(String[] args) {
        int[] arrays = {7,5,-2,-10,4};
        bubble(arrays);
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
    }

    public static void bubble(int[] arrays){
        for (int i = 0; i < arrays.length - 1; i++) { // 控制循环次数
            for (int j = 0; j < arrays.length-1-i; j++) { // 控制每一次循环的比较次数
                if (arrays[j] > arrays[j+1]){
                    int temp = arrays[j+1];
                    arrays[j+1] = arrays[j];
                    arrays[j] = temp;
                }
            }
        }
    }

}

