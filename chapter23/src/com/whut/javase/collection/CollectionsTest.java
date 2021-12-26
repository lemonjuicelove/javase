package com.whut.javase.collection;

import java.util.*;

/*
* java.util.Collection 集合接口
* java.util.Collections 集合工具类，方便集合的操作
*/
public class CollectionsTest {
    public static void main(String[] args) {

        // ArrayList集合不是线程安全的
        List<String> list = new ArrayList<>();
        // 变成线程安全的
        Collections.synchronizedList(list);

        list.add("abc");
        list.add("xyz");
        list.add("abw");

        // 排序之后遍历
        Collections.sort(list);
        for (String s : list){
            System.out.println(s);
        }

        List<FlyBird> birdsList = new ArrayList<>();
        birdsList.add(new FlyBird(10));
        birdsList.add(new FlyBird(5));
        birdsList.add(new FlyBird(15));

        // 对List集合中的元素进行排序，同样有两种方式：
        // 第一种：保证List集合中的元素实现了Comparable接口
        // 第二种：在调用Collections.sort方法的时候传入一个比较器对象
        Collections.sort(birdsList, new FlyBirdComparator());
        for (FlyBird bird : birdsList){
            System.out.println(bird);
        }

        // 对Set集合进行排序
        Set<String> mySet = new HashSet<>();
        mySet.add("abx");
        mySet.add("abc");
        mySet.add("xyz");
        mySet.add("xfg");
        // 将Set集合转换为List集合
        List<String> myList = new ArrayList<>(mySet);
        Collections.sort(myList);
        for (String s : myList){
            System.out.println(s);
        }

    }
}

class FlyBird {

    private int age;

    public FlyBird(int age) {
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
        return "FlyBird{" +
                "age=" + age +
                '}';
    }

    /*@Override
    public int compareTo(FlyBird flyBird) {
        return this.getAge() - flyBird.getAge();
    }*/
}

class FlyBirdComparator implements Comparator<FlyBird>{

    @Override
    public int compare(FlyBird flyBird, FlyBird t1) {
        return flyBird.getAge() - t1.getAge();
    }

}
