package com.whut.java.reflect;

import com.whut.java.bean.Student;

import java.lang.reflect.Field;

/*
* 必须掌握：
*   通过反射机制访问一个java对象的属性：
*       给属性赋值set
*       获取属性的值get
*/
public class ReflectTest07 {
    public static void main(String[] args) throws Exception{

        // 通过反射机制，访问一个对象的属性
        Class student = Class.forName("com.whut.java.bean.Student");
        Object obj = student.newInstance(); // obj就是student类的一个实例化对象

        // 获取no属性(根据属性的名称来获取Field)
        // noField现在就代表no属性了
        Field noField = student.getDeclaredField("no");
        System.out.println(noField.get(obj));
        // 给obj对象的no属性赋值222
        noField.set(obj, 222);
        // 读取obj对象的no属性的值
        System.out.println(noField.get(obj));

        // 访问私有的属性
        // 没有打破封装的时候，不能访问私有属性，会报错：java.lang.IllegalAccessException
        Field nameField = student.getDeclaredField("name");
       //  nameField.set(obj, "jack");
        // System.out.println(nameField.get(obj));

        // 打破封装(反射机制的缺点：打破封装)
        nameField.setAccessible(true); // 这行代码的作用就是在外部也可以访问private
        nameField.set(obj, "jack");
        System.out.println(nameField.get(obj));

    }
}
