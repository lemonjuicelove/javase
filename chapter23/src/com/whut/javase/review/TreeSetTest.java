package com.whut.javase.review;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * 1、1  每个集合对象的创建(new)
 * 1、2  向集合中添加元素
 * 1、3  从集合中取出某个元素
 * 1、4  遍历集合
 */
public class TreeSetTest {
    public static void main(String[] args) {

        // 创建集合对象
        Set<Integer> set = new TreeSet<>();

        // 向集合中添加元素
        set.add(100);
        set.add(1000);
        set.add(500);
        set.add(200);
        set.add(20);
        set.add(100);
        // Set集合存储元素特点：无序不可重复
        System.out.println(set.size()); // 5

        // 遍历集合的两种方式
        // 第一种方式：foreach
        for (Integer i : set){
            System.out.println(i);
        }
        // 第二种方式：迭代器迭代
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        // 放在TreeSet或者TreeMap集合key部分的元素要想做到排序，包括两种方式：
        //      第一种：放在集合中的元素实现java.lang.Comparable接口
        //      第二种：在构造TreeSet或者TreeMap集合的时候给它传一个比较器对象
        Set<Student> mySet = new TreeSet<>();
        mySet.add(new Student(18));
        mySet.add(new Student(24));
        mySet.add(new Student(16));
        mySet.add(new Student(20));
        for (Student s : mySet){
            System.out.println(s);
        }

    }
}

class Student implements Comparable<Student>{

    private int age;

    public Student(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student stu) {
        return this.age - stu.age;
    }

}
