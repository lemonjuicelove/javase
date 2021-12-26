package com.whut.javase.collection;

import java.util.*;

/*
* 集合ArrayList的构造方法
*/
public class ArrayListTest02 {
    public static void main(String[] args) {

        // 默认初始化容量为10
        List myList1 = new ArrayList();
        // 指定初始化容量为20
        List myList2 = new ArrayList(20);


        // 创建HashSet集合
        Collection c = new HashSet();
        c.add(100);
        c.add(200);
        c.add(300);
        c.add(400);
        c.add(100); // 这个100并没有存入到HashSet集合当中
        System.out.println(c.size()); // 4，因为HashSet集合无序不可重复

        // 构造一个包含指定Collection元素的列表,此构造方法可以将Set集合转换为List集合
        // 将HashSet集合转换为List集合
        // 因为HashSet集合中元素是无序不可重复的，所以转换成List集合的时候，元素是无序转换的，转换完成之后是List集合，是有序可重复的
        List myList3 = new ArrayList(c);
        System.out.println(myList3.size());

        myList3.add(100); // 向末尾添加元素
        for (int i = 0; i < myList3.size(); i++) {
            System.out.println(myList3.get(i));
        }

    }
}
