package com.whut.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* int read(byte[] b)
*   一次最多读取b.length 个字节。减少硬盘和内存的交互，提高程序的执行效率
*/
public class FileInputStreamTest03 {
    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
            // IDEA默认的当前路径：工程Project的根就是IDEA的默认当前路径
            fis = new FileInputStream("chapter24/src/com/whut/javase/io/temp2");

            // 开始读，采用byte数组，一次读取多个字节，最多读取“数组.length”个字节
            byte[] bytes = new byte[4]; // 准备一个4个长度的byte数组，一次最多读取4个字节
            // 这个方法的返回值是：读取到的字节数量。(不是字节本身，字节本身存储到所创建的数组当中了)
            int readNum = fis.read(bytes);
            System.out.println(readNum); // 第一次读了4个字节

            // 将字节数组全部转换成字符串
            // 不应该将字节数组全部转换，应该是读取了多少个字节，转换多少个
            System.out.println(new String(bytes, 0, readNum));

            readNum = fis.read(bytes);
            System.out.println(readNum); // 第二次读了2个字节
            System.out.println(new String(bytes, 0, readNum));

            readNum = fis.read(bytes);
            System.out.println(readNum); // 第三次1个字节都没读到，返回-1

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
