package com.whut.javase.random;

import java.util.Random;
/*
* 随机数
*/
public class RandomTest01 {
    public static void main(String[] args) {

        // 创建随机数对象
        Random random = new Random();
        // 随机产生一个int类型取值范围内的数字
        int a= random.nextInt();
        System.out.println(a);

        // 产生[0-100]之间的随机数，不能产生101
        int b = random.nextInt(101);
        System.out.println(b);

    }
}
