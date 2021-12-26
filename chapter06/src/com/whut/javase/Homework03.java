package com.whut.javase;

import java.util.Scanner;

/*
 * 	输入一个五位数，判断它是不是回文数。即12321是回文数
 * 	个位与万位相同，十位与千位相同
 */
public class Homework03 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("请输入一个五位数：");
        int score = s.nextInt();
        String num = String.valueOf(score);

        int[] nums = new int[num.length()];
        for (int i = 0; i < num.length(); i++){
            nums[i] = score%10;
            score /= 10;
        }

        if (nums[0] == nums[4] && nums[1] == nums[3]){
            System.out.println(num + "是回文数");
        }else {
            System.out.println(num + "不是回文数");
        }

    }
}
