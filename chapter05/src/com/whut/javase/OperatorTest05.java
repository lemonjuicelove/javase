package com.whut.javase;
/*
 * 	条件运算符：（三目运算符）
 * 		语法格式： 布尔表达式 ? 表达式1 : 表达式2
 *
 * 		执行原理：布尔表达式的结果为true时，表达式1的执行结果作为整个表达式的结果
 * 		         布尔表达式的结果为false时，表达式2的执行结果作为整个表达式的结果
 *
 * 		注意：要用一个变量去接收布尔表达式的运算结果，而不能直接作为单独的java语句
 */
public class OperatorTest05 {
    public static void main(String[] args) {

        boolean sex = true;
        System.out.println(sex ? "man" : "woman");

        boolean weather = false;
        System.out.println(weather ? "晴天" : "雨天");

    }
}
