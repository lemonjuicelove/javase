package com.whut.javase;
/*
 * 	super. 什么时候不能省略
 * 		父类和子类中有同名的属性时，如果想在子类中访问"父类的特征"，super.不能省略
 *
 * 	super不是引用。super也不保存内存地址。super也不指向任何对象
 * 	super只是一个关键字，只是代表当前对象内部的那一块父类型的特征
 *
 * super是this指向的那个对象中的一块空间，而这块空间指向this的父类型特征
 */
public class SuperTest03 {
    public static void main(String[] args) {
        Vip v = new Vip("zhangsan");
        v.shopping();
    }
}

class Customer{

    String name;

    public Customer() {}
    public Customer(String name) {
        this.name = name;
    }

    public void doSome() {
        System.out.println(this.name + " do some");
        System.out.println(name + " do some");
    }

}

class Vip extends Customer{

    // 假设子类中有一个和父类同名的属性
    String name;

    public Vip() {}
    public Vip(String name) {
        // 调用父类的有参构造初始化父类型特征，子类继承过来的都是初始化过后的父类型特征，但是同名的不会继承
        super(name);
        // 代码执行到这里，父类中的name进行了初始化赋值，子类型的name没有进行初始化赋值

        // 如果加上下面的代码，就代表给子类型的name赋值
        // this.name = name;
    }
    public void shopping() {
        /*
         * java是怎么区分子类和父类的同名属性的
         * 		this.name:当前对象的name属性
         * 		super.name:当前对象的父类型特征中的name属性
         */
        // 因为super(name)将父类中的name赋值了，但是没有给子类中的name赋值
        // 所以父类中name=张三，子类中name=null

        // super表示的是当前对象的父类型特征
        // (super是this指向的那个对象中的一块空间，而这块空间指向this的父类型特征)
        System.out.println(super.name + "正在购物"); // zhangsan正在购物
        System.out.println(this.name + "正在购物"); // null正在购物
        System.out.println(name + "正在购物"); // null正在购物()
    }

}