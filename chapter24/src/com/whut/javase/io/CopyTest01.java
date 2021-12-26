package com.whut.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 使用FileInputStream + FileOutputStream完成文件的拷贝
* 使用以上的字节流拷贝文件的时候，文件类型随意，什么样的文件都能拷贝
*
* 拷贝过程的核心应该是一边读，一边写
*/
public class CopyTest01 {
    public static void main(String[] args) {

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            // 创建输入流对象
            fis = new FileInputStream("C:\\Users\\73561\\Desktop\\python学习\\java学习知识\\p766-线程生命周期.png");
            // 创建输出流对象
            fos = new FileOutputStream("C:\\Users\\73561\\Desktop\\现代控制理论作业\\p766-线程生命周期.png");

            // 最核心的是：一边读，一边写
            byte[] bytes = new byte[1024 * 1024];
            int readNum = 0;
            while ((readNum = fis.read(bytes)) != -1){
                fos.write(bytes,0, readNum);
            }

            // 输出流最后要刷新
            fos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            // 分开try，不要一起try
            // 一起try的时候，其中一个出现异常，可能会影响到另一个流的关闭
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
