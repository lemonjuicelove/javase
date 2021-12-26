package com.whut.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
/*
* 注意：只要异常没有捕捉，采用上报的方式，出现异常处的后续代码不会执行
*      try语句块中的某一行出现异常，该行后面的代码不会执行
*      try..catch捕捉异常之后，后续代码可以执行
*
* 在以后的开发中，处理编译时异常，应该上报还是捕捉，如何选择？
*       如果希望调用者来处理，选择throws上报
*       其他情况使用捕捉的方式
*/
public class ExceptionTest05 {

    // 一般不建议在main方法上使用throws，因为这个异常如果真的发生了，一定会抛给JVM，JVM只有终止
    // 所以一般main方法中的异常建议使用try..catch进行捕捉，不用再继续上抛了
    public static void main(String[] args) {
        System.out.println("main begin");
        try {
            m1();
            // 以上代码如果出现异常，直接进入catch语句块中执行，下面代码不执行
            System.out.println("hello");
        } catch (FileNotFoundException e) { // 一定要加一个变量名
            // e为引用，保存的内存地址是new出来异常对象的内存地址
            // catch是捕捉异常之后走的分支
            System.out.println("文件不存在");
        }
        // try..catch捕捉异常之后，下列代码可以执行
        System.out.println("main over");
    }

    private static void m1() throws FileNotFoundException {
        System.out.println("m1 begin");
        m2();
        // 下面代码不会执行，因为调用m2方法时出现异常
        System.out.println("m1 over");
    }

    // 抛别的不行，抛FileNotFoundException的父对象IOException可以，抛Exception可以
    // 抛多个异常也可以，但是一定要包含需要解决的异常
    private static void m2() throws FileNotFoundException {
        // 需要继续对异常进行预处理
        System.out.println("m2 begin");
        m3();
        // 下面代码不会执行，因为调用m3方法时出现异常
        System.out.println("m2 over");
    }
    private static void m3() throws FileNotFoundException {
        /*
        * 编译报错的原因：调用FileInputStream()构造方法时，这个构造方法的声明位置上有：throws FileNotFoundException
        * 通过类的继承结构最终得知FileNotFoundException是编译时异常
        */
        // 采用第一种处理方式：继续上抛
        System.out.println("m3 begin");
        // 一个方法体当中的代码出现异常之后，如果上报的话，此方法结束
        new FileInputStream("");
        // 上面出现异常之后，不会执行下面的代码
        System.out.println("m3 over");
    }

}
