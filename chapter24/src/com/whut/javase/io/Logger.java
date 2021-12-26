package com.whut.javase.io;

import javax.xml.crypto.Data;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* 日志工具
*/
public class Logger {
    public static void log(String msg){

        try {
            // 指向一个日志文件
            PrintStream printout = new PrintStream(new FileOutputStream("chapter24/src/com/whut/javase/io/logtest", true));
            // 改变输出方向
            System.setOut(printout);
            // 获取日期当前时间
            Date nowTime = new Date();
            // 改变日期格式
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
            String strTime = sdf.format(nowTime);
            // 输出日志时间和信息
            System.out.println(strTime + ":" + msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
