package com.whut.javase.collection;

import java.util.*;

/*
* 集合使用foreach
*/
public class ForEachTest02 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("abc");
        myList.add("def");
        myList.add("xyz");

        // 使用迭代器迭代
        Iterator<String> it = myList.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("----------");

        // 使用下标迭代
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        System.out.println("-----------");

        // 使用foreach迭代
        for (String s : myList){
            System.out.println(s);
        }

    }
}
