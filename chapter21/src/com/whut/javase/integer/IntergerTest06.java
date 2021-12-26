package com.whut.javase.integer;
/*
*  String int Integer之间类型互换
*/
public class IntergerTest06 {
    public static void main(String[] args) {

        // String ---> int
        int i = Integer.parseInt("100");
        System.out.println(i);

        // int ---> String
        // 方法1：String s2 = i + "";

        // 方法2
        String s2 = String.valueOf(i);

        // int ---> Integer
        // 自动装箱
        Integer x = 100;

        // Integer ---> int
        // 自动拆箱
        int y = x;
        System.out.println(y + 1);

        // String ---> Integer
        Integer k = Integer.valueOf("123");

        // Integer ---> String
        String a = String.valueOf(k);

    }
}
