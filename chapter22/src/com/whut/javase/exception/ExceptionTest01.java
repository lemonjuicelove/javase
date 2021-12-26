package com.whut.javase.exception;

/*
* 1、什么是异常？异常处理机制的作用？
*       异常：程序执行过程中的不正常现象
*       异常处理机制的作用：增强程序的健壮性
*
* 2、当程序存在异常时，控制台会出现以下信息
*       Exception in thread "main" java.lang.ArithmeticException: / by zero
	        at com.whut.javase.exception.ExceptionTest01.main(ExceptionTest01.java:7)
	这个信息被称为异常信息，是JVM打印的
*/

public class ExceptionTest01 {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;


        // 实际上JVM在执行到此处的时候，会new异常对象：new ArithmeticException("/ by zero");
        // 并且JVM将new的异常对象抛出，打印输出信息到控制台
        /*try {
            int c = a / b;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }*/
        int c = a / b;
        // 上面将异常抛出之后，不使用捕捉机制，无法解决，就会退出JVM，下面的代码执行不到了
        System.out.println("hello");

        // 此处运行也会创建一个：ArithmeticException类型的异常对象。
        // System.out.println(100 /0);

    }
}
