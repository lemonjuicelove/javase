package com.whut.java.reflect;

import java.util.Date;

/*
* 要操作一个类的字节码，需要首先获取到这个类的字节码，怎么获取java.lang.Class实例
*       三种方式：
*           第一种：Class c = Class.forName("完整类名带包名");
*           第二种：Class c = 对象.getClass();
*           第三种：Class c = 任何类型.class;
*/

public class ReflectTest01 {
    public static void main(String[] args) {

        /*
        * Class.forName()
        *   1、静态方法
        *   2、方法的参数是一个字符串
        *   3、字符串需要的是一个完整类名
        *   4、完整类名必须带有包名
        */
        Class c1 = null;

        Class c2 = null;
        try {
            c1 = Class.forName("java.lang.String"); // c1代表String.class文件，或者说c1代表String类型
            c2 = Class.forName("java.util.Date"); // c2代表Date类型
            Class c3 = Class.forName("java.lang.Integer"); // c3代表Integer类型
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // java中任何一个对象都有一个方法：getClass()
        String s = "bac";
        Class c4 = s.getClass(); // c4代表String.class字节码文件，c4代表String类型
        System.out.println(c4 == c1); // true，比较的是内存地址，都是指向方法区中的String.class字节码文件（字节码文件存放在方法区当中，只有一份）

        Date time = new Date();
        Class c5 = time.getClass();
        System.out.println(c5 == c2); // true，因为都指向方法区中的Date.class字节码文件

        // 第三种方式：java语言中任何一种类型，包括基本数据类型，它都有.class属性
        Class a = String.class;
        Class b = Date.class;
        Class d = int.class;
        System.out.println(a == c4); // true

    }
}

