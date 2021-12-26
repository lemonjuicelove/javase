package com.whut.javase.exception;
/*
* 异常对象有两个非常重要的方法：
*
*       获取异常简单的描述信息：
*           String msg = exception.getMessage();
*
*       打印异常追踪的堆栈信息：
*           exception.printStackTrace();
*/
public class ExceptionTest07 {
    public static void main(String[] args) {

        // 这里只是new了异常对象，但是没有将异常对象抛出。JVM会认为这是一个普通的java对象
        NullPointerException e = new NullPointerException("出现了空指针异常");
        // 获取异常简单的描述信息：这个信息实际上就是构造方法上面传入的String参数
        String msg = e.getMessage();
        System.out.println(msg);

        // 打印异常堆栈信息
        // java后台打印异常堆栈追踪信息的时候，采用了异步线程(多线程)的方式打印的
        // 打印异常信息并不是程序出现了异常，只是把异常堆栈信息打印出来
        e.printStackTrace();

        // 代码仍然能够执行
        System.out.println("hello world");

    }
}
