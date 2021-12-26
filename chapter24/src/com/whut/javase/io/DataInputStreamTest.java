package com.whut.javase.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* DataInputStream：数据字节输入流
*
* DataOutputStream写的文件，只能使用DataInputStream去读。
* 并且读的时候需要提前知道写入的顺序，读的顺序和写的顺序一样，才可以正常取出数据
*/
public class DataInputStreamTest {
    public static void main(String[] args) {

        DataInputStream dis = null;
        try {

            FileInputStream fis = new FileInputStream("chapter24/src/com/whut/javase/io/datatest");
            dis = new DataInputStream(fis);

            System.out.println(dis.readByte());
            System.out.println(dis.readShort());
            System.out.println(dis.readInt());
            System.out.println(dis.readLong());
            System.out.println(dis.readFloat());
            System.out.println(dis.readDouble());
            System.out.println(dis.readBoolean());
            System.out.println(dis.readChar());
            System.out.println(dis.readUTF());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dis != null) {
                try {
                    dis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
