package com.whut.javase;
/*
 * + 运算符：
 * 		1、+ 运算符在java语言中有两个作用
 * 			作用1：求和
 * 			作用2：字符串拼接
 * 		2、当 + 运算符两边都是数字类型的时候，求和
 * 		   当 + 运算符两边的任意一边是字符串类型，那么会进行字符串拼接操作
 * 		3、注意：字符串拼接完之后的结果还是一个字符串
 */
public class OperatorTest06 {
    public static void main(String[] args) {

        int nianLing = 35;
        // + 在这里进行的是字符串的拼接操作
        System.out.println("年龄 = " + nianLing);
        int a = 100;
        int b = 200;
        // + 在这里进行的加法运算
        int c = a + b;

        // 注意：当一个表达式当中有多个加号的时候,遵循“自左向右”的顺序依次执行（有小括号先算小括号里的）
        // 4个加号都是字符串的拼接操作
        System.out.println(a + "+" + b + "=" + c);

    }
}
