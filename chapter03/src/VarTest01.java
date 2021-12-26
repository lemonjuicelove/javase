/*
 * 1、字面量：在java语言中"数据"被称为"字面量"
 * 2、字面量可以分为很多种类：
 * 		整数型字面量：1 2 3 ...
 * 		浮点型字面量：1.3 2.4 ...
 * 		布尔型字面量：true、false
 * 		字符型字面量：'a'、'b'、'中'
 * 		字符串型字面量："a"、"ab"、"中"
 *
 * 		注意：所有的字符型只能使用单引号括起来；所有的字符串型只能使用双引号括起来
 * 			 字符型一定时单个字符才能成为"字符型"
 * 			 在语法级别上怎么区分字符型和字符串型：主要是看单引号还是双引号
 */

public class VarTest01 {
    public static void main(String[] args) {

        // 下面的两个10占用两个不同的内存空间(创建两个不同的int类型对象，内存地址不同，但该内存单元保存的值相同)
        // 只有"字面量"机制的话，内存是无法重复利用的
        System.out.println(10);
        System.out.println(10);


        int i = 10; // 局部变量i存储在栈中

        // 下面两次访问的都是同一块内存空间(内存空间得到了重复利用)
        System.out.println(i);
        System.out.println(i);

        System.out.println("dev");

    }


}
