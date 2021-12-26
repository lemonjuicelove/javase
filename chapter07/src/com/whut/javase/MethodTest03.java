package com.whut.javase;
/*
 * 	不仅可以在main方法中调用方法，在其他方法中也可以调用方法
 */
public class MethodTest03 {

    public static void main(String[] args) {
        System.out.println("main begin");
        MethodTest03.m1();
        System.out.println("main over");
    }

    public static void m1() {
        System.out.println("m1 begin");
        MethodTest03.m2();
        System.out.println("m1 over");
    }

    public static void m2() {
        System.out.println("m2 begin");
        T.m3();
        System.out.println("m2 over");
    }

}

class T{
    public static void m3() {
        System.out.println("m3 begin");
        System.out.println("m3 is doing");
        System.out.println("m3 over");
    }
}

