package com.whut.javase.collection;
/*
* 位运算符 >> 右移    << 左移
*
* 总结：右移n位，除以2的n次方
*      左移n位，乘以2的n次方
*/
public class BinaryTest {
    public static void main(String[] args) {

        // >> 1 二进制右移1位
        // >> 2 二进制右移2位
        System.out.println(10 >> 1); // 5 右移1位就是/2

        // << 1 二进制左移1位
        // << 2 二进制左移2位
        System.out.println(10 << 1); // 20 左移1位就是*2

    }
}
