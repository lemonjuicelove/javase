package com.whut.javase.array;

import java.util.Arrays;
/*
* SUN公司已经为我们写好了一个数组工具类：java.util.Arrays
* java.util.Arrays工具类中有哪些方法，我们开发的时候需要参考API帮助文档
* java.util.Arrays工具类中所有方法都是静态的，直接用类名调用
* 主要使用两个方法：排序、二分法查找
*/
public class ArraysTest01 {
    public static void main(String[] args) {

        int[] array = {22,134,434,1,-5,323};
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int index = Arrays.binarySearch(array,22);
        System.out.println(index == -1 ? "该数组中没有要查找的元素" : "数组中要查找的元素的下标为：" + index);

    }
}
