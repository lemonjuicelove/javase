package com.whut.javase;

import java.util.Scanner;

/*
 * 打车起步价8元（3km之内）
 * 超过3km，超出的每公里1.2元
 * 超过5km，超出的每公里1.5元
 * 在键盘上接收公里数，得出总价
 */
public class Homework02 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("请输入里程数：");
        double distance = s.nextDouble();

        double money = 8.0;
        if (distance <= 3.0){
            System.out.println("车费为：" + money);
        }else if (distance <= 5){
            money = money + 1.2*(5-distance);
            System.out.println("车费为：" + money);
        }else {
            money = money + 2.4 + 1.5*(distance-5);
            System.out.println("车费为：" + money);
        }

    }
}
