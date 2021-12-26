package com.whut.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
* 关于try..catch中的finally子句：
*   1、在finally子句中的代码在try..catch中是最后执行的，并且一定是会执行的，即使try语句块中的代码出现了异常。
*      finally子句必须和try一起出现，不能单独编写
*
*   2、finally语句通常使用在哪些情况下？
*       通常在finally语句块中完成资源的释放/关闭
*       因为finally中的代码有保障，即使try语句块中的代码出现了异常，finally中的代码也会正常执行
*/
public class ExceptionTest09 {
    public static void main(String[] args) {

        FileInputStream fis = null; // 声明位置放在外面，这样在finally子句中也能使用
        try{
            // 创建输入流对象
            fis = new FileInputStream("C:\\Users\\73561\\Desktop\\Java学习\\java\\Java面试宝典Beta5.0(最新).docx");

            String s = null;
            // 出现空指针异常，出现异常后，下面代码不会执行
            s.toString();

            // 流使用完需要关闭，因为流占用资源
            // 即使以上程序出现异常，流也需要关闭。代码放在下面流可能关不了
            // fis.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (NullPointerException e){
            e.printStackTrace();
        }finally {
            // 流的关闭放在这里比较保险，即使try中出现了异常，finally中的代码块也是一定执行的
            if (fis != null){ // 避免空指针异常
                try {
                    // close()方法存在异常，采用捕捉的方式
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
