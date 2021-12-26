package com.whut.javase;
/*
 * 逻辑运算符：
 * 		&   逻辑与（并且）
 * 		|   逻辑或（或者）
 * 		!   逻辑非（取反）
 * 		&&  短路与
 * 		||  短路或
 * 规则：逻辑运算符两边要求都是布尔类型，并且最终的运算结果也是布尔类型
 */
public class OperatorTest03 {
    public static void main(String[] args) {

        // 对于逻辑与运算符来说，只要有一边是false，结果就是false
        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & false);

        // 对于逻辑或运算符，只要有一边是true，结果就是true
        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | false);

        /*
         * 关于短路与&&,短路或||
         *
         * 短路与&&和逻辑与&有什么区别
         * 		首先这两个运算符的运算结果 没有任何区别，完全相同
         * 		只不过“短路与&&”会发生短路现象
         *
         * 什么是短路现象：右边的表达式不执行，这种现象叫做短路现象
         *
         * 什么时候使用&&，什么时候使用&:
         * 		从效率方面来说，&&比&的效率高一些
         * 		因为逻辑与&不管第一个表达式结果是什么，第二个表达式一定会执行
         */
        int a = 10;
        int b = 11;
        // 使用逻辑与&的时候，两边的表达式都会执行
        System.out.println(a > b & a > b++);
        System.out.println(b);

        int x = 10;
        int y = 11;
        // 使用短路与&&的时候，当左边的表达式为false时，右边的表达式不执行。这种现象称为短路
        System.out.println(x > y && x > y++);
        System.out.println(y);

        // 什么时候发生短路或现象：当左边的表达式结果为true时，右边的表达式不执行，发生短路现象

    }
}
