package com.whut.javase;
/*
 * 	使用方法重载机制的优点：
 * 		1、代码整齐美观
 * 		2、功能相似的方法，可以让方法名相同，利于编写
 *
 * 	在java语言中，是怎么进行方法区分的：
 * 		首先java编译器会通过方法名进行区分
 * 		但是在java语言中允许方法名相同的情况出现
 * 		如果方法名相同，编译器会通过方法的形参的数据类型进行方法的区分
 */
public class OverloadTest02 {

    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(20L, 30L));
        System.out.println(sum(30.0, 40.0));
    }

    public static int sum(int x, int y) {
        System.out.println("int 求和");
        return x + y;
    }
    public static long sum(long x, long y) {
        System.out.println("long 求和");
        return x + y;
    }
    public static double sum(double x, double y) {
        System.out.println("double 求和");
        return x + y;
    }
}
