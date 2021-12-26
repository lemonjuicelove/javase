package com.whut.javase.exception;
/*
* 第一题：编写程序，使用一维数组，模拟栈数据结构
* 要求：1、这个栈可以存储java中的任何引用数据类型的数据
*      2、在栈中提供push方法模拟压栈(栈满了，要有提示信息)
*      3、在栈中提供pop方法模拟弹栈(栈空了，要有提示信息)
*      4、编写测试程序，new栈对象，调用push pop方法模拟压栈弹栈动作
*      5、默认栈的初始化容量为10
*/

// 改良之后的程序(异常在实际开发中的应用)

public class Homework01 {
    public static void main(String[] args) {

        MyStack ms = new MyStack();
        try {
            ms.push(new Object());
            ms.push(new Object());
            ms.push(new Object());
            ms.push(new Object());
            ms.push(new Object());
            // 出现异常
            ms.push(new Object());
        } catch (HomeworkException e) {
            System.out.println(e.getMessage());
        }
        try {
            ms.pop();
            ms.pop();
            ms.pop();
            ms.pop();
            ms.pop();
            // 出现异常
            ms.pop();
        } catch (HomeworkException e) {
            System.out.println(e.getMessage());
        }

    }
}

class MyStack{
    private int index; // 定义栈帧
    private Object[] array = new Object[5]; // 定义栈的大小

    public MyStack() {
    }
    public MyStack(Object[] array) {
        this.array = array;
    }

    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }

    public Object[] getArray() {
        return array;
    }
    public void setArray(Object[] array) {
        this.array = array;
    }

    public void push(Object obj) throws HomeworkException {
        if (index >= array.length){
            /*System.out.println("栈内存已满，无法存储数据");
            return;*/
            throw new HomeworkException("栈内存已满，压栈失败");
        }
        this.array[index] = obj;
        index++;
        System.out.println("压栈" + obj + "元素成功");
    }

    public void pop() throws HomeworkException {
        if (index < 1){
            /*System.out.println("栈内存已空，没有数据需要弹栈");
            return;*/
            throw new HomeworkException("栈内存已空，弹栈失败");
        }
        System.out.println("弹栈" + this.array[index-1] + "成功");
        this.array[index-1] = null;
        index--;
    }
}
