package com.whut.java.thread;

/*
* 实现线程的第一种方式：
*       编写一个类，直接继承java.lang.Thread，重写run方法
*
* 注意：方法体当中的代码永远都是自上而下的顺序依次逐行执行的
*
* 以下程序的输出结果有这样的特点：有先有后，有多有少
*/
public class ThreadTest01 {
    public static void main(String[] args) {

        // 这里是main方法，这里的代码属于主线程，在主栈中运行

        // 新建一个分支线程对象
        MyThread mt = new MyThread();
        // mt.run(); // 直接调用MyThread类中的run方法，属于调用实例方法，不会启动线程，不会分配新的分支栈(还是单线程)

        // 启动线程
        // start()方法的作用是：启动一个分支线程，在JVM开辟一个新的栈空间，这段代码任务完成之后，瞬间就结束了
        // 启动成功的线程会自动调用run方法，并且run方法在分支栈的栈底部(压栈)
        // run方法在分支栈的栈底部，main方法在主栈的栈底部，run和main是平级的
        mt.start();

        // 这里的代码还是运行在主线程当中
        for (int i = 0; i < 20; i++) {
            System.out.println("主线程--->" + i);
        }

    }
}

// 该类是一个可运行的线程
class MyThread extends Thread{
    @Override
    public void run() {
        // 编写程序，这段程序运行在分支线程中(分支栈)
        for (int i = 0; i < 20; i++) {
            System.out.println("分支线程--->" + i);
        }
    }
}