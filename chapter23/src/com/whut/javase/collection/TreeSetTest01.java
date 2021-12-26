package com.whut.javase.collection;

import java.util.Set;
import java.util.TreeSet;
/*
* TreeSet集合存储元素特点：
*
*       1、无序不可重复的，但是存储的元素可以自动按照从小到大顺序排列，称为：可排序集合
*          注意：存进去的元素一定要实现了比较规则才能自动排序
*
*       2、无序：存进去的顺序和取出来的顺序不一定相同，Set集合中的元素没有下标
*/
public class TreeSetTest01 {
    public static void main(String[] args) {

        Set<String> mySet = new TreeSet<>();
        mySet.add("A");
        mySet.add("X");
        mySet.add("B");
        mySet.add("Z");
        mySet.add("G");

        // 输出结果会从小到大自动排序
        for (String s : mySet){
            System.out.println(s);
        }

    }
}
