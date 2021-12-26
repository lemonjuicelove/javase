package com.whut.javase.collection;

/*
* 增强for循环，或者叫做foreach
*/
public class ForEachTest01 {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9};

        // 普通for循环
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("-----------");

        // 增强for循环(foreach)语法：
        /*for(数据类型 变量名 : 数组或者集合){
            System.out.println(变量名);
        }*/

        // foreach有一个缺点：没有下标。在需要使用下标的循环中，不建议使用增强for循环
        for (int data : array){
            // data就是数组中的元素
            System.out.println(data);
        }

    }
}
