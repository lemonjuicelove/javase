package com.whut.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* FileInputStream类的其他常用的方法：
*   int available(); 返回流当中剩余的没有读到的字节数量
*   long skip(long n); 跳过几个字节不读
*/
public class FileInputStreamTest05 {
    public static void main(String[] args) {

        FileInputStream fis = null;
        try {

            fis = new FileInputStream("chapter24/src/com/whut/javase/io/HelloWorld");
            System.out.println("还剩多少个字节没有读: " + fis.available());

            // 这种方式不需要循环，只读一次，但是不适合太大的文件，因为byte[]数组不能太大
            // byte[] bytes = new byte[fis.available()];
            // fis.read(bytes);
            // System.out.println(new String(bytes));

            // skip跳过几个字节不读取
            fis.skip(3);
            System.out.println(fis.read());

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
