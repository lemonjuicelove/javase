package com.whut.javase.exception;
/*
* 1、SUN公司提供的JDK内置的异常肯定是不够用的，在实际开发中，有很多的业务异常JDK中都是没有的
*    那么就需要我们自己定义异常类
*
* 2、Java中怎么自定义异常？
*       第一步：编写一个类继承Exception(编译时异常)或者RunTimeException(运行时异常)
*       第二步：提供两个构造方法，一个无参的，一个带有String参数的
*/

public class MyException extends Exception{ // 编译时异常

    public MyException() {
        // super();  // 默认存在，调用父类的无参构造
    }

    public MyException(String message) {
        // 调用父类的有参构造
        super(message);
    }

}
/*public class MyException extends RuntimeException{ // 运行时异常
}*/
