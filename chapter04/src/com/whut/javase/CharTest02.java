package com.whut.javase;
/*
 * char x = 97; 这个java语句是允许的，并且输出结果为'a'
 *
 * 结论1：当一个整数型字面量没有超过byte short char的取值范围时，这个整数型字面量可以直接赋值给
 *        byte short char类型的变量
 *
 * 结论2：当一个整数型字面量超出范围时，要使用强制类型转换符才能赋值给byte short char类型的变量
 */
public class CharTest02 {
    public static void main(String[] args) {

        char c1 = 97;
        System.out.println(c1); // 输出结果是a,没有超过char的取值范围

        // char c2 = 65536; 编译会报错，因为超出了char的范围
        char c3 = (char)6553;
        System.out.println(c3); //编译通过，最后输出一个看不懂的字符

        char[] chars = {97,98,99}; // 直接赋值给char类型的变量了
        for (char c :chars){
            System.out.println(c);
        }

    }
}
