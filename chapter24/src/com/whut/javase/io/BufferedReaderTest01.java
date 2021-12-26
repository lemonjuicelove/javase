package com.whut.javase.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
* BufferedReader:
*   带有缓冲区的字符输入流
*   使用这个流的时候不需要自定义char数组，或者说不需要自定义byte数组。自带缓冲
*/
public class BufferedReaderTest01 {
    public static void main(String[] args) {

        BufferedReader bfr = null;
        try {

            // 当一个流的构造方法中需要一个流的时候，这个被传进来的流叫做：节点流
            // 外部负责包装的这个流叫做：包装流(处理流)
            // 对于下面代码来说：FileReader就是一个节点流。BufferedReader就是包装流/处理流
            FileReader fr = new FileReader("chapter24/src/com/whut/javase/io/CopyTest01.java");
            bfr = new BufferedReader(fr);

            // String readLine()方法：读取一行(不带换行符)，没有数据可读时，返回null
            /*
            System.out.println(bfr.readLine());
            System.out.println(bfr.readLine());
            System.out.println(bfr.readLine());
            System.out.println(bfr.readLine());
            System.out.println(bfr.readLine());
            */


            // 读一行，但是不带换行符
            String readFlag = null;
            while ((readFlag = bfr.readLine()) != null){
                System.out.println(readFlag);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 对于包装流来说，只需关闭最外层流就行，里面的节点流会自动关闭
            if (bfr != null) {
                try {
                    bfr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
