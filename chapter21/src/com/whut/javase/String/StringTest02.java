package com.whut.javase.String;

public class StringTest02 {
    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "hello";
        // == 比较的是内存地址，"hello"在字符串常量池当中，不会再次新建一个，所以s1和s2保存的内存地址是一样的
        System.out.println(s1 == s2); // true

        String s3 = new String("xyz");
        String s4 = new String("xyz");
        // s3和s4保存的是两个对象的内存地址，对象不同，内存地址不同，
        // 但是这两个对象中保存的字符串的内存地址又是相同的，因为都是指向字符串常量池当中的"xyz"
        // 所以字符串的比较用equals方法，不用==
        System.out.println(s3 == s4); // false
        System.out.println(s3.equals(s4)); // true

    }
}
