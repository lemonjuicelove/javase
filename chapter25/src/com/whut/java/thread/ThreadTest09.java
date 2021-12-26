package com.whut.java.thread;

/*
* 守护线程：用户线程(主线程)结束，守护线程自动结束
*/
public class ThreadTest09 {
    public static void main(String[] args) {

        Thread mt = new BakDataThread();
        mt.setName("守护线程之数据备份线程");

        // 启动线程之前，将线程设置为守护线程
        mt.setDaemon(true);
        mt.start();

        // 主线程：主线程是用户线程
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class BakDataThread extends Thread{
    @Override
    public void run() {
        int i = 0;
        // 即使是死循环，但由于该线程被设置成守护线程时，当用户线程结束，守护线程自动终止。
        while (true){
            System.out.println(Thread.currentThread().getName() + "--->" + (++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
