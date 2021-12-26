package com.whut.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
/*
* 如何查看异常追踪信息？
*       从上往下一行一行看，SUN公司写的代码不用看，主要的问题出现在自己编写的代码上
*/
public class ExceptionTest08 {
    public static void main(String[] args) {

        try {
            m1();
        } catch (FileNotFoundException e) {
            // 打印异常堆栈追踪信息
            // 在实际开发中，建议使用这个方法
            e.printStackTrace();
        }
        // 下面的程序不耽误执行，很健壮。(服务器不会因为遇到异常而宕机)
        System.out.println("hello world");
    }

    private static void m1() throws FileNotFoundException {
        m2();
    }

    private static void m2() throws FileNotFoundException {
        m3();
    }

    private static void m3() throws FileNotFoundException {
        new FileInputStream(" ");
    }

}
