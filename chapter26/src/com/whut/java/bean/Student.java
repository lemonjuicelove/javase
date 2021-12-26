package com.whut.java.bean;

// 反射属性Field
public class Student {

    // Field翻译为字段，其实就是属性/成员
    // 5个Field，分别采用了不同的访问控制权限修饰符
    private String name; // 整个这行代码就是一个Field对象
    protected int age;
    boolean sex;
    public int no;
    public static final double MATH_PI = 3.14;

}
