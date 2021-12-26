package com.whut.java.reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
* 测试反射机制的灵活性
*       java代码写一遍，在不改变源代码的基础之上，可以做到不同对象的实例化(符合OCP开闭原则：对扩展开放，对修改关闭)
*
* ssh  ssm这些高级框架底层实现原理：都采用了反射机制，学会反射机制有利于理解剖析框架底层的源代码
*/
public class ReflectTest03 {
    public static void main(String[] args) {

        // 以下代码不需要改动，通过修改配置文件，可以创建出不同的实例对象

        FileReader reader = null;
        // 创建属性类对象Map
        Properties pro = new Properties();
        try {
            // 通过IO流读取classinfo.properties文件
            reader = new FileReader("chapter26/classinfo.properties");
            // 加载
            pro.load(reader);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        // 通过key获取value
        String className = pro.getProperty("className");

        // 通过反射机制实例化对象
        try {
            Class c = Class.forName(className);
            Object obj = c.newInstance();
            System.out.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
