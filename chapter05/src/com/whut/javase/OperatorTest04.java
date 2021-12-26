package com.whut.javase;
/*
 * 赋值运算符：
 * 		1、赋值运算符包括“基本赋值运算符”和“扩展赋值运算符”
 * 		2、基本赋值运算符：=
 * 		3、扩展赋值运算符：+=  -=  *=  /=  %=
 * 		4、语法机制：使用扩展赋值运算符时，永远都不会改变运算结果的数据类型
 */
public class OperatorTest04 {
    public static void main(String[] args) {

        // 赋值运算符“=”右边优先级高，先执行右边的表达式，在赋值给左边
        int i = 10;

        // 分析：i += 10 和 i = i + 10 是否完全一样
        byte x = 100;

        // x = x + 1; 编译报错：因为x+1的运算结果是int类型，而x是一个byte类型的变量
        // 相当于 x = (byte)(x + 1);
        // 结论：使用扩展赋值运算符时，变量的类型不会改变
        x += 1;
        System.out.println(x);

    }
}
