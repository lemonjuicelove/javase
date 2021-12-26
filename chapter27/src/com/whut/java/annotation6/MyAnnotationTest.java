package com.whut.java.annotation6;

import java.lang.reflect.Method;

public class MyAnnotationTest {

    @MyAnnotation(username = "jack",password = "1218")
    public void doSome(){

    }

    public static void main(String[] args){

        Class c = null;
        Method doSomeMethod = null;
        try {
            c = Class.forName("com.whut.java.annotation6.MyAnnotationTest");
            doSomeMethod = c.getDeclaredMethod("doSome");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


        // 判断这个方法上是否存在这个注解
        if (doSomeMethod.isAnnotationPresent(MyAnnotation.class)){
            // 获取这个注解对象
            MyAnnotation myAnnotation = doSomeMethod.getAnnotation(MyAnnotation.class);


            System.out.println("该方法的注解是：" + myAnnotation);
            // 输出username属性
            System.out.println("username = " + myAnnotation.username());
            // 输出password属性
            System.out.println("password = " + myAnnotation.password());
        }

    }

}
