package com.whut.javase;
/*
 *  两个不同域的局部变量都是指向同一个对象
 *  如果不理解，画内存图进行理解
 *
 * 重点：java中，方法的调用只支持参数的值传递
 */
public class Other02 {

    public static void main(String[] args) {
        Person p1 = new Person(); // p1是main域中的局部变量
        p1.age = 10;
        System.out.println("调用add方法前，main方法中p.age的值：" + p1.age); // 10
        add(p1); // 将p1中保存的对象的内存地址复制一份传递给了方法中的参数
        System.out.println("调用add方法后，main方法中p.age的值：" + p1.age); // 11
    }

    public static void add(Person p) {
        p.age++; // p是add域中的局部变量，它和p1指向同一个对象，
                 // p1这个引用保存的内存地址并没有变，但是它所指向的对象的属性发生了改变
        System.out.println("add方法中p.age的值：" + p.age); // 11
    }

}
class Person{
    int age;
}