package com.whut.javase;
/*
 * 关系运算符： >  >=   <   <=   ==   !=
 * 		规则：所有的关系运算符的运算结果都是布尔类型
 * 		     不是true就是false，没有其他值
 *
 * 		在java语言中：
 * 			=：赋值运算符
 * 			==：关系运算符，判断是否相等
 *
 */
public class OperatorTest02 {
    public static void main(String[] args){

        int a = 10;
        int b = 10;
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);

    }
}
