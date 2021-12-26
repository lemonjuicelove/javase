package com.whut.javase;

import java.util.Scanner;

/*
 * 	从控制台输入一个不多于5位的正整数
 * 	要求：求它是几位数；逆序打印出各位数字
 */
public class Homework09 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
		System.out.print("请输入一个不大于五位的正整数:");
		int score=scanner.nextInt();
		String string=String.valueOf(score);//转换成字符串类型
        int number= string.length();//判断长度，长度即有几位
        System.out.println("输入的是"+number+"位数");

		//存入数组
		int[] score1=new int[number];
         for (int i = 0; i < score1.length; i++) {
			score1[i]=score%10;
			score=score/10;
		}

         //正序输出
        for (int i =score1.length-1; i >=0 ; i--) {
		    System.out.print( score1[i]+",");
		}
        System.out.println();
         //倒序输出
         for (int i = 0; i < score1.length; i++) {
        	 System.out.print( score1[i]+",");
		}

    }
}
