package com.whut.javase.exception;

public class ExceptionTest11 {
    public static void main(String[] args) {

        try{
            System.out.println("try...");

            // 退出JVM
            System.exit(0);  // 退出JVM之后，finally中的代码不执行
        }finally {
            System.out.println("finally...");
        }



    }
}
