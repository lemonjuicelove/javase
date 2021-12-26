package com.whut.javase.io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* File类的常用方法
*/
public class FileTest02 {
    public static void main(String[] args) {

        File f1 = new File("C:\\Users\\73561\\Desktop\\python学习\\java学习笔记.txt");
        // 获取文件名
        System.out.println("文件名：" + f1.getName());

        // 判断是否是一个目录
        System.out.println(f1.isDirectory());
        // 判断是否是一个文件
        System.out.println(f1.isFile());
        // 判断是否存在
        System.out.println(f1.exists());

        // 获取文件最后一次的修改时间
        long haoMiao = f1.lastModified(); // 这个毫秒是从1970年到现在的总毫秒数
        // 将毫秒转换成日期
        Date time = new Date(haoMiao);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime = sdf.format(time);
        System.out.println(strTime);

        // 获取文件大小
        System.out.println(f1.length());

    }
}
