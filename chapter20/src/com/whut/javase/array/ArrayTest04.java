package com.whut.javase.array;
/*
* 1、main方法上的String[] args有什么用？
*       String[] args --> 形式参数列表： 数据类型 + 变量名
*       JVM调用main方法的时候，会自动传一个String数组过来
*/
public class ArrayTest04 {

    // main方法程序员负责写，JVM负责调用。JVM调用的时候会传一个String数组过来
    public static void main(String[] args) {

        // JVM默认传递过来的String数组的长度为0:{}
        System.out.println("JVM传递过来的String数组的长度为：" + args.length);
        /*
        * 这个数组是留给用户的，用户可以在控制台上输入参数，这个参数自动会转换成"String[] args"
        * 例如这样运行程序：java ArrayTest04 abc def xyz
        * 这时JVM会自动将"abc def xyz"通过空格的方式进行分离，分离完成之后，自动放到"String[] args"数组当中
        * 把abc def xyz转换成字符串数组：{"abc","def","xyz"}
        * 所以main方法上的String[] args数组主要是用来接收用户输入参数的
        */
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        // 注意：长度为0并不代表该数组为null
        int[] a = new int[0];
        System.out.println(a); // 结果是一个内存地址
        a = null;
        System.out.println(a); // 结果为null

    }
}
