package com.whut.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* 分析这个程序的缺点：
*       一次读取一个字节，这样内存和硬盘交互太频繁，基本上时间/资源都消耗在交互上面了
*/
public class FileInputStreamTest02 {
    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
            // 创建文件字节输入流对象
            fis = new FileInputStream("chapter24/src/com/whut/javase/io/temp2");

            // 采用while循环的方式读取文件
            int fisData = 0;
            while ((fisData = fis.read()) != -1){
                System.out.println(fisData);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
