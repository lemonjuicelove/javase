package com.whut.javase.collection;

import java.util.*;

// 关于集合遍历/迭代专题

public class CollectionTest02 {
    public static void main(String[] args) {

        // 注意：以下讲解的迭代方式，是所有Collection通用的一种方式
        // 在Map集合中不能用，在所有的Collection以及子类中使用

        // HashSet集合存储元素的特点：无序不可重复
        Collection c = new HashSet();


        c.add(123);
        c.add("hello");
        c.add(456);
        c.add("world");
        c.add(123);
        c.add(666);
        System.out.println(c.size()); // 5

        // 对集合Collection进行迭代

        // 第一步：获取集合对象的迭代器对象
        Iterator it = c.iterator();
        // 第二步：通过以上获取的迭代器对象开始迭代集合

        /*
        * 以下两个方法是迭代器对象Iterator中的方法：
        *       boolean hasNext()   如果仍有元素可以迭代，返回true
        *       Object next()   返回迭代的下一个元素 // 不管存进去是什么类型，取出来统一是Object(是为了避免类型错误)
        */

        // 写一个循环来取出集合中所有的元素
        while (it.hasNext()){
            // 取出来的时候一定是Object类型
            Object objs = it.next();
            // 存进去什么类型，取出来还是什么类型
            // println()方法输出的时候会先转换成字符串，然后再将其输出
            if (objs instanceof Integer){
                System.out.println("Integer类型: " + objs);
            }else{
                System.out.println("其他类型：" + objs);
            }
        }

        // foreach也能取出集合中的元素
        for(Object o : c){
            System.out.println(o);
        }

    }
}
