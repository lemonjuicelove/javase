package com.whut.javase.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
* 使用FileReader FileWriter进行拷贝的话，只能拷贝普通文本文件
*/
public class CopyTest02 {
    public static void main(String[] args) {

        FileReader reader = null;
        FileWriter writer = null;
        try {
            // 创建文件字符输入流对象
            reader = new FileReader("C:\\Users\\73561\\Desktop\\python学习\\java学习笔记.txt");
            // 创建文件字符输出流对象
            writer = new FileWriter("C:\\Users\\73561\\Desktop\\现代控制理论作业\\java学习笔记.txt");

            // 一边读一边写
            char[] chars = new char[1024 * 1024];
            int readNum = 0;
            while ((readNum = reader.read(chars)) != -1){
                writer.write(chars,0, readNum);
            }

            writer.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
