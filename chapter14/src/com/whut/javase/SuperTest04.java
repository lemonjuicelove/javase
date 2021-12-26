package com.whut.javase;
/*
 * 	在父类和子类中有同名的属性，或者有相同的方法时，
 * 	如果此时想在子类中访问父类中的数据，必须使用"super."加以区分
 *
 * 	super.属性名		访问父类的属性
 * 	super.方法名(实参)	访问父类的方法
 * 	super()		调用父类无参构造方法
 * 	super(实参)		调用父类有参构造方法
 */
public class SuperTest04 {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.yiDong();
    }
}

class Animal{
    public void move() {
        System.out.println("Animal move");
    }
}

class Cat extends Animal{

    public void move() {
        System.out.println("Cat move");
    }
    public void yiDong() {
        this.move(); // 代表子类的move方法
        super.move(); // 代表父类的move方法
    }

}