package com.whut.javase;
/*
 * 	计算 1! + 2! + ... + 10!
 */
public class Homework05 {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            int num = 1;
            for (int j = 2; j <= i; j++) {
                num = num * j;
            }
            sum = num + sum;
        }
        System.out.println(sum);

    }
}
