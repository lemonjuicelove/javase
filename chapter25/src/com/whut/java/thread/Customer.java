package com.whut.java.thread;

// 银行账户类
public class Customer {

    private double balance; // 实例变量
    Object obj = new Object();

    public Customer(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void quKuan(double money) throws MoneyNotEnough {

        // 不使用线程同步机制的代码
        /*if (balance < money){
            throw new MoneyNotEnough("余额不足");
        }
        // 这里模拟一下网络延迟，百分百会出问题
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setBalance(balance - money);*/

        // 使用线程同步机制的代码
        // 以下代码必须是线程排队的，不能并发
        /*
        * 线程同步机制的语法是：
        *       synchronized(){
        *           // 线程同步代码块
        *       }
        *       synchronized后面小括号中传入的数据非常关键：
        *           这个数据必须是多线程共享的数据，才能达到多线程排队的效果
        *
        *       ()中写什么？要看想让哪些线程同步：
        *           假设t1、t2、t3、t4、t5有5个线程，只希望t1、t2、t3排队，t4、t5不需要排队
        *           ()中写一个t1、t2、t3共享的对象，而这个对象对于t4、t5不共享
        */

        /*
        * 在java语言中，任何一个对象都有一把锁，其实这把锁就是标记。100个对象，100把锁，一个对象一把锁
        * 以下代码执行原理：
        *       1、假设t1和t2线程并发，开始执行以下代码的时候，肯定有一个先一个后
        *       2、假设t1先执行了，遇到了synchronized，这个时候自动找"后面共享对象"的对象锁，找到之后，
        *       占有这把锁，然后执行同步代码块中的程序，在程序执行过程中一直都是占有这把锁的，直到同步代码块
        *       结束，这把锁才会释放
        *       3、假设t1已经占有这把锁，此时t2也遇到synchronized关键字，也会去占有后面共享对象的这把锁，结果
        *       这把锁被t1占有，t2只能在同步代码块外面等待t1的结束，直到t1把同步代码块执行结束之后，t1会归还这
        *       把锁，此时t2等到这把锁，t2占有这把锁，进入到同步代码块中执行
        *
        *       这样就达到了线程排队执行
        *       注意：这个共享对象一定要选好，一定是需要排队执行的线程所共享的
        */

        /*
        * 在实例方法上也可以使用synchronized：
        *       synchronized出现在实例方法上，锁的一定是this，不能是其他对象，所以这种方式不灵活
        *
        *       缺点：synchronized出现在实例方法上，表示整个方法体都需要同步，可能会无故扩大同步
        *            的范围，导致程序的执行效率降低。
        *       优点：代码变少
        *
        *       如果共享的对象是this，并且需要同步的代码块是整个方法体，建议使用这种方法
        */

        // 这里的共享对象是：new出来的账户对象，而this代表的就是new的账户对象
        // synchronized (obj){ // obj可以，因为obj是实例变量，1个账户对象只有1个obj，两个线程共享一个账户对象，所以它是共享的
        // Object obj2 = new Object();
        // synchronized (obj2){ // obj2不行，因为obj2是局部变量，局部变量都在栈中，一个线程一个栈，不是共享对象
        // synchronized ("abc"){ // "abc"可以，因为在字符串常量池只有一个，缺点：所有的线程都共享这个对象
        synchronized (this){
            if (balance < money){
                throw new MoneyNotEnough("余额不足");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setBalance(balance - money);
        }

    }

}

class MoneyNotEnough extends Exception{

    public MoneyNotEnough() {
    }
    public MoneyNotEnough(String message) {
        super(message);
    }

}
