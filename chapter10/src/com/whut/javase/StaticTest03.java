package com.whut.javase;
/*
 * 	实例的：一定需要使用"引用."的方式来访问
 *
 * 	静态的：
 * 		建议使用"类名."的方式来访问，但使用"引用."的方式来访问也可以(运行时会转换成"类名.")
 *
 * 	空指针异常只有在什么情况下才会发生：
 * 		只有在"空引用"访问"实例"相关的，会出现空指针异常
 */
public class StaticTest03 {
    public static void main(String[] args) {

        System.out.println(Chinese02.country);
        Chinese02 c1 = new Chinese02("778899", "xiaowang");
        System.out.println(c1.idCard);
        System.out.println(c1.country);

        c1 = null; // c1是空引用

        // 下面代码不会出现空指针异常，因为静态变量不需要对象的存在
        // 实际上以下代码在运行时，还是：System.out.println(Chinese02.country);
        System.out.println(c1.country);

        // 会出现空指针异常
        System.out.println(c1.idCard);

    }
}

class Chinese02{

    String idCard;
    String name;
    final static String country = "China";

    public Chinese02() {
    }
    public Chinese02(String idCard, String name) {
        this.idCard = idCard;
        this.name = name;
    }

}