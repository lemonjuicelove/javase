package com.whut.javase.collection;

import java.util.*;

/*
* ArrayList集合：
*   1、默认初始化容量为10
*
*   2、集合底层是一个Object[]数组
*
*   3、构造方法：
*       new ArrayList(); // 默认初始化容量
*       new ArrayList(20); // 指定初始化容量
*
*   4、ArrayList集合的扩容：
*       扩容到原容量的1.5倍
*       ArrayList集合底层是数组，怎么优化：尽可能少的扩容。因为数组扩容效率较低，建议在使用ArrayList集合的时候，预估计元素的个数，给定一个初始化容量
*
*   5、数组的优点：检索效率比较高
*
*   6、数组的缺点：
*       随机增删元素效率比较低；因为涉及到数组元素的位置改变
*       数组无法存储大数据量；因为很难找到一块很大的连续的内存空间
*
*   7、向数组末尾添加元素，效率很高，不受影响
*
*   8、面视问题：这么多集合中，使用哪个集合最多
*      答：ArrayList集合。因为ArrayList集合底层是数组，往数组末尾添加元素，效率不受影响
*         另外，检索某个元素的操作比较多，数组检索效率高
*
*   9、ArrayList集合是非线程安全的
*/
public class ArrayListTest01 {
    public static void main(String[] args) {



        // 默认初始化容量为0
        List list1 = new ArrayList();
        List list = new Vector();


        // 指定初始化容量为20，数组的长度为20
        List list2 = new ArrayList(20);

        list1.add(1);


        // 集合的size()方法获取的是当前集合中元素的个数，不是获取集合的容量
        System.out.println(list1.size()); // 0

    }
}
