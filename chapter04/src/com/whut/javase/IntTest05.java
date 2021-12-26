package com.whut.javase;
/*
 * 结论：byte short char做运算时，各自先转换成int再做运算
 */
public class IntTest05 {
    public static void main(String[] args) {

        System.out.println('a' + 'b'); // 195

        char i = 'a';
        short b = 1;
        // short s = i + b;
        // 错误，因为编译器只知道这是个int类型，不知道最后结果有没有超出short类型的范围

        short s = (short)(i + b); // 强制转换
        int a = 1;
        // short x = a; 错误，因为编译器只知道a是int类型，不知道a中存储的值有没有超出short类型的范围

        // 编译器只负责编译，检查语法有没有问题，并不运行，所以只知道变量的类型，不知道变量中的值

    }
}
