package com.whut.javase.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* java.io.DataOutputStream：数据专属的流
* 这个流可以将数据连同数据的类型一起写入文件
*/
public class DataOutputStreamTest {
    public static void main(String[] args) {

        DataOutputStream dos = null;
        try {

            FileOutputStream fos = new FileOutputStream("chapter24/src/com/whut/javase/io/datatest");
            dos = new DataOutputStream(fos);

            // 写数据
            byte b = 100;
            short s = 200;
            int i = 300;
            long l = 400L;
            float f = 3.14f;
            double d = 1.18;
            boolean sex = true;
            char c = '中';
            String a = "woaini";

            // 把数据及数据的类型一起写入到文件当中
            dos.writeByte(b);
            dos.writeShort(s);
            dos.writeInt(i + 1000);
            dos.writeLong(l);
            dos.writeFloat(f);
            dos.writeDouble(d);
            dos.writeBoolean(sex);
            dos.writeChar(c);
            // 字符串要调用writeUTF()方法写入
            dos.writeUTF(a);

            // 刷新
            dos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (dos != null) {
                try {
                    dos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
