package com.whut.javase.integer;
/*
* Integer类当中有哪些常用的方法
*/
public class IntergerTest05 {
    public static void main(String[] args) {

        Integer a = new Integer("123");
        System.out.println(a);
        // Integer a = new Integer("hello");
        // 编译通过，运行报错：java.lang.NumberFormatException (数字格式化异常)
        // 字符串中不是一个数字的时候不能包装成Integer

        // 重点方法:public static int parseInt(String s)
        // 静态方法，传参String，返回int
        // 网页上文本框中输入的100实际是"100"字符串。后台数据库要求存储100数字
        // 调用此方法将字符串转变成数字
        int b = Integer.parseInt("100");
        System.out.println(b);

        // 照葫芦画瓢
        double c = Double.parseDouble("10.0");
        System.out.println(c);

    }
}
