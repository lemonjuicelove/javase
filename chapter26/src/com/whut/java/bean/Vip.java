package com.whut.java.bean;

public class Vip {

    int no;
    String name;
    int age;
    String address;

    public Vip() {
    }

    public Vip(int no) {
        this.no = no;
    }

    public Vip(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public Vip(int no, String name, int age) {
        this.no = no;
        this.name = name;
        this.age = age;
    }

    public Vip(int no, String name, int age, String address) {
        this.no = no;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

}
