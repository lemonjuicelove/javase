package com.whut.javase;
/*
 * 	关于方法来说，什么时候定义为实例方法，什么时候定义为静态方法
 * 		方法一般都是描述了一个行为，如果说该行为必须由对象去触发，那么该方法定义为实例方法
 *
 * 	参考标准：
 * 		当这个方法体当中，直接访问了实例变量(没有采用"引用."的方式)，这个方法一定是实例方法
 *      因为实例方法中存在this，静态方法中不存在this
 */
public class StaticTest04 {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.getName());
    }
}
class User{
    private String name;
    public String getName() { // 方法体中访问了实例变量，所以该方法应该定义为实例方法
        return name;
    }
}