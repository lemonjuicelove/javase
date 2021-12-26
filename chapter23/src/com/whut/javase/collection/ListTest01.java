package com.whut.javase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* 测试List接口中的常用方法
*   1、List集合存储元素的特点：有序可重复
*           有序：List集合中的元素有下标。从0开始，以1递增
*           可重复：可存入相同的元素
*
*   2、List接口中特有的常用方法：
*/
public class ListTest01 {
    public static void main(String[] args) {

        List myList = new ArrayList();
        myList.add("A"); // 默认都是向集合末尾添加元素
        myList.add("B");
        myList.add("C");
        myList.add("A");
        myList.add("D");

        // 在集合的指定下标处插入元素
        myList.add(1, "king");
        Iterator it = myList.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

        System.out.println("-------------------");

        // 根据指定下标获取元素
        // 返回值类型是这个元素的类型，但是为了避免类型错误，可以都写成Object类型
        Object o1 = myList.get(1);
        System.out.println(o1);

        System.out.println("-------------------");

        // 因为有下标，所以List集合有自己比较特殊的遍历方式
        // 通过下标遍历 (List集合特有，Set集合没有)
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        System.out.println("---------------");

        // 获取指定对象第一次出现处的索引
        System.out.println(myList.indexOf("king")); // 1
        // 获取指定对象最后一次出现处的索引
        System.out.println(myList.lastIndexOf("A")); // 4

        System.out.println("-------------");

        // 删除指定下标位置的元素
        System.out.println(myList.size()); // 6
        myList.remove(0);
        System.out.println(myList.size()); // 5

        System.out.println("-----------");

        // 修改指定位置的元素
        myList.set(0, "A");
        for (int i = 0; i < myList.size(); i++) {
            Object obj = myList.get(i);
            System.out.println(obj);
        }

    }
}
