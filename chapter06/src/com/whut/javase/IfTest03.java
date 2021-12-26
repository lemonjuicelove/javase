package com.whut.javase;

import java.util.Scanner;

/*
 * 	题目：
 * 		从键盘上接收天气的信息：
 * 			1表示：雨天
 * 			0表示：晴天
 * 		同时从键盘上接收性别的信息：
 * 			1表示：男
 * 			0表示：女
 * 		业务要求：
 * 			当天气是雨天时：
 * 				男：打一把大黑伞
 * 				女：打一把小花伞
 * 			当天气是晴天的时候：
 * 				男：芜湖起飞，出去玩耍
 * 				女：化妆之后，出去玩耍
 */
public class IfTest03 {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        System.out.print("请选择天气信息：");
        int weather = s1.nextInt();
        System.out.print("请选择性别信息：");
        int sex = s2.nextInt();

        if (weather == 1){
            if (sex == 1){
                System.out.println("下雨天，真男人从不打伞");
            }else if (sex == 0){
                System.out.println("女孩子下雨出门要打伞");
            }else{
                try {
                    throw new SexException("性别信息不正确");
                } catch (SexException e) {
                    System.out.println(e.getMessage());
                }
            }
        }else if (weather == 0){
            if (sex == 1){
                System.out.println("大晴天，出去游泳");
            }else if (sex == 0){
                System.out.println("晴天，在家追剧");
            }else{
                System.out.println("性别信息不正确");
            }
        }else {
            try {
                throw new WeatherException("天气信息不正确");
            } catch (WeatherException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
class SexException extends Exception{
    public SexException() {
    }
    public SexException(String message) {
        super(message);
    }
}
class WeatherException extends Exception{
    public WeatherException() {
    }
    public WeatherException(String message) {
        super(message);
    }
}