package com.whut.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* 深入了解try..catch
*   1、catch后面的小括号中的类型可以是具体的异常类型，也可以是该异常类型的父类型
*   2、catch可以写多个。建议catch的时候，精确的一个一个处理，这样有利于程序的调试
*   3、catch写多个的时候，从上到下，异常的类型要遵循从小到大原则
*/
public class ExceptionTest06 {

   // 允许抛出多个异常，但一定要包含有要解决的异常
   /* public static void main(String[] args) throws Exception, FileNotFoundException, NullPointerException {
    }
    */

    // 允许抛出该异常的父类型
    /*public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(" ");
        } catch (IOException e) {   // 多态：IOException e = new FileInputStream();
            System.out.println("文件不存在");
        }
    }*/

    /*public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(" ");
        } catch (Exception e) {     // 多态：Exception e = new FileInputStream();
            System.out.println("文件不存在");
        }
    }*/

    // catch写多个的时候，从上到下，遵循从小到大原则
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(" ");
            fis.read();
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        } catch (IOException e){
            System.out.println("读取错误");
        }
    }

    // 下面代码没有遵循catch的异常类型要从小到大排列原则
    /*public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(" ");
            fis.read();
        } catch (IOException e) { // 多态：IOException e = new FileInputStream();
            System.out.println("文件不存在");
        } catch (FileNotFoundException e) {
            System.out.println("读取错误");
        }
    }*/

}
