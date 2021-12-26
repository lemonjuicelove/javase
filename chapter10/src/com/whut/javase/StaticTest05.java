package com.whut.javase;
/*
 * 	1、使用static关键字可以定义：静态代码块
 *
 * 	2、静态代码块的语法格式：
 * 		static {
 * 			java语句;
 * 		}
 *
 * 	3、static静态代码块在什么时候执行：类加载时执行，并且只执行一次
 *
 * 	4、注意：静态代码块在main方法执行之前执行(有静态代码块先执行静态代码块)
 *
 * 	5、有多个静态代码块时，一般按照自上而下的顺序执行
 *
 * 	6、静态代码块的作用：
 * 	      第一：静态代码块并不是很常用，有具体的业务要求时才会使用
 * 	      第二：静态代码块这种语法机制给我们提供了一个特殊的时刻，叫做：类加载时刻
 *
 *	      具体的业务：在编写的程序中，只要是类进行加载，记录一下类加载的日志信息
 *	      这些记录日志的代码写在哪里：写到静态代码块当中
 */
public class StaticTest05 {

    // 静态代码块
    static {
        int k = 0; // 属于静态变量 因为整个代码块都是被static修饰的
        System.out.println("a");
    }

    // 一个类中可以编写多个静态代码块
    static {
        System.out.println("b");
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }

    static {
        System.out.println("c");
    }

}
