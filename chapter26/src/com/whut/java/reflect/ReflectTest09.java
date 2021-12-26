package com.whut.java.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/*
* 反编译一个类的方法
*/
public class ReflectTest09 {
    public static void main(String[] args) throws Exception{

        StringBuffer s = new StringBuffer();
        Class userServiceClass = Class.forName("java.lang.String");

        s.append(Modifier.toString(userServiceClass.getModifiers()));
        s.append(" class ");
        s.append(userServiceClass.getSimpleName() + " {" + "\n");

        Method[] methods = userServiceClass.getDeclaredMethods();
        for (Method method: methods){
            s.append("\t");

            s.append(Modifier.toString(method.getModifiers()));
            if (method.getModifiers() != 0){
                s.append(" ");
            }
            s.append(method.getReturnType().getSimpleName() + " ");
            s.append(method.getName() + "(");

            Class[] parameters = method.getParameterTypes();
            for (Class parameter : parameters){
                s.append(parameter.getSimpleName() + ",");
            }
            // 如果参数列表中形参的长度不为0，那么删去多余的","
            if (parameters.length != 0){
                s.deleteCharAt(s.length() - 1);
            }
            s.append("){}\n" );
        }
        s.append("}");

        System.out.println(s);

    }
}
