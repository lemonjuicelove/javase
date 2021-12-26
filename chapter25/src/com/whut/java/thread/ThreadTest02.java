package com.whut.java.thread;

/*
* 实现线程的第二种方式：编写一个类实现java.lang.Runnable接口，实现run方法
*/
public class ThreadTest02 {
    public static void main(String[] args) {

        // 创建一个可运行的对象
        MyRunnable mr = new MyRunnable();
        // 将可运行的对象封装成一个线程对象
        Thread mt = new Thread(mr);
        // 启动线程
        mt.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("主线程--->" + i);
        }

    }
}

// 该类是一个可运行的类，还不是一个线程
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("分支线程--->" + i);
        }
    }
}
