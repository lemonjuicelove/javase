package com.whut.java.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

// 通过反射机制，反编译一个类的属性Field(了解)

public class ReflectTest06 {
    public static void main(String[] args) throws Exception{

        // 创建StringBuffer对象方便字符串的拼接
        StringBuffer s = new StringBuffer();

        Class studentClass = Class.forName("com.whut.java.bean.Student");
        s.append(Modifier.toString(studentClass.getModifiers()) + " class " + studentClass.getSimpleName() + "{\n");

        Field[] fields = studentClass.getDeclaredFields();
        for (Field field : fields){
            s.append("\t");
            s.append(Modifier.toString(field.getModifiers()));
            if (field.getModifiers() != 0){
                s.append(" ");
            }
            s.append(field.getType().getSimpleName());
            s.append(" ");
            s.append(field.getName());
            s.append(";\n");
        }
        s.append("}");
        System.out.println(s);

    }
}
