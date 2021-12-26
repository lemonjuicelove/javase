package com.whut.javase.io;

import java.io.File;
import java.io.IOException;

/*
* File:
*   1、File类和四大家族没有关系，所以File类不能完成文件的读和写
*   2、File对象代表什么：
*        文件和目录路径名的抽象表示形式
*        一个File对象有可能对应的是目录，也可能是文件
*        File只是一个路径名的抽象表示形式
*   3、需要掌握File类中常用的方法
*/
public class FileTest01 {
    public static void main(String[] args) {

        // 创建一个File的对象
        File f1 = new File("C:\\Users\\73561\\Desktop\\javase\\io\\file");
        // 判断这个文件是否存在
        System.out.println(f1.exists()); // false

        /*if (!f1.exists()){
            try {
                // 如果不存在，以文件的形式创建出来
                f1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

        /*if (!f1.exists()){
            // 如果不存在，以目录的形式新建
            f1.mkdir();
        }*/

        File f2 = new File("C:\\Users\\73561\\Desktop\\javase\\io\\a\\b\\c\\d\\e");
        if (!f2.exists()){
            // 多重目录的形式创建
            f2.mkdirs();
        }

        File f3 = new File("C:\\Users\\73561\\Desktop\\javase\\io\\file");
        // 获取文件的父路径
        String parentPath = f3.getParent();
        System.out.println(parentPath);
        // 获取文件的绝对路径
        System.out.println("绝对路径为： " + f3.getAbsolutePath());

        File f4 = new File("chapter26/src/com/whut/java/reflect/MyClass");
        System.out.println(f4.getAbsolutePath());

    }
}
