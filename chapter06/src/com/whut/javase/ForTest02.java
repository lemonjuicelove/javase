package com.whut.javase;
/*
 * 题目：使用for循环，实现1~100所有奇数求和
 */
public class ForTest02 {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i < 100; i+=2) {
            sum += i;
        }
        System.out.println(sum);

    }
}
