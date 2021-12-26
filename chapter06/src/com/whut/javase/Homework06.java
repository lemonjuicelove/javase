package com.whut.javase;
/*
 * 	从控制台接收一个正整数，判断该数字是否为质数
 * 	质数：在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数
 *
 * 思路：for循环和--求出所有的数，然后%，进行判断
 * 重点：打一个布尔标记
 */
public class Homework06 {
    public static void main(String[] args) {

        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int i = s.nextInt();
        boolean m = true; // 重点是在外部打布尔标记
        if(i == 1) {
            m = true;
        }
        for(int j = 2 ; j < i; j++) { // 除以1和它本身之外的所有数，只要有一个余数为0，程序结束，不是质数
            if(i % j == 0) {
                m = false;
                break;
            }
        }
        // 在for循环里不好输出，就在for循环外输出
        // 也可以使用三目运算符进行判断
        System.out.println(i + (m ? "是" : "不是") + "质数");

    }
}
