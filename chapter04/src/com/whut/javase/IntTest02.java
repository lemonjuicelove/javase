package com.whut.javase;
/*
 * 1、小容量可以直接赋值给大容量，称为自动类型转换
 * 2、大容量不能直接赋值给小容量，需要使用强制类型转换符进行强转
 * 	  虽然编译通过，但是运行时可能会损失精度（超出小容量的范围就会损失精度）
 */
public class IntTest02 {
    public static void main(String[] args) {

        long x = 100; // 自动类型转换

        // int y = x; 编译报错：类型不匹配
        // 大容量不能直接赋值给小容量

        //  大容量转换成小容量，要想编译通过，必须加强制类型转换符
        //  (int) 就是强制类型转换符；虽然编译通过，但是运行时可能损失精度
        int y = (int)x;
        System.out.println(y);

        int a = 200;
        byte b = (byte)a; // 强制类型转换
        System.out.println(b); // -56 损失了精度

    }
}
