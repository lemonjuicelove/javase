package com.whut.javase;
/*
 * java中有一个语法规则：
 * 		当这个整数型字面量没有超过byte(short)的取值范围，
 * 		那么这个整数型字面量可以直接赋值给byte类型的变量
 */
public class IntTest03 {
    public static void main(String[] args) {

        byte b = (byte)300;
        System.out.println(b);
        // 强制转换过程中精度是如何损失的：
        // 300这个int类型对应的二进制：00000000 00000000 00000001 00101100
        // byte占用1个字节，砍掉前3个字节，结果是：00101100（44）

        // 编译没有报错，因为1没有超出byte的取值范围,可以直接赋值
        byte x = 1;


    }
}
