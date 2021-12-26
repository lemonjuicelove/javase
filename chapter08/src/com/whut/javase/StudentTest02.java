package com.whut.javase;

public class StudentTest02 {
    public static void main(String[] args) {

        // 编译错误：不能对非静态字段 Student.xueHao 进行静态引用
        // 不能通过类名来直接访问实例变量，要先创建对象
        // System.out.println(Student.xueHao);

        // 创建学生对象1，s1属于局部变量，局部变量存储在栈内存当中
        // s1这个局部变量又叫做引用
        Student s1 = new Student();
        // 怎么访问实例变量，语法：引用.实例变量名
        System.out.println(s1.age);

    }
}
