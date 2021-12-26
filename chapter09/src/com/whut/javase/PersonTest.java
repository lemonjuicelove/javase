package com.whut.javase;

public class PersonTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        int age = p1.getAge();  // 读的操作，get方法有一个返回值
        System.out.println(age);

        p1.setAge(100);     // 只进行改的操作，读的话还得调用get方法
        System.out.println(p1.getAge());
        p1.setAge(-50);

    }
}
