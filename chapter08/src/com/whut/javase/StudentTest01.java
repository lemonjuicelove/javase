package com.whut.javase;
/*
 * 	对象的创建和使用
 * 		创建对象的语法：new 类名();
 * 		类是模板，通过一个类，可以创建n个对象
 */
public class StudentTest01 {
    public static void main(String[] args) {

        /*
         *	Student是变量s1的数据类型 (引用数据类型)
         *	s1是变量名，也是一个引用
         *	new Student(); 是一个对象 (Student类创建出来的对象)
         *
         *	数据类型包括两种：基本数据类型和引用数据类型
         *	java中所有的"类"都属于引用数据类型
         */

        // 通过Student这个类实例化了一个Student对象，并且给它一个变量名叫s1
        Student s1 = new Student();

        /*
         * 关于编译过程：按说应该先编译Student.java文件，然后再编译StudentTest.java文件
         * 但是可以先编译StudentTest.java文件，会自动找Student.class文件，如果没有，会
         * 自动编译Student.java文件，生成对应的Student.class文件。
         */

    }
}
