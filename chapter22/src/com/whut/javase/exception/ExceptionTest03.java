package com.whut.javase.exception;
/*
* 以下代码报错的原因：
*   doSome()方法声明位置上使用了：throws ClassNotFoundException
*   ClassNotFoundException属于编译时异常，必须编写代码时处理，没有处理编译器会报错
*/
public class ExceptionTest03 {

    public static void main(String[] args) {
        // main方法中调用doSome()方法，必须对这种异常进行预先的处理
        // 如果不处理，编译器报错：Unhandled exception: java.lang.ClassNotFoundException
        // main方法选择try..catch捕捉，处理异常
        try {
            doSome();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 这个代码表示doSome()方法在执行过程中，可能会出现ClassNotFoundException异常
     * 叫做类没有找到异常，这个异常直接父类是：Exception，所以ClassNotFoundException属于编译时异常
     * @throws ClassNotFoundException
     */
    public static void doSome() throws ClassNotFoundException{ // 上抛给调用者
        System.out.println("doSome thing");
    }

}
