package com.whut.javase;
/*
 * 	什么时候变量声明为实例的，什么时候声明为静态的：
 * 		如果这个类型的所有对象的某个属性值都是一样的，不建议定义为实例变量，浪费内存空间。
 * 		建议定义为类级别特征，定义为静态变量，在方法区中只保留一份，节省内存开销
 *
 * 	一个对象一份的是实例变量
 * 	所有对象一份的是静态变量
 */
public class StaticTest02 {
    public static void main(String[] args) {

        Chinese c1 = new Chinese("112233", "zhangsan");
        System.out.println(c1.idCard);
        System.out.println(c1.name);
        System.out.println(Chinese.country);

        Chinese c2 = new Chinese("445656", "lisi");
        System.out.println(c2.idCard);
        System.out.println(c2.name);
        System.out.println(Chinese.country);

    }
}

class Chinese{

    String idCard;
    String name;

    // 加static的变量叫做静态变量，静态变量在类加载时初始化，不需要new对象。静态变量存储在方法区
    final static String country = "中国";

    // 只要是方法，不管是静态方法、实例方法、构造方法，它们在运行时都需要压栈
    public Chinese() {
    }
    public Chinese(String s1, String s2) {
        idCard = s1;
        name = s2;
    }

}