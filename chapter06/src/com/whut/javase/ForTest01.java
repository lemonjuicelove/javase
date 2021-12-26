package com.whut.javase;
/*
 * 	1、for循环的语法机制以及运行原理
 * 	   语法机制：
 * 		for(初始化表达式; 条件表达式; 更新表达式){
 * 			循环体;
 * 		}
 * 		注意：第一：初始化表达式最先执行，并且在整个循环中只执行一次
 * 			   第二：条件表达式的结果必须是一个布尔类型
 * 		执行原理：
 * 			先执行初始化表达式，并且初始化表达式只执行1次。
 * 			然后判断条件表达式的结果，如果结果为true，则执行循环体
 * 			循环体结束之后，执行更新表达式
 * 			更新完之后，再判断条件表达式的结果
 * 			如果还是true，则继续执行循环体
 *
 * 			直到更新表达式执行结束之后，再次判断条件时，条件为false，for循环终止
 *
 * 		更新表达式的作用：控制循环的次数，如果缺少更新表达式，很有可能导致死循环。
 */
public class ForTest01 {
    public static void main(String[] args) {

        // 注意：i变量属于for循环的局部变量，for循环结束之后i的内存就释放了
        // 这个i变量只能在for循环中使用，属于for循环域，出了大括号之后就不能用了

        for(int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "-------->" + "i = " + i);
        }

        for(int i = 0; i < 10;) {
            System.out.println(Thread.currentThread().getName() + "-------->" + "i = " + i);
            i++;
        }

    }
}












