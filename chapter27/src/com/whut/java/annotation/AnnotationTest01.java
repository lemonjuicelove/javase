package com.whut.java.annotation;

@MyAnnotation
@Deprecated
public class AnnotationTest01 {

    @MyAnnotation
    int no;

    @MyAnnotation
    public AnnotationTest01(int no) {
        this.no = no;
    }

    public static void main(String[] args) {

    }

}
