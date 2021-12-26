package com.whut.javase.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

/*
* 先按照年龄排序，年龄相同再按照姓名排序
*/
public class TreeSetTest05 {
    public static void main(String[] args) {

        Vip v1 = new Vip(18,"jack");
        Vip v2 = new Vip(18,"tom");
        Vip v3 = new Vip(22,"lisi");
        Vip v4 = new Vip(20,"WANGWU");

        TreeSet<Vip> ts = new TreeSet<>();
        ts.add(v1);
        ts.add(v2);
        ts.add(v3);
        ts.add(v4);
        ArrayList ls = new ArrayList();
        ls.toArray();
        ts.toArray();

        for (Vip v : ts){
            System.out.println(v);
        }

    }
}

/*
compareTo方法的返回值很重要：
返回0表示相同，value会覆盖
返回>0，会继续在右子树上找
返回<0，会继续在左子树上找
*/
class Vip implements Comparable<Vip>{

    private int age;
    private String name;

    public Vip() {
    }
    public Vip(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Vip vip) {
        if (this.age == vip.age){
            // 年龄相同时按照姓名排序
            // 姓名是String类型，已经重写了compareTo方法，直接调用compareTo方法比较
            return this.name.compareTo(vip.name);
        }else {
            return this.age - vip.age;
        }
    }

}