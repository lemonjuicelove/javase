package com.whut.java.annotation5;

@MyAnnotation("wuhan")
public class MyAnnotationTest {

    // @MyAnnotation  // 编译报错
    int i;

    @MyAnnotation
    public void doSome(){}

}
