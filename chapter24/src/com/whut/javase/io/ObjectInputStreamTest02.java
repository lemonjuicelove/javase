package com.whut.javase.io;

import com.whut.javase.bean.User;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

/*
* 反序列化集合
*/
public class ObjectInputStreamTest02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("chapter24/src/com/whut/javase/bean/users"));

        // 返回的实际上是一个List列表，但是编译器编译的时候只知道是Object类型
        Object obj = ois.readObject();

        if(obj instanceof List){
            List<User> userList = (List<User>)obj;
            for (User user : userList){
                System.out.println(user);
            }
        }

        ois.close();

    }
}
