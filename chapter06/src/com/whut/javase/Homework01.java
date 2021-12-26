package com.whut.javase;

import java.util.Scanner;

/*
 * 从键盘输入三个整数存入变量，使用if-else结构，从小到大排序（不考虑相等的情况）
 */
public class Homework01 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int a = s.nextInt();
        System.out.print("请输入第二个整数：");
        int b = s.nextInt();
        System.out.print("请输入第三个整数：");
        int c = s.nextInt();

        if (a > b){
            if (a > c){
                if (c > b){
                    System.out.println(a + ">" + c + ">" + b);
                }else{
                    System.out.println(a + ">" + b + ">" + c);
                }
            }else{
                System.out.println(c + ">" + a + ">" + b);
            }
        }else{
            if (a > c){
                System.out.println(b + ">" + a + ">" + c);
            }else {
                if (b > c){
                    System.out.println(b + ">" + c + ">" + a);
                }else {
                    System.out.println(c + ">" + b + ">" + a);
                }
            }
        }

    }
}
