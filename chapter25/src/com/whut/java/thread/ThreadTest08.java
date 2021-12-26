package com.whut.java.thread;

/*
* 合理的终止一个线程的执行：
*       通过布尔标记来合理终止线程
*/
public class ThreadTest08 {
    public static void main(String[] args) {

        MyRunnable3 mr3 = new MyRunnable3();
        Thread mt = new Thread(mr3);
        mt.setName("t线程");
        mt.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 想要什么时候终止线程t的执行，将布尔标记修改为false即可
        mr3.setFlag(false);

    }
}

class MyRunnable3 implements Runnable{

    // 打一个布尔标记
    private boolean flag = true;

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (flag){  // 这里放需要执行的代码
                System.out.println(Thread.currentThread().getName() + "--->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else { // 这里放线程终止后，保存数据的代码
                System.out.println("线程" + Thread.currentThread().getName() + "已终止");
                System.out.println("数据已经保存");
                // 在return语句执行之前，可以写代码进行保存的操作。
                return;
            }
        }
    }

}
