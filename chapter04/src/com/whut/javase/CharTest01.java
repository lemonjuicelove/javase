package com.whut.javase;
/*
 *  关于java中的转义字符
 */
public class CharTest01 {
    public static void main(String[] args) {

        char c1 = '\t'; // 相当于tab键
        char c2 = '\n'; // 相当于换行
        System.out.println("111" + '\t' + "222");
        // System.out.print(); 输出完不换行
        // System.out.println(); 输出完自动换行

        char x = '\u4e2d'; //  \ u表示后面的是一个字符的unicode编码
        System.out.println(x);

    }
}
