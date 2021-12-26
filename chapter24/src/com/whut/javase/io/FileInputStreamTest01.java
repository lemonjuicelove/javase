package com.whut.javase.io;

import java.io.*;

/*
* java.io.FileInputStream:
*   1、文件字节输入流，万能的，任何类型的文件都可以采用这个流来读取
*   2、字节的方式，完成输入的操作，完成读的操作
*/
public class FileInputStreamTest01 {
    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
            // 创建文件字节输入流对象
            fis = new FileInputStream("chapter24/src/com/whut/javase/io/temp2");

            // 开始读取，一次只能读一个字节。并且将读到的字节转化为了int类型
            int fisData = fis.read();
            System.out.println(fisData);

            fisData = fis.read();
            System.out.println(fisData);

            fisData = fis.read();
            System.out.println(fisData);

            fisData = fis.read();
            System.out.println(fisData);

            // 如果已经读到文件的末尾，再读的时候读取不到任何数据，返回-1
            fisData = fis.read();
            System.out.println(fisData);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 在finally语句块当中确保流一定关闭
            if (fis != null) { // 避免空指针异常
                // 关闭的前提是：流 != null，流是null的时候没必要关闭
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
