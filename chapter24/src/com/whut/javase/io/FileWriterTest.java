package com.whut.javase.io;

import java.io.FileWriter;
import java.io.IOException;

/*
* FileWriter:
*   文件字符输出流，写
*   只能输出普通文本
*/
public class FileWriterTest {
    public static void main(String[] args) {

        FileWriter writer = null;
        try {
            // 创建文件字符输出流对象
            writer = new FileWriter("chapter24/src/com/whut/javase/io/WriterTest",true);
            // 开始写
            char[] chars = {'我', '是', '中', '国', '人'};
            writer.write(chars);
            writer.write("\n"); // 写一个换行符
            writer.write("赶路要紧！");

            // 写完之后一定要刷新
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
