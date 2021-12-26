package com.whut.javase.random;

import java.util.Random;

/*
* 编写程序，生成5个不重复的随机数。重复的话重新生成
* 最终生成的5个随机数放到数组当中
*/
public class RandomTest02 {

    public static void main(String[] args) {

        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }
        random(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void random(int[] array){ // 生成随机数的方法

        Random random = new Random();
        // 如果有重复的随机数，则重新生成整个随机数组，效率太低
        /*for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]){
                    System.out.println("有重复的随机数，正在重新生成");
                    random(array);
                }
            }
        }*/

        // 先给随机数组中赋初始值，不重复的数放到数组中，重复的数不放入数组，重新生成进行比较
        for (int i = 0; i < array.length;) {
            int num = random.nextInt(5);
            System.out.println("生成的随机数为：" + num);
            if (biJiao(array,num)){
                array[i] = num;
                i++; // 不要放在for条件里面
            }
        }

    }

    public static boolean biJiao(int[] array, int num){ // 判断是否重复的方法
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num){
                return false;
            }
        }
        return true;
    }

}
