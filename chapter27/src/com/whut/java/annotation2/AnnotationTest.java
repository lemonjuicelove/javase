package com.whut.java.annotation2;

public class AnnotationTest {

    // 如果一个注解当中有属性，那么必须给属性赋值。(除非该属性使用了default指定了默认值)
    // @MyAnnotation(属性名=属性值，属性名=属性值...)
    @MyAnnotation(name = "jack", color = "red")
    public void doSome(){
    }

}
