package com.whut.javase.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
* 关于java.util.Collection接口中常用的方法
*   1、Collection中能存放什么元素？
*       没有使用"泛型"之前，Collection中可以存储Object的所有子类型，使用了"泛型"之后，Collection中只能存储某个具体的类型。
*       Collection中什么都能存，只要是Object的子类型就行。八种基本数据类型能够自动装箱为八种包装类，存到Collection中去。
*
*   注意：集合中不能直接存储基本数据类型，也不能存java对象，只是存储java对象的内存地址(存储引用)
*
*   2、Collection中的常用方法
*       boolean add(Object e)   向集合中添加元素
*       int size()  获取集合中元素的个数
*       void clear()   清空集合
*       boolean contains(Object objs)  判断当前集合中是否包含元素objs
*       boolean remove(Object o)    删除集合中的某个元素
*       boolean isEmpty()   判断该集合中元素的个数是否为0
*       Object[] toArray()  调用这个方法可以把集合转换为数组
*/
public class CollectionTest01 {
    public static void main(String[] args) {

        // 创建一个集合对象
        // Collection c = new Collection(); // 接口是抽象的，无法实例化
        // 多态机制
        Collection c = new ArrayList();

        // 测试Collection接口中的常用方法

        c.add(200); // 自动装箱，实际上是放进去了一个对象的内存地址。相当于Integer x = new Integer(200);将x放了进去
        c.add(new Object()); // 实际上是把这个new对象的内存地址放到了集合中，有个隐藏的赋值的操作

        // 获取集合中元素的个数
        System.out.println("集合中元素的个数是：" + c.size());

        // 清空集合
        c.clear();
        System.out.println("集合中元素的个数是：" + c.size());

        c.add("hello"); // 实际上把"hello"对象在字符串常量池中的内存地址放到了集合中，
        c.add("绿巨人"); // 实际上把"绿巨人"对象在字符串常量池中的内存地址放到了集合中，

        // 判断集合中是否包含某元素
        System.out.println(c.contains("hello")); // true
        System.out.println(c.contains("雷神")); // false

        // 删除集合中某元素
        c.remove("绿巨人");
        System.out.println(c.size());

        // 判断集合是否为空(集合中是否存在元素)
        System.out.println(c.isEmpty()); // false
        c.clear();
        System.out.println(c.isEmpty()); // true

        c.add("hello");
        c.add("world");
        c.add("钢铁侠");
        c.add("绿巨人");
        c.add(new Student());

        // 转换成数组
        Object[] objects = c.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

    }
}

class Student{
    @Override
    public String toString() {
        return "我是一个学生类";
    }
}
