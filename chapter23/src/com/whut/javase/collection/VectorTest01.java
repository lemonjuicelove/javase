package com.whut.javase.collection;

import java.util.*;

/*
* Vector:
*       1、底层也是一个数组
*
*       2、初始化容量为：10
*
*       3、怎么扩容：扩容之后的容量为原容量的2倍
*
*       4、ArrayList集合扩容的特点：扩容之后的容量是原容量的1.5倍
*
*       5、Vector中所有的方法都是线程同步的，都带有synchronized关键字，
*          是线程安全的。效率较低，使用较少
*
*       6、如何将一个线程不安全的ArrayList集合转换成线程安全的
*          使用集合工具类：java.util.Collections;
*
*           java.util.Collection  是集合接口
*           java.util.Collections 是集合工具类
*/
public class VectorTest01 {
    public static void main(String[] args) {

        // 多态，创建一个Vector集合
        List vector = new Vector();

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }

        // ArrayList是非线程安全的
        List myList = new ArrayList();

        // 变成线程安全的
        Collections.synchronizedList(myList);
        // myList集合就是线程安全的了
        myList.add("123");
        myList.add("456");
        
        myList.add("789");

    }
}
