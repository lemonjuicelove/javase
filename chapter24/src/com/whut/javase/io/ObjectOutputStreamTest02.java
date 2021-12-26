package com.whut.javase.io;

import com.whut.javase.bean.User;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/*
* 一次序列化多个对象：将对象放到集合中，序列化集合
*
* 注意：参与序列化的ArrayList集合以及集合中的元素User都需要实现Serializable接口
*/
public class ObjectOutputStreamTest02 {
    public static void main(String[] args) throws IOException {

        List<User> userList = new ArrayList<>();
        userList.add(new User(11,"zhangsan"));
        userList.add(new User(22,"lisi"));
        userList.add(new User(33,"wangwu"));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("chapter24/src/com/whut/javase/bean/users"));
        oos.writeObject(userList);

        oos.flush();
        oos.close();

    }
}
