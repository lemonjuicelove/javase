package com.whut.java.thread;
/*
* 在java中怎么强行终止一个线程的执行：线程对象.stop();
* 缺点：容易丢失数据，直接将线程关闭，线程没有保存的数据将会丢失
*/
public class ThreadTest07 {
    public static void main(String[] args) {

        MyRunnable2 mr2 = new MyRunnable2();
        Thread mt = new Thread(mr2);
        mt.setName("t6");
        mt.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 强行终止t线程
        mt.stop();
        System.out.println("线程" + mt.getName() + "已终止");

    }
}

class MyRunnable2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}