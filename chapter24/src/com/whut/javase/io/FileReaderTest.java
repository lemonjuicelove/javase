package com.whut.javase.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
* FileReader:
*   文件字符输入流，只能读取普通文本
*   读取文本内容时，比较方便、快捷
*/
public class FileReaderTest {
    public static void main(String[] args) {

        FileReader reader = null;
        try {
            // 创建文件字符输入流对象
            reader = new FileReader("chapter24/src/com/whut/javase/io/HelloWorld");

            // 开始读,因为是字符流，所以采用的是char数组
            char[] chars = new char[1024*1024];
            int readNum;
            while ((readNum = reader.read(chars)) != -1){
                System.out.print(new String(chars, 0, readNum));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
