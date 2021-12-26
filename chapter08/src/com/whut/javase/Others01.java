package com.whut.javase;
/*
 * 	java中规定：参数传递时，和类型无关，不管是基本数据类型还是引用数据类型，都是将变量中保存的那个值复制一份传递过去
 * 	参数传递时，一定是将保存的值复制一份传递过去。内存地址也是值
 *
 * 重点：java中，方法的调用只支持参数的值传递
 */
public class Others01 {

    public static void main(String[] args) {
        int i = 10; // 局部变量，域是main域
        add(i); // 将i变量中的值复制了一份传递到方法中，并没有将该作用域中的局部变量i传进去
        System.out.println("main中i的值是：" + i); // 10
    }

    public static void add(int i) { // 局部变量，域是add域
        i++;
        System.out.println("add中i的值是：" + i); // 11
    }

}
