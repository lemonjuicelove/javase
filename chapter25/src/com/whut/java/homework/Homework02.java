package com.whut.java.homework;

import java.util.ArrayList;
import java.util.List;

/*
* 使用生产者和消费者模式，交替输出：
* 假设只有两个线程，输出结果如下：
*       t1--->1
*       t2--->2
*       t1--->3
*       t2--->4
*       ...
*/
public class Homework02 {
    public static void main(String[] args) {

        List list = new ArrayList();
        Thread myThread1 = new t1(list);
        Thread myThread2 = new t2(list);

        myThread1.setName("t1");
        myThread2.setName("t2");

        myThread1.start();
        myThread2.start();

    }
}

class t1 extends Thread{

    // 共享的数字
    List list;

    int flag = 1;

    public t1(List list) {
        this.list= list;
    }

    @Override
    public void run() {
        // 死循环模拟一直输出
        while (true){
            synchronized (list){
                if (list.size() != 0){
                    try {
                        // 当前线程进入等待状态
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                list.add(1);
                System.out.println(Thread.currentThread().getName() + "--->" + flag);
                flag += 2;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 唤醒输出偶数的线程
                list.notify();
            }
        }
    }

}

class t2 extends Thread{

    // 共享的数字
    List list;

    int index = 2;

    public t2(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        // 死循环模拟一直输出
        while (true){
            // 给共享的列表加锁
            synchronized (list){
                if (list.size() == 0){
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                list.remove(0);
                System.out.println(Thread.currentThread().getName() + "--->" + index);
                index += 2;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 唤醒输出奇数的线程
                list.notify();
            }
        }
    }

}
