package com.whut.javase;
/*
 * 	局部变量：只在方法体中有效，方法结束之后，局部变量的内存就释放了
 * 	JVM三块主要的内存：栈内存、堆内存、方法区内存
 * 	方法区最先有数据：方法区中存放代码片段。存放编译之后的class字节码
 * 	堆内存：存放新创建的实例对象
 * 	栈内存：方法调用的时候，该方法需要的内存空间在栈中分配
 *
 * 	方法不调用是不会在栈中分配空间的
 * 	方法只有在调用的时候才会在栈中分配空间，并且调用时就是压栈
 * 	方法执行结束之后，该方法所需要的空间就会释放，此时发生弹栈动作
 */

// 对照方法执行时的内存变化图去理解
public class MethodTest06 {

    public static void main(String[] args) {
        System.out.println("main begin");
        int x = 100;
        m1(x);
        System.out.println("main over");
    }

    public static void m1(int i) {
        System.out.println("m1 begin");
        m2(i);
        System.out.println("m1 over");
    }

    public static void m2(int i) {
        System.out.println("m2 begin");
        m3(i);
        System.out.println("m2 over");
    }

    public static void m3(int i) {
        System.out.println("m3 begin");
        System.out.println(i);
        System.out.println("m3 over");
    }

}
