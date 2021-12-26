package com.whut.javase;
/*
 * 结论：多种数据类型做混合运算时，最终的结果类型是“最大容量”对应的类型
 * char+short+byte除外：这三种类型会各自先转换成int在做运算
 */

/*
自动类型转换的实现需要满足的条件：
    1.两种数据类型彼此兼容
    2.小容量转换为大容量
    byte→short→int→long→float→double
    char→int
 */
public class IntTest06 {
    public static void main(String[] args) {

        long a = 10L;
        char b = 'a';
        short c = 1;
        int d = 100;
        System.out.println(a + b + c + d); // 208 这个结果是long类型的

        int temp = 10 / 3;
        System.out.println(temp); // 3
        //因为java中规定，int类型和int类型进行运算最终结果还是int类型

    }
}
