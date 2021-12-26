package com.whut.javase;
/*
 * 	1、什么是方法递归
 * 		方法自己调用自己，就是方法递归
 *
 * 	2、当递归时程序没有结束条件，会发生栈内存溢出错误:StackOverflowError
 * 	   所以：方法递归必须要有结束条件
 *
 * 	3、假设递归有结束条件，且合法，递归有时候也会出现栈内存溢出错误
 * 	   因为有可能是递归的太深，栈内存不够
 *
 * 	4、在实际开发中，不建议使用递归，能用循环就用循环代替。
 * 	   因为循环的效率高，耗费的内存小，递归耗费的内存比较大，并且如果递归使用不当，会导致JVM死掉。但是有些程序必须使用递归才能实现。
 * 	   JVM发生错误后只有一个结果，就是退出JVM
 *
 * 	5、解决栈内存溢出错误:StackOverflowError的思路
 * 		第一步：先检查递归的结束条件对不对，如果不对，进行修改
 * 		第二步：如果递归条件没问题，那么需要手动调整JVM的栈内存初始大小，将栈内存空间调大一点
 * 		第三步：调整大小后，运行还是出错，那么只能继续调整栈内存空间大小
 */
public class RecursionTest01 {

    public static void main(String[] args) {
        int i = 5;
        int jieGuo = sum2(i);
        System.out.println(jieGuo);
    }

    // 使用循环计算1-n的和
    public static int sum1(int i) {
        int result = 0;
        for(int j = 1; j <= i; j++) {
            result += j;
        }
        return result;
    }

    // 使用递归计算1-n的和
    public static int sum2(int i) {
        if(i == 1) { // 递归的结束条件
            return 1;
        }
        // 可以通过方法调用的内存图进行理解
        return i + sum2(i-1);
    }

}
