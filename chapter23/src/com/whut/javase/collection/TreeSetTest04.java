package com.whut.javase.collection;

import java.util.TreeSet;

public class TreeSetTest04 {
    public static void main(String[] args) {

        Customer c1 = new Customer(18);
        Customer c2 = new Customer(24);
        Customer c3 = new Customer(12);

        TreeSet<Customer> ts = new TreeSet<>();
        ts.add(c1);
        ts.add(c2);
        ts.add(c3);

        for (Customer c : ts){
            System.out.println(c);
        }

    }
}

// 放在TreeSet集合中的元素需要实现java.lang.Comparable接口
// 并且实现compareTo方法，equals方法可以不写
class Customer implements Comparable<Customer>{

    private int age;

    public Customer() {
    }
    public Customer(int age) {
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
        return "Customer{" +
                "age=" + age +
                '}';
    }

    // 需要在这个方法中编写比较的逻辑，比较规则最终是由程序员指定的
    @Override
    public int compareTo(Customer customer) { // c1.compareTo(c2);
        // this是c1，customer是c2
        // c1和c2比较，就是this和customer比较
        return this.age - customer.age; // 可能返回 =0 >0 <0
    }

}
