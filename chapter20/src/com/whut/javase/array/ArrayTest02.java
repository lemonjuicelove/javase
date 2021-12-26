package com.whut.javase.array;
/*
* 什么时候采用静态初始化方式，什么时候采用动态初始化方式:
*       当你创建数组的时候，确定数组中存储哪些具体的元素时，采用静态初始化方式
*       当你创建数组的时候，不确定将来数组中存储哪些数据，可以采用动态初始化的方式，预先分配内存空间
*/
public class ArrayTest02 {
    public static void main(String[] args) {

        int[] a = new int[4]; // 动态初始化长度为4的int类型数组，每个元素默认值为0

        for (int i = 0; i < a.length; i++){
            System.out.println("数组中下标为" + i +"的元素是：" + a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            int temp = i;
            a[i] = ++temp;
            System.out.println("数组中下标为" + i +"的元素是：" + a[i]);
        }

        Object[] o = new Object[3]; // 动态初始化长度为3的Object类型数组，每个元素默认值为null
        for (int i = 0; i < o.length; i++){
            System.out.println("数组中下标为" + i +"的元素是：" + o[i]);
        }
        String[] s = {"abc","def","idea"}; // 静态初始化String类型数组
        for (int i = 0; i < s.length; i++){
            o[i] = s[i];
            System.out.println("数组中下标为" + i +"的元素是：" + o[i]);
        }

    }
}
