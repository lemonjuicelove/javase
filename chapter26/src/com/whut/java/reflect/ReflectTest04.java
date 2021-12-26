package com.whut.java.reflect;

/*
* 如果只是希望一个类的静态代码块执行，其他代码一律不执行，
* 可以使用：Class.forName("完整类名");
* 这个方法的执行会导致类加载，类加载时，静态代码块执行
*
* 提示：学习JDBC技术的时候需要用到
*/
public class ReflectTest04 {
    public static void main(String[] args) {

        try {
            // Class.forName()这个方法的执行会导致：类加载(方法区中会加载MyClass.class字节码文件)
            Class.forName("com.whut.java.reflect.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
