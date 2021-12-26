package com.whut.java.thread;

/*
* 1、怎么获取当前线程对象
*       这段代码出现在哪里，返回的就是哪个线程
*       Thread t = Thread.currentThread();
*       返回值t就是代表当前线程
*
* 2、获取线程对象的名字
*       String name = 线程对象.getName();
*
* 3、修改线程对象的名字
*       线程对象.setName("线程名字");
*
* 4、当线程没有设置名字时，默认的名字是：
*       Thread-0
*       Thread-1
*       Thread-2
*       ...
*/
public class ThreadTest03 {
    public static void main(String[] args) {

        // currentThread就是当前线程对象
        // 这段代码出现在main方法中，所以当前线程就是主线程
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName()); // 主线程的名字：main

        // 创建线程对象
        MyThread2 t1 = new MyThread2();
        System.out.println(t1.getName());
        // 设置线程名字
        t1.setName("t1");
        // 获取线程名字
        System.out.println(t1.getName());
        // 启动线程
        t1.start();

        MyThread2 t2 = new MyThread2();
        t2.setName("t2");
        System.out.println(t2.getName());
        t2.start();

    }
}

class MyThread2 extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            // currentThread就是当前线程对象。当前线程对象是谁？
            // 当t1线程执行run方法，那么这个当前线程就是t1
            // 当t2线程执行run方法，那么这个当前线程就是t2
            Thread currentThread = Thread.currentThread();
            System.out.println(currentThread.getName() + "--->" + i);
        }
    }
}