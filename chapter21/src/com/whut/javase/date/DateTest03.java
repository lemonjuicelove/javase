package com.whut.javase.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest03 {
    public static void main(String[] args) {

        Date nowTime = new Date(2); // 参数是毫秒，传入的参数不同，调用的构造方法不同，api文档中查看
        System.out.println(nowTime);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:ss");
        String time1 = sdf.format(nowTime);
        System.out.println(time1); // 1970-01-01 08:00:002  08是时区原因

        // 获取昨天此时的时间
        Date yesterdayTime = new Date(System.currentTimeMillis() - 1000*60*60*24);
        System.out.println(yesterdayTime);
        String time2 = sdf.format(yesterdayTime);
        System.out.println(time2);

    }
}
