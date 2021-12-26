package com.whut.javase.io;

public class LoggerTest {
    public static void main(String[] args) throws InterruptedException {

        Logger.log("第一次测试日志工具");
        Thread.sleep(1000);
        Logger.log("第二次测试日志工具");
        Thread.sleep(1000);
        Logger.log("第三次测试日志工具");
        Thread.sleep(1000);
        Logger.log("第四次测试日志工具");

    }
}
