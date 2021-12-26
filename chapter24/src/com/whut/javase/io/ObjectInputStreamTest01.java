package com.whut.javase.io;

import com.whut.javase.bean.Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
* 反序列化
*/
public class ObjectInputStreamTest01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("chapter24/src/com/whut/javase/bean/studens"));
        // 开始对序列化文件进行反序列化，读
        Object obj = ois.readObject();
        // 序列化文件会反序列化回来一个学生对象，会自动调用该对象的toString方法
        System.out.println(obj);

        ois.close();

    }
}
