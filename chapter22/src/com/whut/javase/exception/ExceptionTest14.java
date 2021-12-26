package com.whut.javase.exception;

public class ExceptionTest14 {
    public static void main(String[] args) {

        // 创建异常对象(并没有将异常抛出)
        MyException e = new MyException("代码有异常");

        // 打印异常堆栈信息(并不代表出现了异常)
        e.printStackTrace();

        // 获取异常简单描述信息
        String msg = e.getMessage();
        System.out.println(msg);

    }
}
