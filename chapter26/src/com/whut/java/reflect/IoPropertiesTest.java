package com.whut.java.reflect;

import java.io.*;
import java.util.Properties;

public class IoPropertiesTest {
    public static void main(String[] args) throws IOException {

        // 获取一个文件的绝对路径，返回的是一个字符串
        /*String path = Thread.currentThread().getContextClassLoader()
                .getResource("classinfo2.properties").getPath();
        // 创建输入流对象
        FileReader reader = new FileReader(path);*/

        // 直接以流的形式返回
        InputStream reader = Thread.currentThread().getContextClassLoader().getResourceAsStream("classinfo2.properties");
        Properties pro = new Properties();



        // 加载
        pro.load(reader);
        System.out.println(pro.getProperty("className"));

        reader.close();


    }


}
