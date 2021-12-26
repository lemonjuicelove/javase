package com.whut.java.reflect;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
* 研究一下文件路径的问题，怎么获取一个文件的绝对路径
* 以下方式是通用的，但前提是：文件需要在类路径下，才能用这种方式
*/

public class AboutPath {
    public static void main(String[] args) throws FileNotFoundException {

        // 这种方式的路径缺点是：移植性差，在IDEA中默认的当前路径是project的根
        // 这个代码如果离开IDEA,换到了其他位置，可能当前路径就不是project的根了，这时这个路径就无效了
        // FileReader reader = new FileReader("chapter26/classinfo.properties");

        // 通用的方式：即使代码换位置了，这样编写仍然有效
        // 注意：使用以下通用方式的前提是：这个文件必须在类路径下
        // 什么是类路径下，方式在src下的都是类路径下，src是类的根路径

        /*
        *  Thread.currentThread() 当前线程对象
        *  getContextClassLoader() 是线程对象的方法，可以获取到当前线程的类加载器对象
        *  getResource() 这是类加载器对象的方法，当前线程的类加载器默认从类的根路径下加载资源
        */
        String path = Thread.currentThread().getContextClassLoader()
                .getResource("classinfo2.properties").getPath();

        // 采用以上代码可以拿到一个文件的绝对路径
        // /E:/javase/out/production/chapter26/classinfo2.properties
        System.out.println(path);

        // 获取whut.properties文件的绝对路径(从类的根路径下作为起点开始)
        // /E:/javase/out/production/chapter26/com/whut/java/bean/whut.properties
        String path2 = Thread.currentThread().getContextClassLoader()
                .getResource("com/whut/java/bean/whut.properties").getPath();
        System.out.println(path2);
        // 上面这种方式获取的文件是字节码文件

        // 下面这种方式获取的文件是java源文件
        // E:\javase\chapter26\src\com\whut\java\bean\whut.properties
        File f = new File("chapter26/src/com/whut/java/bean/whut.properties");
        System.out.println(f.getAbsolutePath());

    }
}
