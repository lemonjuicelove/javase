package com.whut.java.thread;

import java.util.ArrayList;
import java.util.List;

/*
* 1、使用wait方法和notify方法实现“生产者和消费者模式”
*
* 2、什么是“生产者和消费者模式”
*       生产线程负责生产，消费线程负责消费。生产线程和消费线程要达到平衡
*       这是一种特殊的业务需求，在这种特殊的情况下需要使用wait方法和notify方法
*
* 3、wait和notify方法不是线程对象的方法，是普通java对象都有的方法
*
* 4、wait方法和notify方法建立在线程同步的基础上，因为多线程要同时操作一个共享对象，有线程安全问题
*
* 5、wait方法作用：o.wait()让正在o对象上活动的线程t进入等待状态，并且释放掉t线程之前占有的o对象的锁
*
* 6、notify方法作用：o.notify()让正在o对象上等待的线程唤醒，只是通知，不会释放o对象上之前占有的锁
*
* 7、模拟一个需求：
*       仓库采用List集合，假设List集合中只能存一个元素
*       1个元素表示仓库满了，0个元素表示仓库空了
*/
public class ThreadTest11 {
    public static void main(String[] args) {

        // 创建一个共享的仓库对象
        List myList = new ArrayList();
        // 创建两个线程对象
        Thread producer = new Producer(myList);
        Thread consumer = new Consumer(myList);

        producer.setName("生产者线程");
        consumer.setName("消费者线程");

        producer.start();
        consumer.start();

    }
}

// 生产者线程
class Producer extends Thread{

    // 共享的仓库
    List list;
    public Producer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        // 使用死循环模拟一直生产
        while (true){
            // 给仓库对象list加锁
            synchronized (list){

                if (list.size() > 0 ){ // 大于0，说明仓库中有元素，仓库满了，无法生产
                    try {
                        // 当前线程进入等待状态，并且释放Producer之前占有的list集合的锁
                        // 该方法直接让当前线程下面的代码都不执行了，重新回到就绪状态
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // 程序执行到这里说明仓库是空的，可以生产
                Object obj = new Object();
                list.add(obj);
                System.out.println(Thread.currentThread().getName() + "正在生产" + "--->" + obj);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 唤醒消费者线程进行消费
                list.notifyAll();
                // 程序到这整个synchronized中的同步代码块结束，释放掉Producer线程占有的list集合的锁。
            }

        }
    }

}

// 消费者线程
class Consumer extends Thread{

    // 共享的仓库
    List list;
    public Consumer(List list) {
        this.list = list;
    }
    @Override
    public void run() {
        // 使用死循环模拟一直消费
        while (true){
            // 给仓库对象list加锁
            synchronized (list){
                if (list.size() == 0){ // =0说明仓库中没有元素，仓库空了，无法消费
                    try {
                        // 当前线程进入等待状态，并且释放Consumer之前占有的list集合的锁
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // 程序能够执行到这里，说明可以进行消费
                Object obj = list.remove(0);
                System.out.println(Thread.currentThread().getName() + "正在消费" + "--->" + obj);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 唤醒生产者进行生产
                list.notifyAll();
                // 程序到这整个synchronized中的同步代码块结束，释放掉Consumer线程占有的锁。
            }
        }
    }

}