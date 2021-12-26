package com.whut.javase.collection;

public class MyClass {
    public static void main(String[] args) {

        // 调用静态内部类中的静态方法
        MyClass.InnerClass.m1();

        // 要创建对象调用实例方法
        // MyClass.InnerClass就是这个静态内部类的类名
        MyClass.InnerClass mi = new MyClass.InnerClass();
        mi.m2();

    }

    // 声明一个静态内部类
    private static class InnerClass {

        // 静态方法
        public static void m1(){
            System.out.println("静态内部类中的静态方法执行");
        }

        // 实例方法
        public void m2(){
            System.out.println("静态内部类中的实例方法执行");
        }
    }
}
