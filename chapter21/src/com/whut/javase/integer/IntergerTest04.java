package com.whut.javase.integer;
/*
* 自动装箱：基本数据类型自动转换成包装类
* 自动拆箱：包装类自动转换成基本数据类型
*
* 有了自动拆箱之后，Number类中的方法就用不上了
* 自动装箱和自动拆箱的好处：方便编程
*/

/*
自动装箱过程是通过调用包装器的valueOf方法实现的，而自动拆箱过程是通过调用包装器的xxxValue方法实现的
 */
public class IntergerTest04 {
    public static void main(String[] args) {


        Integer x = 1000; // 自动装箱
        Integer y  = 1000; // 自动装箱
        // x和y两个引用保存的对象的内存地址不同，因为x，y本质上是两个new出来的Integer对象
        System.out.println(x == y); // false

        // + 两边要求是基本数据类型的数字，x是包装类，不属于基本数据类型，这里会进行自动拆箱，将x转换成基本数据类型
        System.out.println(x + 1); // 自动拆箱

        /*
        * java中为了提高程序的执行效率，将[-128,127]之间所有的包装类对象提前创建好，放到了方法区中的整数型常量池当中了，
        * 目的是只要用这个区间的数据时，不需要再new Integer对象了，直接指向常量池中创建好的对象
        */
        Integer a = 100;
        Integer b = 100;


        Integer c = 1000;
        Integer d = 1000;
        // a和b没有创建新的Integer对象，a和b保存的内存地址都是指向整数型常量池当中的对象
        System.out.println(a == b); // true
        System.out.println(c == d); // false


    }
}
