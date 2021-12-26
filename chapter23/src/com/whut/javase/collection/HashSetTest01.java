package com.whut.javase.collection;

import java.util.HashSet;
import java.util.Set;

/*
* HashSet集合存储元素的特点：无序不可重复
*/
public class HashSetTest01 {
    public static void main(String[] args) {

        Set<String> mySet = new HashSet<>();
        mySet.add("hello7");
        mySet.add("hello3");
        mySet.add("hello1");
        mySet.add("hello2");
        mySet.add("hello4");
        mySet.add("hello1");
        System.out.println(mySet.size());

        for (String s : mySet){
            System.out.println(s);
        }
        // 存储的顺序和取出来的顺序不同，且不可重复
        // 放到HashSet集合中的元素实际上是放到HashMap集合的key部分了

    }
}
