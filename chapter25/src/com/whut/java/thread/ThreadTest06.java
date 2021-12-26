package com.whut.java.thread;
/*
* 如何唤醒一个正在睡眠的线程，即终止线程的睡眠：
*       线程对象.interrupt();
*/
public class ThreadTest06 {
    public static void main(String[] args) {

        MyThread5 t5 = new MyThread5();
        t5.setName("t5");
        t5.start();

        try {
            Thread.sleep(1000*4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("唤醒t5线程");
        // 中断线程的睡眠(这种中断方式依靠了java的异常处理机制)
        t5.interrupt();

    }
}

class MyThread5 extends Thread{
    public void run(){

        System.out.println(Thread.currentThread().getName() + "---> start");
        Thread t = Thread.currentThread();
        // 子类不能抛出比父类更多的异常
        // 所以只能try..catch，不能上抛
        try {
            System.out.println(t.getName() + "进入睡眠");
            t.sleep(1000*60*60*24*365);
        } catch (InterruptedException e) {
            // 打印异常信息，可以选择不打印
            // e.printStackTrace();
        }
        System.out.println(t.getName() + "睡眠结束");
        System.out.println(Thread.currentThread().getName() + "---> end");

    }
}