package com.whut.javase.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* java中对日期的处理
*/
public class DateTest01 {
    public static void main(String[] args) throws ParseException {

        // 获取系统当前时间，直接调用无参数构造方法就行
        Date nowTime = new Date();
        // System.out.println(nowTime); // Fri Oct 30 20:10:10 CST 2020


        // 将日期类型Date，按照指定的格式进行转换：Date ---> String
        // SimpleDateFormat是java.text包下的，专门负责日期格式化的
        /*
        * yyyy年  MM月  dd日  HH分  ss秒  SSS毫秒
        * 注意：在日期格式当中，除了y M d H s S这些字符不能随便写之外，剩下的符号格式随意组织
        */

        // 创建一个格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:ss SSS");
        // 调用其中的方法将Date类型转换字符串类型
        String time = sdf.format(nowTime);
        System.out.println(time);


        // 将日期字符串String转换成Date类型  String ---> Date
        String time2 = "2020-02-18 08:00:00";
        // SimpleDateFormat sdf2 = new SimpleDateFormat("格式不能随便写，要和日期字符串相对应")
        // 否则会出现异常：java.text.ParseException

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:ss:SSS");
        // 调用其中方法将String转换成Date方法
        Date dataTime = sdf2.parse(time2);
        System.out.println(dataTime);

    }
}