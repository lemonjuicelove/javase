package com.whut.javase.String;
/*
* 关于java JDK中内置的一个类：java.lang.String
*
*   1、String表示字符串类型，属于引用数据类型，不属于基本数据类型
*
*   2、在java中使用双引号括起来的都是String对象。例如："hello","张三"
*
*   3、java中规定，双引号括起来的字符串，是不可变的(因为是存在字符串常量池当中的)
*
*   4、在JDK当中双引号括起来的字符串，都是直接存储在方法区的字符串常量池当中的。
*     因为字符串在实际开发中使用太频繁，为了执行效率，所以把字符串放在方法区的字符串常量池当中
*/
public class StringTest01 {
    public static void main(String[] args) {

        // 这两行代码创建了3个字符串对象，都存储在字符串常量池当中
        String s1 = "abc"; // 创建"abc"字符串对象
        String s2 = "abc" + "xy"; // 创建"xy"字符串，并将已经创建好的"abc"字符串拿过来创建一个新的"abcxy"字符串

        // 凡是双引号括起来的都在字符串常量池当中
        // new对象的时候一定在堆内存当中开辟空间
        // s3保存的是new对象的内存地址，而new出来的对象中保存的是字符串常量池中的"xy"的内存地址
        String s3 = new String("xy");

        // i变量当中保存的是100这个值
        int i = 100;

        // s变量中保存的是字符串的内存地址
        // s引用中保存的不是"lisi",是0x1111，而0x1111是"lisi"字符串在字符串常量池当中的内存地址
        String s = "lisi";

    }
}
