package com.whut.java.annotation3;

/*
* 如果一个注解的属性名字是value，并且这个注解当中只有这一个属性的话
* 在使用的时候，该属性名value可以省略不写
*/
public class AnnotationTest {

    @MyAnnotation("hehe")
    public void doSome(){
    }

}
