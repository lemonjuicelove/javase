package com.whut.javase.bean;

import java.util.Hashtable;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;

/*
* HashTable的key和value都不能为null的
*
* HashTable方法带有synchronized：线程安全的
* 线程安全有其他的方案，这个HashTable对线程的处理导致效率较低，使用较少
*
* HashTable和HashMap一样，底层都是哈希表数据结构
* HashTable的初始化容量为11，默认加载因子是：0.75f
* HashTable的扩容是：原容量 * 2 + 1
*/

public class HashTableTest01 {
    public static void main(String[] args) {

        Map map = new Hashtable();
        // map.put(null, 100); // java.lang.NullPointerException
        // map.put(1, null); // java.lang.NullPointerException
        map.put(1,100);




    }
}
