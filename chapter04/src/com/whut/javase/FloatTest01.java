package com.whut.javase;
/*
 * 浮点型包括：float  4个字节         double  8个字节
 * float是单精度  double是双精度  double更精确
 * double容量 > float容量
 *
 * float和double存储数据的时候都是存储的近似值。因为存在有无限循环的数据，但是计算机内存有限
 *
 * long类型占用8个字节，float类型占用4个字节
 * float容量  > long容量   原因：任意一个浮点型都比整数型的存储空间大
 *
 * 在java中，任何一个浮点型数据默认当作double来处理
 * 如果想让其当作float类型处理，字面量后加F
 * 		1.0  默认double类型         1.0F float类型
 */
public class FloatTest01 {
    public static void main(String[] args) {

        double pi = 3.1415926; // 不存在类型转换
        System.out.println(pi);

        // float f = 3.14;  编译报错：大转小需要强制类型转换符
        float f = 3.14F; // 方法1
        float f2 = (float)3.14; // 方法2：强制转换

        // 编译报错：类型不匹配：不能从 double 转换为 int
        // 原理:先将2转换成double类型，然后再做运算，结果是double类型
        // 多种数据类型做混合运算，最终的结果类型是“最大容量”对应的类型
        // double和int做混合运算，最终结果是double类型
        // int i = 10.0 / 2;

        // 解决方式1：先将10.0做强制转换，然后再运算
        int i1 = (int)10.0 / 2;
        System.out.println(i1);

        // 解决方式2：先做运算，然后再强制转换（强制转换只留下整数位）
        int i2 = (int)(10.0 / 4);
        System.out.println(i2);

        float a = (float)(10+5)/2;
        System.out.println(a);

    }
}
