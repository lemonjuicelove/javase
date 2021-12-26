package com.whut.java.thread;

/*
* 关于线程的sleep方法：
*   static void sleep(long millis):
*
*   1、注意：静态方法(和对象无关)，类名. 调用
*
*   2、参数是毫秒
*
*   3、作用：让当前线程进入休眠，进入阻塞状态，放弃占有CPU时间片，让给其他线程使用
*           这行代码出现在A线程中，A线程就会进入休眠
*           这行代码出现在B线程中，B线程就会进入休眠
*
*   4、Thread.sleep()方法，可以做到这种效果：
*        间隔特定的时间，去执行一段特定的代码，每隔多久执行一次
*/
public class ThreadTest04 {
    public static void main(String[] args) {

        Thread t3 = new MyThread3();
        t3.setName("t3线程");
        t3.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
            // 出现在main方法当中，所以当前线程是主线程，主线程休眠
            try {
                Thread.sleep(1000*1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class MyThread3 extends Thread{

    public void run(){
        for (int i = 0; i < 10; i++) {
            // 让当前线程进入休眠，谁run谁就是当前线程。
            try {
                Thread.sleep(1000*0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }

}
