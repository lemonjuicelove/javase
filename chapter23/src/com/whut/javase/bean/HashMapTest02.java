package com.whut.javase.bean;

import java.util.HashSet;
import java.util.Set;
/*
* 1、向Map集合中存，以及从Map集合中取，都是先调用key的hashCode方法，然后再调用equals方法
*    注意：equals方法可能会调用，也可能不会调用
*           拿put(k,v)举例，什么时候equals不会调用
*               k.hashCode()方法返回哈希值，哈希值经过哈希算法转换成数组下标，
*               数组下标位置上如果是null，equals不会调用(该位置没有元素，直接存进去)
*           拿get(k)举例，什么时候equals不会调用
*               k.hashCode()方法返回哈希值，哈希值经过哈希算法转换成数组下标，
*               数组下标位置上如果是null，equals不会调用(该位置没有元素，不用查询，直接返回null)
*
* 2、注意：如果一个类的equals方法重写了，那么hashCode()方法必须重写。
*    并且equals方法返回如果是true，hashCode()方法返回的值必须一样：
*       equals方法返回true表示两个对象相同，在同一个单向链表上比较，那么对于
*       同一个单向链表上的节点来说，它们的哈希值都是相同的。所以hashCode()方法的返回值也应该相同。
*
* 3、hashCode()方法和equals()方法可以直接使用IDEA工具生成，但是这两个方法需要同时生成
*
* 4、结论：放在HashMap集合key部分的元素和放在HashSet集合中的元素，需要同时重写hashCode和equals方法
*
* 5、对于哈希表数据结构来说：
*       如果o1和o2的哈希值相同，一定是放在同一个单向链表上
*       如果o1和o2的哈希值不同，但经过哈希算法执行结束之后转换的数组下标可能相同，称为"哈希碰撞"
*/
public class HashMapTest02 {
    public static void main(String[] args) {

        Student s1 = new Student("jack");
        Student s2 = new Student("jack");

        // 重写equals方法之前
        // System.out.println(s1.equals(s2)); // false
        // 重写equals方法之后
        System.out.println(s1.equals(s2)); // true

        // 重写hashCode方法之前
        /*
        System.out.println("s1的hashCode = " + s1.hashCode()); // 764977973
        System.out.println("s2的hashCode = " + s2.hashCode()); // 1534030866
        */

        // s1.equals(s2)结果为true，表示s1和s2是相同的，往HashSet集合中放的话，按说只能放进去1个
        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        // 重写hashCode方法之前：按说是1，结果是2，原因就在于此时还没有重写Student类中的hashCode方法
        // 哈希值不同，所以存储的数组下标不同，都能存进去
        System.out.println(students.size());

    }
}
