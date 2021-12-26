package com.whut.javase;
/*
 * 	do...while循环语句的执行原理以及语法机制：
 * 		语法机制：
 * 			do{
 * 				循环体;
 * 			}while(布尔表达式);
 *
 * 		注意：do...while循环最后的时候别漏掉 ";"
 *
 * 		执行原理：
 * 			先执行循环体中的代码，执行一次循环体之后，再判断
 * 			布尔表达式的结果，如果为true，则继续执行循环体，
 * 			如果为false，则循环结束
 *
 * 			先执行后判断
 *
 * 		对于do...while循环，循环体执行次数为：1~n次。
 */
public class DoWhileTest01 {
    public static void main(String[] args) {

        int k = 0;
        do {
            System.out.println(++k);
        }while(k < 5);

    }
}
