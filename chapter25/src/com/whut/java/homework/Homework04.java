package com.whut.java.homework;
/*
 * 使用生产者和消费者模式，交替输出：
 * 假设只有两个线程，输出结果如下：
 *       t1--->1
 *       t2--->2
 *       t1--->3
 *       t2--->4
 *       ...
 */
public class Homework04 {
    public static void main(String[] args) {

        NumTest num = new NumTest(1);
        Thread t1 = new MyThreadTT1(num);
        Thread t2 = new MyThreadTT2(num);

        t1.setName("t1线程");
        t2.setName("t2线程");

        t1.start();
        t2.start();

    }
}
class NumTest{

    private int number;
    public NumTest(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

}
class MyThreadTT1 extends Thread{

    private NumTest num;
    public MyThreadTT1(NumTest num) {
        this.num = num;
    }

    @Override
    public void run() {
        while(true){
            synchronized (num){
                if (num.getNumber() % 2 == 0){ // 如果number是偶数
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 执行到这里说明是奇数
                System.out.println(Thread.currentThread().getName() + "----->" + num.getNumber());
                num.setNumber(num.getNumber() + 1);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                num.notify();
            }
        }
    }
}

class MyThreadTT2 extends Thread{

    private NumTest num;
    public MyThreadTT2(NumTest num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (true){
            synchronized (num){
                if (num.getNumber() % 2 != 0){ // 如果number是奇数
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 执行到这里说明是偶数
                System.out.println(Thread.currentThread().getName() + "---->" + num.getNumber());
                num.setNumber(num.getNumber() + 1);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                num.notify();
            }
        }
    }

}