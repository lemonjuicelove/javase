package com.whut.javase.io;

import java.io.*;

/*
* BufferedWriter：带有缓冲的字符输出流
* OutputStreamWriter：转换流
*/
public class BufferedWriterTest {
    public static void main(String[] args) {

        BufferedWriter bw = null;
        try {

            FileOutputStream fos = new FileOutputStream("chapter24/src/com/whut/javase/io/WriterTest02.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            bw = new BufferedWriter(osw);

            bw.write("梅须逊雪三分白 雪却输梅一段香");
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
