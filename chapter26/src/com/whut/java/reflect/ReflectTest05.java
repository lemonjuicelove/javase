package com.whut.java.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;


/*
* 反射Student类当中所有的Field(了解)
*/
public class ReflectTest05 {
    public static void main(String[] args) throws Exception {

        // 获取整个类
        Class studentClass = Class.forName("com.whut.java.bean.Student");

        // 获取一个类的完整类名(带包名)
        String studentClassName = studentClass.getName();
        System.out.println("完整类名：" + studentClassName);

        // 获取一个类的简短类名
        String studentClassSimpleName = studentClass.getSimpleName();
        System.out.println("简类名：" + studentClassSimpleName);

        // 获取类中所有的public修饰的Field
        Field[] studentFields = studentClass.getFields();
        System.out.println(studentFields.length); // 2个元素

        // 获取类中所有的Field
        Field[] studentFieldsAll = studentClass.getDeclaredFields();
        System.out.println(studentFieldsAll.length); // 5个元素

        // 遍历Field数组
        for(Field field : studentFieldsAll){

            System.out.println("------------------");

            // 获取属性的修饰符
            int i = field.getModifiers(); // 返回的修饰符是一个数字，每个数字是修饰符的代号
            // 将数字代号转换为字符串
            String fieldModifier = Modifier.toString(i);
            System.out.println("属性的修饰符是：" + fieldModifier);

            // 获取属性的数据类型
            Class fieldType = field.getType();  // 属性的数据类型其实就是一个类，所以返回值类型是Class
            String fieldTypeName = fieldType.getSimpleName();
            System.out.println("属性的类型是：" + fieldTypeName);

            // 获取属性的名字
            String fieldName = field.getName();
            System.out.println("属性的名字是：" + fieldName);

        }

    }
}
