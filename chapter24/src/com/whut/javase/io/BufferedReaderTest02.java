package com.whut.javase.io;

import java.io.*;
/*
* 转换流：InputStreamReader
*/
public class BufferedReaderTest02 {
    public static void main(String[] args) {

        BufferedReader br = null;
        try {

            // 字节流
            FileInputStream fis = new FileInputStream("chapter24/src/com/whut/javase/io/CopyTest02.java");

            // 通过转换流转换(InputStreamReader将字节流转换成字符流)
            // 在下面代码中，fis是节点流，isr是包装流
            // 字节输入流fis转换成了字符输入流isr
            InputStreamReader isr = new InputStreamReader(fis);

            // 这个构造方法只能传一个字符流，不能传字节流
            // 在下面代码中，isr是节点流，br是包装流
            br = new BufferedReader(isr);

            // 合并写法
            // br = new BufferedReader(new InputStreamReader(new FileInputStream("chapter24/src/com/whut/javase/io/CopyTest02.java")));

            String readFlag = null;
            while ((readFlag = br.readLine()) != null){
                System.out.println(readFlag);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
