package com.whut.java.homework;
/*
* Homework02的改进版
*/
public class Homework03 {
    public static void main(String[] args) {

        MyNum myNum = new MyNum(1);
        Thread t1 = new MyThread1(myNum);
        Thread t2 = new MyThread2(myNum);

        t1.setName("奇数线程");
        t2.setName("偶数线程");

        t1.start();
        t2.start();

    }
}
// 共享的数字类
class MyNum{
    private int i;
    public MyNum(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }
}
// 输出奇数的线程t1
class MyThread1 extends Thread{

    MyNum num;
    public MyThread1(MyNum num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (true){
            // 给数字对象加锁
            synchronized (num){
                if (num.getI() % 2 == 0){
                    // 如果对象中的数字为偶数，当前线程等待
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 程序执行到这说明对象中的数字为奇数，当前线程执行
                System.out.println(Thread.currentThread().getName() + "--->" + num.getI());
                // 更新共享对象中的数字
                int temp = num.getI();
                num.setI(++temp);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 唤醒偶数线程
                num.notifyAll();
            }
        }
    }

}
// 输出偶数的线程t2
class MyThread2 extends Thread{

    MyNum num;
    public MyThread2(MyNum num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (true){
            // 给数字对象加锁
            synchronized (num){
                if (num.getI() % 2 != 0){
                    // 如果对象中的数字为奇数，当前线程等待
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 程序执行到这说明对象中的数字为偶数，当前线程执行
                System.out.println(Thread.currentThread().getName() + "--->" + num.getI());
                // 更新共享对象中的数字
                int temp = num.getI();
                num.setI(++temp);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 唤醒奇数线程
                num.notifyAll();
            }
        }
    }

}