package com.whut.java.annotation;

public class AnnotationTest03 {
    public static void main(String[] args) {
        T t = new T();
        t.doSome();
        t.doOther();
    }
}

class T{
    // Deprecated这个注解标注的元素已过时
    // 这个注解主要是向其他程序员传递一个信息，告知该元素已过时，有更好的解决方法
    @Deprecated
    public void doSome(){
        System.out.println("doSome...");
    }
    @Deprecated
    public void doOther(){
        System.out.println("doOther...");
    }
}
