package com.whut.javase;
/*
 * 在java中有一条重要的结论：
 * 		在任何情况下，整数型的"字面量/数据"默认被当作int类型处理： int i = 10;
 * 		如果希望该"整数型字面量"被当作long类型处理，需要在"字面量"后面添加L： long i = 10L;
 */
public class IntTest01 {
    public static void main(String[] args) {

        /*
         * 100这个字面量被当作int类型处理，a变量是int类型
         * int类型的字面量赋值给int类型的变量，所以不存在类型的转换
         */
        int a = 100;
        System.out.println(a);

        /*
         * 200这个字面量默认被当作int类型来处理
         * b变量是long类型，int类型占4个字节，long类型占8个字节
         * 小容量可以自动转换成大容量，这种操作被称为：自动类型转换
         */
        // 存在自动类型转换
        long b = 200;
        System.out.println(b);

        /*
         * 300L联合起来就是一个long类型的字面量
         * c变量是long类型，long类型赋值给long类型不存在类型转换
         */
        long c = 300L;
        System.out.println(c);

    }
}
