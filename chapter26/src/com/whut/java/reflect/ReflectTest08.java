package com.whut.java.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.sql.SQLOutput;

/*
* 反射Method
*/
public class ReflectTest08 {
    public static void main(String[] args) throws Exception{

        Class userServiceClass = Class.forName("com.whut.java.service.UserService");
        // 获取所有的Method(包括私有)
        Method[] methods = userServiceClass.getDeclaredMethods();

        for (Method method : methods){
            System.out.println("--------------------");

            // 获取方法的修饰符列表
            System.out.println(Modifier.toString(method.getModifiers()));

            // 获取方法的返回值类型
            System.out.println(method.getReturnType().getSimpleName());

            // 获取方法的名字
            System.out.println(method.getName());

            // 获取方法的参数列表(一个方法的参数列表中，最重要的是形参的数据类型)
            Class[] parameters = method.getParameterTypes();
            for (Class parameter : parameters){
                System.out.println(parameter.getSimpleName());
            }

        }

    }
}
