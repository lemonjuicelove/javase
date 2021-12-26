package com.whut.java.thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
* 定时器
*/
public class TimerTest {
    public static void main(String[] args) {

        // 创建定时器对象，设置成守护线程的方式
        Timer timer = new Timer(true);

        // timer.schedule(定时任务，延迟执行的时间，间隔多久执行一次)
        // 定时任务是自己定义的，只要继承了TimerTask类就行
        timer.schedule(new MyTimerTask(), 50, 2000);

        for (int i = 1; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

// 自定义一个定时任务类去继承TimerTask，在实现其抽象方法
class MyTimerTask extends TimerTask{
    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String nowTime = sdf.format(new Date());
        System.out.println(nowTime + ":成功执行了一次定时任务");
    }
}

