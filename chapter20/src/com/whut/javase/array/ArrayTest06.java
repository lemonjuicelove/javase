package com.whut.javase.array;
/*
* 一维数组的深入，数组中存储的类型为：引用数据类型
*
* 对于数组来说，实际上只能存储java对象的内存地址。数组中存储的每个元素是引用
*/
public class ArrayTest06 {
    public static void main(String[] args) {

        // 创建一个Animal类型的数组，数组当中存储Cat和Bird
        // 该数组存储的其实是两个对象的内存地址
        // 多态机制
        Animal[] animals = {new Cat(), new Bird()};

        for (int i = 0; i < animals.length; i++) {
            // 取出来的可能是Cat，可能是Bird，但肯定是Animal
            // 如果调用的方法是父类中存在的方法不需要向下转型。
            animals[i].move();
        }

        // 调用子类中特有的方法的时候，需要向下转型
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Cat){
                Cat cat = (Cat)animals[i];
                cat.catchMouse();
            }
            if (animals[i] instanceof Bird){
                Bird bird = (Bird)animals[i];
                bird.sing();
            }
        }

    }
}

abstract class Animal{
    public abstract void move();
}
class Cat extends Animal{
    @Override
    public void move() {
        System.out.println("猫在走猫步");
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
class Bird extends Animal{
    @Override
    public void move() {
        System.out.println("Bird is flying");
    }
    public void sing(){
        System.out.println("Bird is singing");
    }
}