package com.whut.java.annotation;

/*
* 关于JDK lang包下的Override注解
* 源代码：public @interface Override {}
*
* 标识性注解，给编译器做参考用的：
*       编译器看到这个方法上有Override注解的时候，编译器会自动检查该方法是否重写了父类的方法。
*       如果没有，编译器会报错。
* 这个注解只是在编译阶段起作用，和运行期无关
*/

// @Override这个注解只能注解方法，因为它有元注解@Target({ElementType.METHOD})注解
public class AnnotationTest02 {
    @Override
    public String toString() {
        return "AnnotationTest02{}";
    }
}
