package com.whut.javase;
/*
 * 	1、方法怎么定义，语法机制是什么？
 * 		[修饰符列表]  返回值类型  方法名(形式参数列表){
 * 			方法体;
 * 		}
 * 		注意：以上中括号[]里面的内容不是必须的，是可选的
 *
 * 		1.1、关于修饰符列表：
 * 			修饰符列表不是必选项，是可选的。
 *
 * 		1.2、关于返回值类型：
 * 			第一：返回值类型可以是任何类型，只要是java中合法的数据类型就行
 *
 * 			第二：什么是返回值
 * 				返回值一般指的是一个方法执行结束之后的结果
 * 				结果通常是一个数据，数据得有类型，就称为返回值类型
 *
 * 				方法执行结束之后的返回值实际上是给调用者了，谁调用就返回给谁
 *
 * 			第三：当一个方法执行结束之后不返回任何值的时候，返回值类型也不能空白，必须
 * 			写上void关键字。所以void表示该方法执行结束后不返回任何结果
 *
 * 			第四：如果返回值类型不是void，那么在方法体执行结束的时候必须使用"return 值;"
 * 			这样的语句来完成值的返回，如果没有，编译器会报错
 * 			除void之外，剩下的都必须有"return 值;"这样的语句
 *
 * 			第五：只要由"return"关键字的语句执行，当前方法必然结束，并不是整个程序结束
 *
 * 			第六：如果返回值类型是void，那么在方法体当中不能有"return 值;"这样的语句，
 * 			但可以有"return;"语句，该语句的作用是结束当前方法
 *
 * 		1.3、方法名
 * 			方法名要见名知意
 * 			方法名在标识符命名规范当中，要求首字母小写，后面每个单词首字母大写
 * 			只要是合法的标识符即可
 *
 * 		1.4、形式参数列表
 * 			注意：形式参数列表中的每一个参数都是局部变量，方法结束后内存自动释放
 * 			有多个形参的话使用逗号隔开
 *
 * 			public static void sum(int x, int y, double m){}
 * 			形参的数据类型起决定性作用，形参对应的变量名是随意的
 *
 * 		1.5、方法体
 * 			由java语句构成
 * 			方法体当中编写的是代码，完成某项特定的功能
 * 			在方法体中处理代码的时候需要数据，数据来源就是形参
 *
 * 	2、方法定义之后怎么调用，语法是什么？
 * 		方法必须调用才能执行
 * 		语法：类名.方法名(实际参数列表);  (静态方法的调用)
 *
 * 		实参和形参的类型必须一一对应，个数也要一一对应
 */
public class MethodTest02 {

    // main方法结束之后不需要给JVM返回任何执行结果
    public static void main(String[] args) {
        // 调用方法
        // 注意：实参和形参必须一一对应，类型要对应，个数也要对应
        MethodTest02.sumInt(10, 20);

        // 调用sumInt方法之后，通过定义一个变量来接收这个方法的返回值
        // 注意：变量的数据类型要和返回值的数据类型一致
        int jieGuo = MethodTest02.sumInt(100, 200);

        /*
         * 	在调用方法的时候，什么时候"类名."可以省略，什么时候不能省略
         * 		a()方法调用b()方法的时候，a和b方法都在同一个类当中时，"类名."可以省略
         * 		如果不在同一个类当中，"类名."不能省略
         * 	为了保证万无一失，可以一直都不进行省略
         */

        // 对于没有返回值的方法，变量不能接收，编译不通过
        // int jieGuo2 = MethodTest03.sumInt1(100, 200);

        // 当一个方法有返回值时，可以选择不接收，但是这个返回值还是会返回，只是没用变量去接收
        // 下面代码虽然没用使用变量接收返回值，但是这个值还是返回了，只不过返回之后内存马上释放，因为没有使用变量接收
        MethodTest02.sumInt(100, 200);
    }

    public static int sumInt(int x, int y) {
        int z = x + y;
        return z;
    }
    public static void sumInt1(int x, int y) {
        int z = x + y;
    }

}
