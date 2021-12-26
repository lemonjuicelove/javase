package com.whut.javase;

public class MethodTest05 {

    public static void main(String[] args) {
        MethodTest05.m2();
    }

    /*
	  public static int m1() {
		boolean flag = true; // 编译器不会去运行程序，只看语法逻辑错没错
		// 编译器只知道flag变量是boolean类型，它会认为flag可能是true，可能是false
		if(flag) {
			// 编译器认为下面代码可能会执行，可能不会执行
			// 为了确保一定会有返回值，所以会报错
			return 1;
		}
	}
	*/

    // 在同一个域当中，"return语句"下面不能再编写其他代码，编译会报错
    // 因为在同一个域当中，"return语句"下面的代码永远执行不到
    public static int m2() {
        boolean flag = true;
        if(flag) {
            return 1;
        }
        System.out.println("abc");
        return 0;
        // 错误：不可达代码
        // System.out.println("abc");
    }

}
