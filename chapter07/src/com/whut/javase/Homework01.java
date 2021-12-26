package com.whut.javase;
/*
 * 	编写一个方法，输出大于某个正整数n的最小质数
 *
 * 	重点思路是：不同的功能抽取成不同的方法，打布尔类型的标记进行判断
 */
public class Homework01 {

    public static void main(String[] args) {
        int num = 17;
        method1(num);
    }

    public static void method1(int num){
        for (int i = num + 1; true; i++) {
            if (method2(i)){
                System.out.println("大于" + num + "的最小质数为：" + i);
                return;
            }
        }
    }

    public static boolean method2(int num){
        for (int i = 2; i < num; i++) {
            if (num%i == 0){
                return false;
            }
        }
        return true;
    }

}
