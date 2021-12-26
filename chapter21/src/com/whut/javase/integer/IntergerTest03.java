package com.whut.javase.integer;
/*
* 关于Integer类的构造方法，有两个：
*   Integer(int)
*   Integer(String)
*
* 照葫芦画瓢学习其他包装类
*/

public class IntergerTest03 {
    public static void main(String[] args) {

        // 将int类型的数字转换成Integer包装类型 (int ---> Integer)
        Integer x = new Integer(100); // 装箱
        System.out.println(x);



        // 将String类型的数字转换成Integer包装类型 (String ---> Integer)
        // Integer y = new Integer("124");

        // 这里面会调用其他方法先将String类型转换为int类型，然后进行自动装箱
         /*public static Integer valueOf(String s) throws NumberFormatException {
                return parseInt(s, 10);
           }*/
        Integer y = Integer.valueOf("123");
        System.out.println(y);

        // 照葫芦画瓢学习Double包装类
        Double a = new Double(10.0);
        System.out.println(a);
        Double b = new Double("21.1");
        System.out.println(b);

        // 通过访问包装类的常量，来获取最大值和最小值
        System.out.println("int的最大值：" + Integer.MAX_VALUE);
        System.out.println("short的最小值：" + Short.MIN_VALUE);

    }
}
