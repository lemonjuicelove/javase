package com.whut.javase.review;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
* 1、1   每个集合对象的创建(new)
* 1、2   向集合中添加元素
* 1、3   从集合中取出某个元素
* 1、4   遍历集合
*/
public class ArrayListTest {
    public static void main(String[] args) {

        // 创建集合对象
        // List<String> list = new ArrayList<>();
        List<String> list = new LinkedList<>();

        // 向集合中添加元素
        list.add("123");
        list.add("abc");
        list.add("jack");
        list.add("123");
        // List集合存储元素特点：有序可重复
        System.out.println(list.size()); // 4

        // 通过下标取出某个元素
        System.out.println(list.get(1));

        // 遍历集合的三种方式
        // 第一种方式：通过下标遍历
        for (int flag = 0; flag < list.size(); flag++){
            System.out.println(list.get(flag));
        }
        // 第二种方式：foreach
        for (String s : list){
            System.out.println(s);
        }
        // 第三种方式：迭代器迭代
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
