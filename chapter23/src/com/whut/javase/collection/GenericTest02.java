package com.whut.javase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* JDK8之后引入了：自动类型推断机制 (又称钻石表达式)
*/
public class GenericTest02 {
    public static void main(String[] args) {

        // ArrayList<这里的类型会自动推断>()
        List<Animal> myList = new ArrayList<>();
        // 类型不匹配
        // myList.add("123");
        myList.add(new Bird());
        myList.add(new Animal());
        myList.add(new Cat());

        Iterator<Animal> it = myList.iterator();
        while (it.hasNext()){
            Animal animal = it.next();
            animal.move();
        }

    }
}
