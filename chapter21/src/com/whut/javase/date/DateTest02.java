package com.whut.javase.date;
/*
* 获取自1970-1-1 00：00：00 000 到当前系统时间的总毫秒数
*
* 简单总结下System类的相关属性和方法：
*       System.out  [out是System类的静态变量，它的类型是PrintStream类型]
*       System.out.println() [println()方法不是System类的，是PrintStream类的方法]
*       System.gc() 建议启动垃圾回收器
*       System.currentTimeMillis()  获取自1970-1-1 00：00：00 000 到当前系统时间的总毫秒数
*       System.exit(0)  退出JVM
*/
public class DateTest02 {

    public static void main(String[] args) {

        long nowTimeMillis = System.currentTimeMillis();
        System.out.println(nowTimeMillis);

        // 统计一个方法的耗时
        // 在调用目标方法之前记录一个毫秒数
        long beginTimeMillis = System.currentTimeMillis();
        print();
        // 在目标方法执行完之后记录一个毫秒数
        long overTimeMillis = System.currentTimeMillis();
        System.out.println("方法耗时"+(overTimeMillis - beginTimeMillis)+"毫秒");
    }

    public static void print(){
        for (int i = 0; i < 100; i++) {
            System.out.println("i = " + i);
        }
    }

}
