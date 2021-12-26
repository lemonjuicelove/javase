package com.whut.javase.exception;
/*
* 1、异常在java中以类的形式存在，每一个异常类都可以创建异常对象
*
* 2、异常的继承结构是什么样的？(可以使用UML图来描述继承结构)
*       Object
*       Object下有Throwable(可抛出的)
*       Throwable下有两个分支：Error(不可处理，直接退出JVM)和Exception(可处理的)
*       Exception下有两个分支：
*           Exception的直接子类：编译时异常(在编写阶段必须预先对这些异常进行处理，如果不处理，编译器报错)
*           RuntimeException：运行时异常(在编写程序阶段可以预先处理，也可以不处理)
*
* 3、编译时异常和运行时异常都是发生在运行阶段，在编译阶段,异常是不会发生的
*       因为异常的发生就是在new异常对象，只有程序运行时才可以new对象
*
* 4、编译时异常和运行时异常的区别：
*      编译时异常发生的概率比较高，运行时异常发生的概率比较低
*
* 5、编译时异常又称受检异常、受控异常：CheckedException
*    运行时异常又称非受检异常，非受控异常：UnCheckedException
*
* 6、java语言中对异常的处理包括两种方式
*       第一种方式：在方法声明的位置上，使用throws关键字，抛给上一级，谁调用我，我就抛给谁
*       第二种方式：使用try..catch语句进行异常的捕捉
*
*   思考：异常发生之后，如果选择上抛，抛给上一级的调用者，调用者需要对这个异常继续处理，处理方式同样有两种
*   注意：java中异常发生之后如果一直上抛，最终抛给了main方法，main方法继续上抛，抛给调用者JVM，JVM知道这个异常发生，
*        只有一个结果。终止java程序的执行
*
* 7、什么是UML？有什么用？
*   UML是一种统一建模语言，一种图标式语言
*   在UML图中可以描述类和类之间的关系，程序执行的流程，对象的状态等
*/
public class ExceptionTest02 {
    public static void main(String[] args) {

        // 通过异常类实例化异常对象

        NumberFormatException nfe = new NumberFormatException();
        System.out.println(nfe); // 自动调用toString方法  java.lang.NumberFormatException

        NullPointerException npe = new NullPointerException("空指针异常");
        System.out.println(npe); // 自动调用toString方法  java.lang.NullPointerException: 空指针异常

    }
}
