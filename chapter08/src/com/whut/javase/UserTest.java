package com.whut.javase;
/*
 * 	引用和对象怎么区分：
 * 		引用是存储对象内存地址的一个变量
 * 		对象是堆内存里new出来的
 *
 * 	引用是什么类型的变量，要看它出现的位置
 */
public class UserTest {
    public static void main(String[] args) {

        Address a = new Address();
        User u = new User();
        a.city = "武汉";
        a.street = "马房山";
        a.zipcode = "123";

        u.username = "zhangsan";
        u.addr = a; // addr既是成员变量，也是引用

        System.out.println(u.username + "是" + u.addr.city + "这个城市的");

    }
}
