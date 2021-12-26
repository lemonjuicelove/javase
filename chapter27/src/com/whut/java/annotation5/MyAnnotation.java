package com.whut.java.annotation5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 只允许该注解出现在类，方法上
@Target({ElementType.TYPE, ElementType.METHOD})
// 这个注解可以被反射机制所读取
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

    // value属性
    String value() default "AHUT";

}
