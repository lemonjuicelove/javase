package com.whut.javase;

/*
    System.out.println("hello world");
	System.out中，out后面没有小括号，说明out是变量名
	另外System是一个类名，直接使用类名System.out，说明out是一个静态变量
	静态变量可以调用方法，说明该静态变量是一个引用
	System.out返回一个对象，然后采用"对象."的方式访问println()方法
 */
public class Test01 {

    static Student s1 = new Student();

    public static void main(String[] args) {
        // 通过实例去理解
        Test01.s1.exam();
        System.out.println("hello world");
    }

}

class Student{
    public void exam() {
        System.out.println("正在考试");
    }
}
