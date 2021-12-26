package com.whut.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
* 关于集合元素的remove
*
*       重点：当集合的结构发生改变时，迭代器必须重新获取，如果仍在使用没有更新的迭代器，
*            会出现异常：java.util.ConcurrentModificationException
*
*       重点：在迭代集合元素的过程中，不能调用集合对象Collection的remove方法删除元素
*            即迭代过程不能使用c.remove(o);语句
*
*       重点：在迭代元素的过程中，一定要使用迭代器Iterator的remove方法删除元素
*            不能使用集合自带的remove方法删除元素
*/
public class CollectionTest05 {
    public static void main(String[] args) {

        Collection c = new ArrayList();
        // Iterator it = c.iterator();
        // 注意：此时获取的迭代器，指向的是集合中没有元素状态下的迭代器
        // 集合结构只要发生改变，迭代器必须重新获取
        // 当集合结构发生了改变，迭代器没有重新获取时，调用next()方法时异常：java.util.ConcurrentModificationException

        c.add("a");
        c.add(1);
        c.add("b");
        c.add(2);

        // 获取迭代器对象
        Iterator it = c.iterator();
        // 迭代集合元素
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

        Collection c2 = new ArrayList();
        c2.add(123);
        c2.add(456);
        c2.add(789);

        Iterator it2 = c2.iterator();
        while (it2.hasNext()){
            Object obj = it2.next();
            // c2.remove(obj); // 直接通过集合删除元素，却没有更新迭代器中的元素
            // 删除元素之后，集合的结构发生了变化，应该重新取获取迭代器
            // 但是，在下一次循环的时候并没有重新获取迭代器，调用next()方法时出现异常：java.util.ConcurrentModificationException
            // 出异常的根本原因：集合中元素删除导致集合结构改变，但迭代器没有进行更新

            // 使用迭代器去删除元素时，会自动更新迭代器，并且更新集合(删除集合中的元素)
            // 删除的一定是迭代器指向的当前元素
            System.out.println(obj);
            it2.remove();
        }
        System.out.println(c2.size()); // 0

    }
}
