package com.whut.javase;

import java.util.Scanner;

/*
 * 题目：
 * 		1、系统接收一个学生的考试成绩，根据成绩输出等级
 * 		2、等级：优 90-100  良 80-90  中 70-80  及格 60-70  不及格 0-60
 * 		3、成绩是一个合法的数字，成绩必须在 0-100 之间
 */
public class SwitchTest02 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("请输入成绩：");
        int score = s.nextInt();

        if (score < 0 || score > 100){
            try {
                throw new ScoreException("无效的成绩");
            } catch (ScoreException e) {
                System.out.println(e.getMessage());
            }
        }else {
            int grade = score / 10;
            String str;
            switch (grade){
                case 9 : case 10:
                    str = "优秀";
                    break;
                case 8:
                    str = "良好";
                    break;
                case 7:
                    str = "中等";
                    break;
                case 6:
                    str = "及格";
                    break;
                default:
                    str = "不及格";
                    break;
            }
            System.out.println("考试成绩为：" + str);
        }

    }
}
class ScoreException extends Exception{
    public ScoreException() {
    }

    public ScoreException(String message) {
        super(message);
    }
}