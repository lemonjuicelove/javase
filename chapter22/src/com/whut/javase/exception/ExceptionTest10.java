package com.whut.javase.exception;

public class ExceptionTest10 {
    public static void main(String[] args) {

        /*
        * try和finally，没有catch，也可以使用
        * try不能单独使用，try finally可以联合使用
        *
        * 以下代码的执行顺序：
        *    先执行try，再执行finally，最后执行return(return语句只要执行，该方法必然结束)
        */
        try {
            System.out.println("try语句块执行");
            return;
        }finally {
            System.out.println("finally语句块执行");
        }

    }
}
