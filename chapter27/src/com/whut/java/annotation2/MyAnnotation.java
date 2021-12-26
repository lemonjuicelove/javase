package com.whut.java.annotation2;

public @interface MyAnnotation {

    /*
    * 我们通常在注解当中可以定义属性，语法格式看上去像个方法，但实际上称之为属性
    */

    // name属性
    String name();
    // 颜色属性
    String color();
    // 年龄属性
    int age() default 24; // 属性默认值

}
