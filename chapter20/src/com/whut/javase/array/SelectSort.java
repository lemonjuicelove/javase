package com.whut.javase.array;
/*
* 选择排序算法：
*   循环一次，然后找出参加比较的这堆数据中最小的，拿这个最小的值和最前面的数据"交换位置"
*
*   选择排序比冒泡排序的效率高。高在交换位置的次数上，选择排序中每一次交换位置都是有意义的
*
* 参与比较的数据： 3 1 6 2 5
* 第一次循环之后的结果：1 3 6 2 5
*
* 参与比较的数据：3 6 2 5
* 第二次循环之后的结果：2 6 3 5
*
* 参与比较的数据：6 3 5
* 第三次循环之后的结果：3 6 5
*
* 参与比较的数据：6 5
* 第四次循环之后的结果：5 6
*/
public class SelectSort {

    public static void main(String[] args) {

        int[] array = {3, 1, 6, 2, 5};
        select(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int[] array2 = {9, 8, 10, 7, 6, 0, 11};
        select(array2);
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

        System.out.println();

    }



    public static void select(int[] array){

        int count = 0;
        for (int i = 0; i < array.length-1; i++) { // 控制循环次数,同时i正好是参加比较数据中最左边的元素的下标

            int min = i; // 假设每一次参与比较的最小的元素都最左边的元素

            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j; // 这个只交换下标，其实元素并没有交换。遍历交换下标
                }
            }

            if (min != i){
                int temp = array[i]; // 遍历完成之后，只进行一次交换
                array[i] = array[min];
                array[min] = temp;
                count++;
            }

        }
        System.out.println("交换次数为：" + count);

    }

}
