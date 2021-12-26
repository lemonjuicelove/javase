package com.whut.javase;
/*
 * 	从键盘上接收一个正整数，该正整数作为行数，输出以下图形
 * 	例如输入5，则打印如上图5行
 *       *
 *      ***
 *     *****
 *    *******
 *   *********
 *
 *   *特点：正整数为行数，每行的*的个数为2n-1，
 *   空格特点： 第一行空格 n-1;
 *            第二行空格 n-2;
 *            第三行空格 n-3；
 *            ........
 */
public class Homework07 {
    public static void main(String[] args) {

        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入一个正整数作为行数：");
        int i = s.nextInt();
        for(int j = 1; j <= i; j++) { // 控制行数
            // 内部需要两个独立的循环分别控制每行的空格和*
            for(int n = 1; n <= i-j; n++) { // 控制每行输出的空格数
                System.out.print(" ");
            }
            for(int m = 1; m <= 2*j-1; m++) {// 控制每行输出的*的个数
                System.out.print("*");
            }
            System.out.println(); // 换行
        }

    }
}
