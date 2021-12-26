package com.whut.javase;
/*
 * 	this:
 * 		1、this是什么，在内存方面是怎么样的：
 * 			    一个对象一个this。
 * 			    this是一个变量，是一个引用。this保存当前对象的内存地址，指向自身。
 * 			    严格意义上来说，this代表的就是"当前对象"，this存储在堆内存当中对象的内部
 *
 * 		2、this只能使用在实例方法中。哪个对象调用这个实例方法，this就是哪个对象。
 * 		  所以this代表的是：当前对象
 *
 * 		3、"this."大部分情况是可以省略的
 *
 * 		4、为什么this不能使用在静态方法中？
 * 		   this代表当前对象，静态方法中不存在当前对象
 */
public class ThisTest01 {
    public static void main(String[] args) {

        Customer c1 = new Customer("lisi");
        Customer c2 = new Customer("zhangsan");
        c1.shopping();
        c2.shopping();

    }
}

class Customer{

    String name; // 实例变量
    static int k = 100; // 静态变量

    public Customer() {
    }
    public Customer(String name) {
        this.name = name;
    }

    public void shopping() {
        // c1调用shopping()时，this是c1
        // c2调用shopping()时，this是c2
        // System.out.println(this.name + "正在购物");

        // this.是可以省略的，但还是默认访问"当前对象"的name，因为name是实例变量，需要"引用."访问
        System.out.println(name + "正在购物");

        // 静态变量用"类名."访问，因为是在本类中访问，所以"类名."可以省略
        // System.out.println(k);
    }

}