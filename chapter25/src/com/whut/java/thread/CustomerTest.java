package com.whut.java.thread;

/*
* 不使用线程同步机制，多线程对同一个账户进行取款，出现线程安全问题
* 使用线程同步机制，多线程对同一个账户进行取款，不会出现线程安全问题
*/
public class CustomerTest {
    public static void main(String[] args) throws InterruptedException {

        // 创建出多线程共享的账户对象
        Customer c1 = new Customer(10000);

        // 分支线程t1和主线程main共享一个账户对象c1
        Thread mr = new MyRunnable4(c1);
        mr.setName("t1");
        mr.start();

        Thread.sleep(2000);
        try {
            c1.quKuan(3000);
            System.out.println("主线程取款成功，余额还剩下：" + c1.getBalance());
        } catch (MoneyNotEnough e) {
            System.out.println(e.getMessage());
        }

    }
}

class MyRunnable4 extends Thread{

    // 要有一个实例变量来保证两个线程共享同一个账户
    private Customer customer;
    // 通过构造方法来传递共享的账户对象
    public MyRunnable4(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void run() {
        // run方法中进行取款的操作
        try {
            customer.quKuan(5000);
            System.out.println("分支线程取款成功，余额还剩下：" + customer.getBalance());
        } catch (MoneyNotEnough e) {
            System.out.println(e.getMessage());
        }
    }

}
