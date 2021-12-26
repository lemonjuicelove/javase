package com.whut.javase.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 文件字节输出流，负责写
* 从内存到硬盘
*/
public class FileOutputStreamTest01 {
    public static void main(String[] args) {

        FileOutputStream fos = null;
        try {

            // temp文件不存在的时候会自动新建

            // 这种方式谨慎使用，因为此方式会先将原文件清空，然后重新写入
            // fos = new FileOutputStream("chapter24/src/com/whut/javase/io/temp");

            // 以追加的方式在文件末尾写入，不会清空原文件的内容
            fos = new FileOutputStream("chapter24/src/com/whut/javase/io/temp",true);


            // 开始写文件
             byte[] bytes = {97, 98, 99, 100};
            // 将byte数组全部写入文件
            // fos.write(bytes);
            // 将byte数组部分写入文件
             fos.write(bytes,0,2);

           /* String s = "外面的世界很精彩，外面的世界很无奈";
            byte[] bs = s.getBytes();
            fos.write(bs);*/

            // 写完之后，最后一定要刷新
            fos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
