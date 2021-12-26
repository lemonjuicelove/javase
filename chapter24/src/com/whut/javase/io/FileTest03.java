package com.whut.javase.io;

import java.io.File;

/*
* File中的listFiles方法
*/
public class FileTest03 {
    public static void main(String[] args) {

        File f= new File("C:\\Users\\73561\\Desktop\\Java学习");
        // 获取当前目录下所有的子文件，返回值是一个File数组
        File[] files = f.listFiles();
        // foreach
        for (File file : files){
            System.out.println(file.getName());
        }

    }
}
