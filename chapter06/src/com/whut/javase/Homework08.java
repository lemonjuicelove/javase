package com.whut.javase;
/*
 *	找出1000内所有的完数
 *	完数：一个数恰好等于它的因子之和，例如：6 = 1 + 2 + 3
 *
 *	思路：先找出因子，然后if语句进行判断
 *
 *	思想存在的问题：不要老是想着嵌套嵌套，要想着平级结构。
 */
public class Homework08 {
    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            int num = 1;
            for (int j = i-1; j > 1; j--) {
                if (i%j == 0){
                    num += j;
                }
            }
            if (num == i){
                System.out.println(i + "是完数");
            }
        }

    }
}
