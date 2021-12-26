package com.whut.javase.collection;

import java.util.Properties;

/*
* 目前只需要掌握Properties属性类对象的相关方法即可
* Properties是一个Map集合，继承HashTable，Properties的key和value都是String类型
* Properties被称为属性类对象
* Properties是线程安全的
*/
public class PropertiesTest01 {
    public static void main(String[] args) {

        // 创建一个Properties对象
        Properties pro = new Properties();

        // 需要掌握Properties的存取方法o
        Object o = pro.setProperty("name", "jack");
        Object o1 = pro.setProperty("name", "tom");
        System.out.println(o1);
        pro.setProperty("password", "1218");
        pro.setProperty("address", "WHUT");


        // 通过key获取value
        System.out.println(pro.get("name"));
        System.out.println(pro.get("password"));
        System.out.println(pro.get("address"));

    }
}
