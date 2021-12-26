package com.whut.javase;
/*
 * 	什么时候需要考虑使用方法重载：
 * 		在同一个类当中，如果"功能1"和"功能2"它们的功能相似，那么可以考虑使用方法重载
 *
 * 		注意：方法重载不能随便使用，如果两个功能毫不相关，此时两个方法使用重载机制的话，
 * 		会导致编码复杂，无法进行方法功能的区分
 *
 * 	什么时候代码会发生方法重载：
 * 		条件1：在同一个类当中
 * 		条件2：方法名相同
 * 		条件3：参数列表不同
 * 			  参数的个数不同算不同、参数的类型不同算不同、参数的顺序不同算不同
 * 	只要同时满足以上3个条件，那么我们就可以认定方法和方法之间发生了重载机制
 *
 * 	注意：不管代码怎么写，最终要让java编译器能够区分两个方法，这样编译才能通过
 *
 * 	方法重载和方法的返回值类型、修饰符列表无关
 */
public class OverloadTest03 {

    public static void main(String[] args) {
    }

    public static void m1() {
    }
    public static void m1(int x) { // 参数的个数不同
    }

    public static void m2(int x) {
    }
    public static void m2(double x) { // 参数的类型不同
    }

    public static void m3(int x, double y) {
    }
    public static void m3(double x, int y) { // 参数的顺序不同
    }

}
