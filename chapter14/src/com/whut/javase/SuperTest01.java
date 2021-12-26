package com.whut.javase;
/*
 * 	1、super和this对比
 * 	this：
 * 		this能出现在实例方法和构造方法中，this不能使用在静态方法中
 * 		this的语法是："this."、"this()"
 *
 * 		this.大部分情况下是可以省略的
 * 		this.什么时候不能省略：在区分局部变量和实例变量的时候不能省略
 *
 * 		this()只能出现在构造方法的第一行，表示通过当前的构造方法调用本类中其他的构造方法。
 *
 * 	super：
 * 		super能出现在实例方法和构造方法中，super不能使用在静态方法中
 * 		super的语法是："super."、"super()"
 * 		super.大部分情况下是可以省略的
 *
 * 		super.什么时候不能省略：
 * 			父类和子类中有同名属性或者方法，想在子类中访问父类的东西时，super.不能省略
 *
 * 		super()只能出现在构造方法的第一行，表示通过当前的构造方法调用父类中的构造方法。
 * 		无参时就调用父类无参的构造方法，有参时就调用父类有参的构造方法
 * 		目的是：创建子类对象的时候，先初始化父类型的特征
 *
 * 	2、super()
 * 		表示通过子类的构造方法调用父类的构造方法
 *
 * 	3、重要结论：
 * 		当一个构造方法第一行：既没有this()又没有super()的话，默认会有一个super();
 * 		表示通过当前子类的构造方法调用父类的无参数构造方法。
 *      所以必须保证父类的无参数构造方法是存在的，不然编译会报错
 *
 * 	4、注意：this()和super()不能共存，它们都只能出现在构造方法的第一行
 *
 * 	5、无论怎么样，父类的构造方法是一定会执行的
 */

public class SuperTest01 {
    public static void main(String[] args) {
        new B();
        new B(1);
    }
}

class A{
    // 建议手动的写一个无参数构造方法，避免错误
    public A() {
        System.out.println("A类的无参构造方法执行");
    }
    public A(int i) {
        System.out.println("A类的有参构造方法执行");
    }
}

class B extends A{
    public B() {
        // super();  默认会有这样的一行代码
        System.out.println("B类的无参构造方法执行");
    }
    public B(int i) {
        // super();  默认会有这样的一行代码,并不是默认的super(i);
        System.out.println("B类的有参构造方法执行");
    }
}