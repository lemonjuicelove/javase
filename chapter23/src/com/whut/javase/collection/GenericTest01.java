package com.whut.javase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* 泛型机制：
*
*   1、泛型这种语法机制，只在程序的编译阶段起作用，只是给编译器参考的 (运行阶段泛型没用)
*
*   2、使用了泛型的好处：
*       第一：集合中存储的元素统一了
*       第二：从集合中取出的元素类型是泛型指定的类型，不需要进行大量的"向下转型"
*
*   3、泛型的缺点：
*       导致集合中存储的元素缺乏多样性
*
*   大多数业务中，集合中元素的类型还是统一的，所以这种泛型特性被大家所认可
*/

/*
泛型和类型擦除：
    java中的泛型只存在于程序源码当中，在编译后的字节码当中就已经不存在。而替换为原来类型的raw class了，并且在相应的地方插入强制类型转换代码。
    因此，对于处于运行阶段的JAVA语言来说，ArrayList<int>与ArrayList<String>就是同一个类型，ArrayList类型。

泛型和重载：
    泛型和重载不能同时共存，因为在编译时会进行类型擦除，只剩下原生类型，参数一样，无法重载
*/

public class  GenericTest01 {
    public static void main(String[] args) {

       /*
        // 不使用泛型机制，分析程序存在的缺点
        List myList = new ArrayList();
        // 创建动物对象
        Animal cat = new Cat();
        Animal bird = new Bird();
        // 添加元素
        myList.add(cat);
        myList.add(bird);

        Iterator it = myList.iterator();
        while (it.hasNext()){
            // Animal a = it.next(); // 没有这样的语法，通过迭代器取出的就是Object类型，

            // 因为没有使用泛型，所以编译器为了保险起见，取出来的一律是Object类型
            Object obj = it.next();
            // Object中没有move方法和其他方法，无法调用，需要向下转型
            if (obj instanceof Animal){
                Animal animal = (Animal)obj;
                animal.move();
            }
            if (obj instanceof Cat){
                Cat cat1 = (Cat)obj;
                cat1.catchMouse();
            }
            if (obj instanceof Bird){
                Bird bird1 = (Bird)obj;
                bird1.fly();
            }
        }*/

        // 使用泛型机制的代码
        // 使用泛型List<Animal>之后，表示List集合中只允许存储Animal类型的数据
        // 使用泛型来指定集合中存储的数据类型
        List<Animal> myList = new ArrayList<Animal>();

        // 指定List集合中只能存储Animal类型的数据，那么存储String类型的数据就报错了(编译阶段报错)
        // myList.add("abc");
        // 这样用了泛型之后，集合中的元素的数据类型就更加统一了

        Cat c = new Cat();
        Bird b = new Bird();
        myList.add(c);
        myList.add(b);

        // 获取迭代器，这个表示迭代器迭代的都是Animal类型
        // 注意：集合使用泛型之后，迭代器同样需要使用泛型，这样表示迭代器每次取出的对象就是泛型指定的类型
        Iterator<Animal> it = myList.iterator();
        while (it.hasNext()){
            // 使用泛型之后，每一次迭代返回的数据都是Animal类型
            Animal a = it.next();
            // 这里就不需要进行强制类型转换了，直接调用
            a.move();

            // 调用子类型特有的方法还是需要进行向下转型的
            if (a instanceof Cat){
                Cat cat = (Cat)a;
                cat.catchMouse();
            }
            if (a instanceof Bird){
                Bird bird = (Bird)a;
                bird.fly();
            }
        }

    }
}

class Animal{
    public void move(){
        System.out.println("动物在移动");
    }
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
        System.out.println("鸟在天上飞");
    }

    public void fly(){
        System.out.println("鸟儿在飞翔");
    }
}

