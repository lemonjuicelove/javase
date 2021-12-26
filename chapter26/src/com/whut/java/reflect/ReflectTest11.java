package com.whut.java.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/*
* 反编译一个类的Constructor构造方法
*/
public class ReflectTest11 {
    public static void main(String[] args) throws Exception{

        StringBuffer s = new StringBuffer();
        Class vipClass = Class.forName("java.lang.reflect.Method");

        s.append(Modifier.toString(vipClass.getModifiers()));
        s.append(" class ");
        s.append(vipClass.getSimpleName());
        s.append(" {\n");

        Constructor[] constructors = vipClass.getDeclaredConstructors();
        for (Constructor constructor : constructors){
            s.append("\t");
            s.append(Modifier.toString(constructor.getModifiers()));
            if (constructor.getModifiers() != 0){
                s.append(" ");
            }
            s.append(vipClass.getSimpleName());
            s.append("(");

            Class[] parameters = constructor.getParameterTypes();
            for (Class parameter : parameters){
                s.append(parameter.getSimpleName() + ",");
            }
            if (parameters.length > 0){
                s.deleteCharAt(s.length()-1);
            }
            s.append(") ");
            s.append("{}\n");
        }
        s.append("}");
        System.out.println(s);

    }
}
