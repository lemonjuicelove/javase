package com.whut.javase;
/*
 * 	猴子吃桃问题：第一天摘下若干个桃子，当即吃了一半还多一个，以后每天都吃前一天剩下的一半还多1个
 * 	            到第十天早晨时，只剩下一个桃子。求第一天共摘了多少桃子
 */
public class Homework04 {
    public static void main(String[] args) {

        int num = 1;
        for (int i = 0; i < 10; i++){
            num = (num+1)*2;
        }
        System.out.println(num);

        for (int i = 0; i < 10; i++){
            num = num/2 - 1;
        }
        System.out.println(num);

    }
}
