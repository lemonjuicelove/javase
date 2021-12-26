package com.whut.java.homework;

import java.util.ArrayList;
import java.util.List;

/*
java多线程模拟实现12306售票

业务描述
	假设有200张票，用4个线程去订票，不能有两个或者以上的线程订到了
	同一个票（原因就不说了），当最后一张票卖掉的时候结束，再订就抛
	异常提示出票卖完了。

业务分析,要实现以上功能，

	1、需要创建一个车票类，初始化票，卖票的接口saleTicket()

	2、自定义异常的一个类。

	3、创建卖票线程类，在run方法中卖车票。

	4、初始化买票的线程,负责初始化车票,也就是初始化Ticket类中的数组。

	5、创建主方法进行测试。

*/
public class Homework01 {
    public static void main(String[] args) {


        Ticket mt = new Ticket(20);



        Thread my1 = new MyThread(mt);
        Thread my2 = new MyThread(mt);
        Thread my3 = new MyThread(mt);
        Thread my4 = new MyThread(mt);

        my1.setName("窗口1");
        my2.setName("窗口2");
        my3.setName("窗口3");
        my4.setName("窗口4");

        my1.start();
        my2.start();
        my3.start();
        my4.start();

        /*try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(mt.getTicketNum());*/

    }
}

class MyThread extends Thread{

    private Ticket ticket;

    public MyThread(Ticket ticket) {
        this.ticket = ticket;
    }

    public Ticket getTicket() {
        return ticket;
    }
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        while (ticket.getTicketNum() > 0){
            ticket.saleTicket();
        }
    }

    /*
    * 执行原理分析：
    *   线程4先占有了共享对象锁，其他三个线程已经经过了循环条件判断，进入ticket.saleTicket();代码，处于等待状态。
    *   当线程4票卖完的时候，在进行下一次循环条件判断时，为false，run方法结束
    *   其他三个线程在等待状态，当可以占有对象锁的时候，ticket=0，抛出异常，ticket.saleTicket()方法结束，在下一次循环条件判断时，为false，run方法结束
    */

}
