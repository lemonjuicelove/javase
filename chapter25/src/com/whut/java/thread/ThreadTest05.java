package com.whut.java.thread;

/*
* 关于Thread.sleep()方法的一个题目：
*/
public class ThreadTest05 {
    public static void main(String[] args) {

        Thread t4 = new MyThread4();
        t4.setName("t4");
        t4.start();

        // 调用sleep方法
        try {
            // 问题：这行代码会让线程t4进入休眠吗？不会
            t4.sleep(1000*4); // sleep是静态方法，和对象无关，在执行的时候会转换成：Thread.sleep(1000*4);
                                 // 这行代码出现在main方法中，所以会让main线程休眠
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello world");

    }
}

class MyThread4 extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}