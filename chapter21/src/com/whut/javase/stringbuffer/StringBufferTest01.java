package com.whut.javase.stringbuffer;
/*
* 思考：在实际开发中，如果需要进行字符串的频繁拼接，会有什么问题？
*       因为java中的字符串是不可变的，每一次拼接都会产生新的字符串
*       这样会占用大量的方法区内存。造成内存空间的浪费
*           String s = "hello";
*           s += "world";
*           两行代码创建了3个对象
*
* 如果以后需要进行大量字符串的拼接操作，建议使用JDK中自带的：
*   java.lang.StringBuffer
*   java.lang.StringBuilder
*
* StringBuffer底层实际上是一个byte[]数组，往StringBuffer中放字符串，实际上是放到byte数组当中了
* StringBuffer的初始化容量是16
*
* 如何优化StringBuffer的性能：
*   在创建StringBuffer的时候尽可能给定一个初始化容量，这样可以减少底层数组的扩容次数
*   预先估计，给个大一些的初始化容量
*   关键点：给一个合适的初始化容量，可以提高程序的执行效率
*/
public class StringBufferTest01 {
    public static void main(String[] args) {

        // 创建一个初始化容量为16的byte[]数组对象(字符串缓冲区对象)
        StringBuffer s1 = new StringBuffer();
        // 拼接字符串统一调用append()方法
        // append方法底层在进行追加的时候，如果byte数组满了，会自动扩容
        // 虽然同样创建了4个字符串对象，但是没有创建中间过度用的字符串对象
        s1.append("a");
        s1.append("b");
        s1.append("hello");
        s1.append("world");
        System.out.println(s1);

        // 指定初始化容量的StringBuffer对象(字符串缓冲区对象)
        StringBuffer s2 = new StringBuffer(20);
        s2.append("nihao");
        s2.append("hello");
        s2.append("world");
        System.out.println(s2);

    }
}
