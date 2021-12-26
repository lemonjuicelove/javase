package com.whut.javase;

import java.util.Scanner;

/*
 * 业务要求：
 * 		1、从键盘上接收一个人的年龄
 * 		2、年龄要求为[0~150]，其他值提示非法，需要提示非法信息
 * 		3、根据人的年龄判断人属于哪个阶段
 * 		4、使用if语句完成
 */
public class IfTest02 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("请输入年龄:");
        int age = s.nextInt();
        String answer = "非法的年龄";


        if (age > 150 || age < 0){
            try {
                throw new AgeException(answer);
            } catch (AgeException e) {
                System.out.println(e.getMessage());
            }
        }else if(age < 10){
            answer = "少年";
        }else if (age < 25){
            answer = "青年";
        }else if (age < 50){
            answer = "中年";
        }else{
            answer = "老年";
        }

        if (!("非法的年龄".equals(answer))){
            System.out.println("该年龄属于：" + answer);
        }


    }
}

class AgeException extends Exception{

    public AgeException() {
    }

    public AgeException(String message) {
        super(message);
    }

}