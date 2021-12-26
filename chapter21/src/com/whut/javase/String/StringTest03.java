package com.whut.javase.String;
/*
* 关于String类中的构造方法
*   第一个：String s = ""; // s直接指向方法区常量池当中的字符串对象
*   第二个：String s = new String(""); // s指向new对象的内存地址，new对象中保存的才是方法区常量池当中的字符串对象
*
*   第三个：String s = new String(char数组);
*   第四个：String s = new String(char数组，起始下标，长度);
*
*   第五个：String s = new String(byte数组); // 会通过默认的字符集解码byte数组，构建一个新的String
*   第六个：String s = new String(byte数组，起始下标，长度);
*/
public class StringTest03 {
    public static void main(String[] args) {

        String s1 = "hello";
        System.out.println(s1);// hello
        String s2 = new String("world");
        System.out.println(s2); // world

        char[] array1 = {'安', '工', '程'};
        String s3 = new String(array1);
        System.out.println(s3); // 安工程
        String s4 = new String(array1,1,2);
        System.out.println(s4); // 工程

        byte[] array2 = {97, 98, 99, 100};
        String s5 = new String(array2);
        System.out.println(s5); // abcd
        String s6 = new String(array2,0,3);
        System.out.println(s6); // abc

    }
}
