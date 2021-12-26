package com.whut.javase;
/*
 * 	1、除了静态代码块之外，还有一种语句块叫做：实例语句块
 *
 * 	2、实例语句语法：
 * 		{
 * 			java语句;
 * 		}
 *
 * 	3、实例语句块在什么时候执行：
 * 	   		   实例语句在类加载时并没有执行，new对象的时候执行
 * 	    	  只要是构造方法执行，必然在构造方法执行之前，自动执行实例语句块中的代码
 * 	    	  每一次构造方法执行之前，都会先自动执行实例语句块
 * 	    	  实际上这也是一个特殊的时机，叫做：对象构建时机
 */
public class InstanceCode {

    private int i = 1;
    // 实例语句块
    {
        System.out.println("实例语句块1执行");
        System.out.println(i);
    }

    {
        System.out.println("实例语句块2执行");
    }

    public InstanceCode() {
        System.out.println("无参数构造方法执行");
    }
    public InstanceCode(int i) {
        System.out.println("有参数构造方法执行");
    }

    public static void main(String[] args) {
        System.out.println("main begin");
        new InstanceCode();
        new InstanceCode(100);
    }

}
