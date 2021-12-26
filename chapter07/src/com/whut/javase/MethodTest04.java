package com.whut.javase;
/*
 * 	break;语句和return;语句有什么区别：
 * 		级别不同
 * 		break; 用来终止switch或者终止离它最近的循环
 * 		return; 用来终止离它最近的一个方法
 *
 *  return;语句的级别高于break;语句
 */
public class MethodTest04 {
    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) {
            if(i == 5) {
                break; // 终止for循环 ，hello world会输出
                // return; // 终止了当前方法，hello world不会输出
            }
            System.out.println("i = " + i);
        }
        System.out.println("hello world");

    }
}
