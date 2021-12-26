package com.whut.javase;
/*
 * 	continue;语句：
 * 		1、continue语句的作用：终止当前"本次"循环，直接进入到下一次循环继续执行
 *
 * 		2、continue语句指定循环
 * 			第一步:给循环起个名字
 * 			第二步：continue a;
 */
public class ContinueTest01 {
    public static void main(String[] args) {

        for(int i = 0; i < 5; i++) {
            if(i == 3) {  // 当i=3时，下面的代码不执行，直接进入到下一次循环当中
                continue;
            }
            System.out.println(i);
        }

        a:for(int k = 0; k < 2; k++) {
            b:for(int m = 0; m < 5; m++) {
                if(m == 3) {
                    continue a; // 对指定的循环起作用
                }
                System.out.println(m);
            }
        }


    }
}
