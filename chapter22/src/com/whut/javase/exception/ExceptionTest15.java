package com.whut.javase.exception;

/*
* 方法覆盖的遗留问题：重写之后的方法不能比重写之前的方法抛出更多(更广泛)的异常，可以更少
*/
public class ExceptionTest15 {
    public static void main(String[] args) {

    }
}

class Animal{
    public void doSome(){
    }

    public void doOther() throws Exception{
    }
}

class Cat extends Animal{

    // 编译报错，重写之前没抛异常，重写之后抛出了更多的异常
    /*public void doSome() throws Exception{
    }*/

    // 不抛异常，不会报错 (遵循不能抛出更多，可以抛出更少的原则)
    /*public void doOther(){
    }*/

    // 抛出更小的异常，不会报错 (遵循不能抛出更大的异常原则)
    /*public void doOther() throws NullPointerException{
    }*/

    // 抛出同级的异常，不会报错 (遵循不能抛出更大的异常原则)
    /*public void doOther() throws Exception{
    }*/

}
