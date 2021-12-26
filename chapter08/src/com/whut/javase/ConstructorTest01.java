package com.whut.javase;
/*
 * 	构造方法
 * 		1、什么是构造方法
 * 		构造方法是一个比较特殊的方法，通过构造方法可以完成对象的创建，以及实例变量的初始化 (给对象的属性赋值)。
 *
 * 		2、重点：当一个类没有提供任何构造方法，系统会默认提供一个无参数的构造方法 (这个构造方法被称为缺省构造器)。
 *
 * 		3、构造方法使用哪个运算符进行调用：使用new来调用构造方法(new对象的过程中就调用了构造方法)
 *
 * 		4、构造方法的语法结构
 * 		[修饰符列表] 构造方法名(形式参数列表){
 * 			构造方法体; // 通常在构造方法体中给属性赋值，完成属性的初始化
 * 		}
 * 		注意：1、修饰符列表目前统一写：public。不要写public static (静态方法)
 * 		     2、构造方法名和类名必须一致
 * 		     3、构造方法不需要指定返回值类型，不能写void，写void表示普通方法
 *
 * 		普通方法的语法结构
 * 		[修饰符列表] 返回值类型 方法名(形式参数列表){
 * 			方法体;
 * 		}
 */
public class ConstructorTest01 {
    public static void main(String[] args) {

        Student02 s1 = new Student02(); // 调用无参数的构造方法
        Student02 s2 = new Student02(100); // 调用有参数的构造方法

    }
}

class Student02{

    // 属性
    int xueHao;
    String name;
    int age;

    // 当前的Student这个类当中没有定义任何构造方法
    // 但是系统实际上会自动给Student类提供一个无参数的构造方法
    // 为了方便理解，建议手动写出无参构造方法
    public Student02() {
        System.out.println("无参数的构造方法调用了");
    }

    // 定义一个有参构造方法
    public Student02(int i) {
        System.out.println("有参数的构造方法调用了");
    }

}