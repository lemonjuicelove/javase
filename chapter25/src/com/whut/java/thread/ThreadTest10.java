package com.whut.java.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
* 实现线程的第三种方式：
*       实现Callable接口
*
* 这种方式的优点：可以获取到线程的执行结果
* 这种方式的缺点：效率比较低，在获取t线程执行结果的时候，当前线程受阻塞
*/
public class ThreadTest10 {
    public static void main(String[] args) {

        // 创建一个实现了Callable接口的类的实例化对象
        MyThread10 myThread10 = new MyThread10();
        // 创建一个未来任务类对象
        FutureTask task = new FutureTask(myThread10);
        // 创建线程对象
        Thread t1 = new Thread(task);

        t1.setName("t1线程");
        t1.start();

        Object obj = null;
        try {
            obj = task.get(); // 获取t1线程的执行结果，该方法的执行会导致当前线程阻塞
        } catch (Exception e) {
            e.printStackTrace();
        }


        // main方法这里的程序要想执行必须等待get()方法的结束
        // get()方法是为了拿到另一个线程的执行结果，另一个线程执行是需要时间的
        System.out.println("hello world1");
        System.out.println(t1.getName() + "线程执行结果：" + obj);

    }
}

// 创建一个类实现Callable接口
class MyThread10 implements Callable{

    // call方法相当于run方法，只不过这个有返回值，返回值类型为Object
    @Override
    public Object call() throws Exception {
        System.out.println("call method begin");
        Thread.sleep(4000);
        System.out.println("call method over");
        return 100+200;
    }

}
