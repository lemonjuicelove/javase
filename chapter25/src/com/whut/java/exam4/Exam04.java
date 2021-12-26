package com.whut.java.exam4;
/*
* 思考：t2线程doOther方法执行的时候需要等待t1线程的doSome方法结束吗
*       需要：因为在静态方法上使用synchronized，表示找类锁，不管创建了几个对象，类锁只有1把
*/
public class Exam04 {
    public static void main(String[] args) {

        MyClass mc1 = new MyClass();
        MyClass mc2 = new MyClass();
        Thread t1 = new MyThread(mc1);
        Thread t2 = new MyThread(mc2);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        try {
            Thread.sleep(2000); // 睡眠的作用是为了保证线程t1能够先执行
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();

    }
}

class MyThread extends Thread{

    private MyClass myClass;

    public MyThread(MyClass myClass) {
        this.myClass = myClass;
    }

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("t1")){
            myClass.doSome();
        }
        if (Thread.currentThread().getName().equals("t2")){
            myClass.doOther();
        }
    }

}

class MyClass{

    public synchronized static void doSome(){
        System.out.println("doSome begin");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSome over");
    }

    public synchronized static void doOther(){
        System.out.println("doOther begin");
        System.out.println("doOther over");
    }

}
