package com.whut.javase.review;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * 1、1  每个集合对象的创建(new)
 * 1、2  向集合中添加元素
 * 1、3  从集合中取出某个元素
 * 1、4  遍历集合
 */
public class HashMapTest {
    public static void main(String[] args) {

        // 创建集合对象
        Map<Integer, String> myMap = new HashMap<>();

        // 向集合中添加元素
        myMap.put(1,"zhangsan");
        myMap.put(2,"lisi");
        myMap.put(5,"wangwu");
        myMap.put(4,"zhaoliu");
        myMap.put(5,"wangwu"); // key重复value会覆盖

        // 从集合中取出某个元素，通过key来获取value
        System.out.println(myMap.get(2));

        // 遍历集合的两种方式
        // 第一种方式：获取所有的key，通过遍历key，来遍历value
        // 只是将Map集合中的key部分转换为Set集合
        Set<Integer> keySet = myMap.keySet();
        for (Integer i : keySet){
            System.out.println(myMap.get(i));
        }

        // 第二种方式：Set<Map.Entry<K,V>> entrySet()
        // 以上这个方法是把Map集合直接全部转换成Set集合，其中Set集合中元素的类型是：Map.Entry
        // Set集合中存储的是Map.Entry类型的对象，这个对象有key和value两个属性
        Set<Map.Entry<Integer, String>> nodeSet = myMap.entrySet();
        for (Map.Entry<Integer, String> node : nodeSet){
            System.out.println(node.getKey() + "=" + node.getValue());
        }

    }
}
