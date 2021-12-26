package com.whut.javase;
/*
 * 	没有使用方法重载机制的代码
 *
 *  缺点：1、代码不美观
 * 		 2、需要记忆更多的方法名称
 */
public class OverloadTest01 {

    public static void main(String[] args) {
        System.out.println(sumInt(10, 20));
        System.out.println(sumLong(20L, 30L));
        System.out.println(sumDouble(30, 40));
    }

    public static int sumInt(int x, int y) {
        return x + y;
    }
    public static long sumLong(long x, long y) {
        return x + y;
    }
    public static double sumDouble(double x, double y) {
        return x + y;
    }

}
