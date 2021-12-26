package com.whut.java.annotation5;

public class ReflectAnnotationTest {
    public static void main(String[] args){

        // 获取这个类
        Class c = null;
        try {
            c = Class.forName("com.whut.java.annotation5.MyAnnotationTest");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 判断该类上面是否有@MyAnnotation
        // System.out.println(c.isAnnotationPresent(MyAnnotation.class));
        if (c.isAnnotationPresent(MyAnnotation.class)){

            // 获取该注解对象。此处不需要使用instanceof是因为在if条件处已经进行判断了，程序能执行到这里说明肯定是MyAnnotation类型
            MyAnnotation myAnnotation = (MyAnnotation) c.getAnnotation(MyAnnotation.class);

            System.out.println("该类的注解：" + myAnnotation);

            // 获取注解对象的属性(赋过值的属性)
            System.out.println(myAnnotation.value());

        }

    }
}
