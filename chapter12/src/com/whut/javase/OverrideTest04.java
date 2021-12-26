package com.whut.javase;
/*
私有方法不能覆盖：因为private修饰的方法只能在本类中访问，出了这个范围之后就失效了
 */
public class OverrideTest04 {

    private void doSome() {
        System.out.println("private doSome");
    }
    public static void main(String[] args) {

        OverrideTest04 t = new T();
        // 提高访问权限之后，为什么运行的还是父类的doSome方法？
        // 是因为private修饰的方法只能在本类中使用，这里t访问不到T中的doSome，所以只能访问本类中的doSome
        t.doSome();

        Bird22 a = new Bird22();
        a.fly();

    }

}

class T extends OverrideTest04{
    // 重写父类中的doSome()方法
    // 提高访问权限
    public void doSome(){
        System.out.println("T is doSome");
    }
}

class Animal22{
    private void fly(){
        System.out.println("animal fly");
    }

    public static void move(){
        System.out.println("animal move");
    }
}
class Bird22 extends Animal22{
    public void fly(){
        System.out.println("bird fly");
    }

}
