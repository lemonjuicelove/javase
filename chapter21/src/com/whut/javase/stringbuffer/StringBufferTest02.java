package com.whut.javase.stringbuffer;
/*
* 1、String为什么是不可变的？
*       String类中有一个byte[]数组，这个byte[]数组采用了final修饰，因为数组一旦创建长度不可变，并且被final修饰的
*       的引用一旦指向某个对象之后，不可再指向其他对象，所以String是不可变的
*
* 2、StringBuffer/StringBuilder为什么是可变的？
*       StringBuffer/StringBuilder内部实际是一个byte[]数组，这个byte[]数组没有被final修饰，
*       StringBuffer/StringBuilder的初始化容量是16，当存满之后会进行扩容，底层调用了数组拷贝的方法。
*       所以StringBuffer/StringBuilder适合用于字符串的频繁拼接操作
*/
public class StringBufferTest02 {
    public static void main(String[] args) {

        // 字符串不可变是指""里面的字符串对象一旦创建不可变，不是指变量s不可变
        String s = "abc"; // "abc"放到了字符串常量池当中，"abc"不可变，s变量可以指向其他对象
        s = "xyz"; // "xyz"放到了字符串常量池当中，"xyz"不可变

    }
}
