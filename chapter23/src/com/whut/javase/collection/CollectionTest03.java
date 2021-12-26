package com.whut.javase.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
* 深入Collection集合的contains方法：
*       boolean contains(Object obj)
*           判断集合中是否包含某个对象obj
*           如果包含返回true，不包含返回false
*
*       contains方法是用来判断集合中是否包含某个元素的方法
*       那么它在底层是怎么判断集合中是否包含某个元素的呢？
*           调用了equals方法进行对比
*           equals方法返回true，就表示包含这个元素
*/
public class CollectionTest03 {
    public static void main(String[] args) {

        // 创建集合对象
        Collection c = new ArrayList();

        // 向集合中存储元素
        String s1 = new String("abc");
        String s2 = new String("def");
        c.add(s1);
        c.add(s2);

        // 判断集合中是否包含s3
        // String类中重写了equals方法，比较的是内容，不是内存地址，所以结果为true
        String s3 = new String("abc");
        System.out.println(c.contains(s3)); // true

    }
}
