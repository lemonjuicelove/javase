package com.whut.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/*
* 测试contains方法
* 测试remove方法
* 结论：调用remove方法，底层也是用equals方法进行对比
* 结论：存放在一个集合中的类型的元素，一定要重写equals方法(因为需要进行比较的时候，是通过该类型的equals方法进行比较的)
*/
public class CollectionTest04 {
    public static void main(String[] args) {

        Collection c = new ArrayList();

        User u1 = new User("jack");
        c.add(u1);

        // 判断集合c中是否包含u2
        // User类中没有重写equals方法的时候，继承父类Object的equals方法，父类中"=="比较的是内存地址。结果为false
        // User u2 = new User("jack");
        // System.out.println(c.contains(u2)); // false

        // 重写equals方法之后，比较的是名字内容，结果为true
        User u2 = new User("jack");
        System.out.println(c.contains(u2)); // true

        // 测试remove方法
        Collection cc = new ArrayList();
        String s1 = new String("abc");
        cc.add(s1);
        System.out.println(cc.size()); // 1

        // 底层调用equals方法进行对比
        String s2 = new String("abc");
        cc.remove(s2);
        System.out.println(cc.size()); // 0

    }
}

class User{

    private String name;

    public User() {
    }
    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // 重写equals方法
    public boolean equals(Object o) {
        if (o == null || !(o instanceof User)){
            return false;
        }
        if (this == o){
            return true;
        }
        User u = (User)o;
        return this.name.equals(u.name);
    }

}
