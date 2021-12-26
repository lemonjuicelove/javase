package com.whut.java.reflect;

import com.whut.java.bean.Vip;

import java.lang.reflect.Constructor;

/*
* 通过反射机制调用构造方法创建java对象
*/
public class ReflectTest12 {
    public static void main(String[] args) throws Exception{

        Class vipClass = Class.forName("com.whut.java.bean.Vip");
        // 默认调用无参构造创建对象
        Object obj = vipClass.newInstance();

        // 调用有参的构造方法
        // 第一步：先获取到这个有参的构造方法
        Constructor c1 = vipClass.getDeclaredConstructor(int.class, String.class, int.class, String.class);
        // 第二步：调用该构造方法new对象
        Object newObj1 = c1.newInstance(111,"jack",18,"whut");
        System.out.println(newObj1);

        // 调用无参的构造方法
        // 第一步：获得无参的构造方法
        Constructor c2 = vipClass.getDeclaredConstructor();
        // 第二步：调用该构造方法new对象
        Object newObj2 = c2.newInstance();
        System.out.println(newObj2);

    }
}
