package com.whut.javase;

import java.util.Scanner;

public class KeyInput {
    public static void main(String[] args) {

        // 创建一个接收键盘输入的对象
        Scanner s = new Scanner(System.in);

        System.out.print("请输入一个正整数：");
        int i = s.nextInt(); // 接收一个正整数
        System.out.println("输入的数字是：" + i);

        System.out.print("请输入一个字符串：");
        String str = s.next(); // 接收一个字符串
        System.out.println("输入了：" + str);

        System.out.print("请输入用户名：");
        String name = s.next();
        System.out.println("欢迎"+name+"回来");

    }
}
