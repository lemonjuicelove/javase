package com.whut.javase;
/*
 * 	1、方法覆盖需要和多态机制联合起来使用才有意义
 * 	        Animal a = new Cat();
 * 	        a.move();
 * 	效果是：编译阶段静态绑定Animal，运行阶段动态绑定Cat
 * 	假设没有多态机制，方法覆盖机制可有可无，如果父类的方法无法满足子类的需求，子类完全可以定义一个新的方法
 *
 * 	2、静态方法使用方法覆盖有意义吗？
 * 	        多态和对象有关系，而静态方法的执行不需要对象，所以没有意义
 */
public class OverrideTest03 {
    public static void main(String[] args) {

        Animal2 a1 = new Dog();

        // 静态方法和对象无关，虽然使用"引用."来调用，但底层还是"类名."调用
        // 实际运行的还是：Animal2.move()	而不是Dog.move()
        a1.move();

    }
}

class Animal2{
    public static void move() { // 父类的静态方法
        System.out.println("动物在移动");
    }
}

class Dog extends Animal2{ // 子类重写的静态方法
    public static void move() {
        System.out.println("小狗在跳跃");
    }
}