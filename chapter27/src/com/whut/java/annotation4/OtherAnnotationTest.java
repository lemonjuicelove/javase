package com.whut.java.annotation4;

public class OtherAnnotationTest {

    // 给数组类型的属性赋值时用大括号
    @OtherAnnotation(age = 18, name = {"jack","tom"}, season = {Season.AUTUMN, Season.WINTER})
    public void doSome(){
    }

    // 如果数组中只有一个元素，大括号可以省略
    @OtherAnnotation(age = 18, name = "jack", season = Season.WINTER)
    public void doOther(){
    }

}
