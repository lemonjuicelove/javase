package com.whut.javase;
/*
 * 	while循环：
 * 		1、while循环的语法机制以及执行原理
 * 		      语法机制：
 * 				while(布尔表达式){
 * 					循环体;
 * 				}
 * 		       执行原理：
 * 				判断布尔表达式的结果，如果为true就执行循环体，循环体结束之后，
 * 				再次判断布尔表达式的结果，如果还是true，继续执行循环体，直到
 * 				布尔表达式结果为false，while循环结束
 *
 * 		2、while循环的循环次数为：0~n次
 */

/*
 * 本质上while循环和for循环原理是相同的
 *
 * for(初始化表达式; 布尔表达式; 更新表达式){
 * 		循环体;
 * }
 *
 * 初始化表达式;
 * while(布尔表达式){
 * 		循环体;
 * 		更新表达式;
 * }
 */
public class WhileTest01 {
    public static void main(String[] args) {

        int i = 0;
        while(i < 5) {
            System.out.println("i = " + i);
            i++;
        }

        for(int k = 0; k < 5; k++) {
            System.out.println("k = " + k);
        }

    }
}
