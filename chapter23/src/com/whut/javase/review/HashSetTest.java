package com.whut.javase.review;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 1、1  每个集合对象的创建(new)
 * 1、2  向集合中添加元素
 * 1、3  从集合中取出某个元素
 * 1、4  遍历集合
 */
public class HashSetTest {
    public static void main(String[] args) {

        // 创建集合对象
        Set<Integer> set = new HashSet<>();

        // 向集合中添加元素
        set.add(100);
        set.add(300);
        set.add(200);
        set.add(150);
        set.add(10);
        set.add(100);
        // Set集合存储元素特点：无序不可重复
        System.out.println(set.size()); // 5

        // 遍历集合的两种方式
        // Set集合中的元素没有下标，所以不能通过下标进行遍历
        // 第一种方式：foreach
        for (Integer i : set){
            System.out.println(i);
        }
        // 第二种方式：迭代器迭代
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
