package com.whut.javase;

public class ConstructorTest02 {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.id);
    }
}

// 实例变量没有手动赋值的时候，系统会默认赋值。这个默认赋值的操作是在什么时候完成的？
// 实例变量是在构造方法执行的过程中完成系统默认赋值的(new对象的时候完成初始化的)
class User02{
    int id;
    String name;
    public User02() {
    }
}