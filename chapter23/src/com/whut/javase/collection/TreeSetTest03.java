package com.whut.javase.collection;

import java.util.TreeSet;

/*
* 对自定义的类型来说，TreeSet不能进行排序
*
*   以下程序中对于Person类型来说，无法排序。因为没有指定Person对象之间的比较规则
*
*   下面程序运行时出现异常：java.lang.ClassCastException:
*                           class com.whut.javase.collection.Person cannot be cast to class java.lang.Comparable
*   出现这个异常的原因：Person类没有实现java.lang.Comparable接口
*/
public class TreeSetTest03 {
    public static void main(String[] args) {

        Person p1 = new Person(18);
        Person p2 = new Person(18);
        Person p3 = new Person(22);

        TreeSet<Person> ts = new TreeSet<>();
        // 没有重写比较规则的时候，在往TreeSet集合中添加第一个元素的时候就会报错
        ts.add(p1);
        ts.add(p2);
        ts.add(p3);


        for (Person p : ts){
            System.out.println(p);
        }

    }
}

// 按照年龄排序
class Person implements Comparable<Person>{

    private int age;

    public Person() {
    }
    public Person(int age) {
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
        return "Person{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        return this.age - person.age;
    }

}

