package com.whut.javase.collection;

import java.util.TreeSet;

/*
* 1、TreeSet集合底层实际上是一个TreeMap
* 2、TreeMap集合底层是一个二叉树
* 3、放到TreeSet集合中的元素，等同于放到TreeMap集合的key部分了
* 4、TreeSet集合中的元素：无序不可重复，但是可以按照元素的大小顺序自动排序，称为：可排序集合
*/
public class TreeSetTest02 {
    public static void main(String[] args) {

        TreeSet ts = new TreeSet();
        ts.add("zhangsan");
        ts.add("lisi");
        ts.add("zhaoliu");
        ts.add("muyan");



        // String类已经实现了比较规则
        for (Object obj : ts){
            System.out.println(obj);
        }

        TreeSet<Integer> ts2 = new TreeSet<>();
        ts2.add(100);
        ts2.add(800);
        ts2.add(300);
        ts2.add(600);
        ts2.add(10);

        // Integer类也实现了比较规则
        for (Integer num : ts2){
            System.out.println(num);
        }

    }
}
