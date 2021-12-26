package com.whut.javase.array;
/*
* 选择排序算法：
*   循环一次，然后找出参加比较的这堆数据中最小的，拿这个最小的值和最前面的数据"交换位置"
* 7 2 10 6 1
* 第一次循环： 1 2 10 6 7 比较4次
* 第二次循环： 1 2 10 6 7 比较3次
* 第三次循环： 1 2 6 10 7 比较2次
* 第四次循环： 1 2 6 7 10 比较1次
*/
public class SelectTest {

    public static void main(String[] args) {
        int[] arrays = {7,2,10,6,1};
        select(arrays);
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
    }

    public static void select(int[] arrays){
        for (int i = 0; i < arrays.length - 1; i++) { // 控制循环次数
            int flag = i; // 假设最小的元素都在最左边
            for (int j = 1+i; j < arrays.length; j++) { // 控制比较次数
                if (arrays[j] < arrays[flag]){ //每一次都和比较过之后最新的最小数比较
                    flag = j; // 每一次循环之后，确定最小的数的索引位置
                }
            }
            if (flag != i){ // 将最左边的数转换成最小值
                int temp = arrays[i];
                arrays[i] = arrays[flag];
                arrays[flag] = temp;
            }
        }
    }

}
