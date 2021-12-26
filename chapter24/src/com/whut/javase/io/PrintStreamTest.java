package com.whut.javase.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
* java.io.PrintStream：标准的字节输出流，默认输出到控制台
*/
public class PrintStreamTest {
    public static void main(String[] args) {

        // System类的源代码中：public static final PrintStream out;  // 默认输出到控制台

        // 合并写
        System.out.println("hello world");

        // 分开写
        PrintStream ps = System.out;
        ps.println("你好你好");
        ps.println("今天是星期三");
        // 标准输出流不需要手动close()关闭

        // 改变标准输出流的输出方向
        PrintStream ps2 = null;
        try {
            FileOutputStream fos = new FileOutputStream("chapter24/src/com/whut/javase/io/printtest");
            ps2 = new PrintStream(fos);
            // 修改输出方向，标准输出流不再指向控制台，指向"printtest"文件
            System.setOut(ps2);
            System.out.println("这个世界危在旦夕");
            System.out.println("信仰圣光吧！");
            System.out.println("湖人总冠军！！！");

            ps2.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
