package com.whut.javase;

/*
 * 	带有static的方法和没有static的方法分别怎么调用
 * 	带有static的方法调用：通过"类名."的方式访问
 *  (也可以通过"引用."的方式访问，因为在运行的时候还是会变成"类名."的方式)
 *
 * 	对象被称为实例，实例相关的有：实例变量、实例方法
 * 	实例变量是对象变量，实例方法是对象方法
 * 	实例相关的都需要先new对象，通过"引用."的方式去访问
 */

public class MethodTest {
    public static void main(String[] args) {

        Method.doSome(); // 调用静态方法

        Method m = new Method();
        m.doOther(); // 调用实例方法

    }
}
class Method{
    public static void doSome() { // 类名.的方式去访问
        System.out.println("do some");
    }

    public void doOther() { // 引用.的方式去访问
        System.out.println("do other");
    }
}