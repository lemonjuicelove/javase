package com.whut.javase.array;
/*
* 第一题：编写程序，使用一维数组，模拟栈数据结构
* 要求：1、这个栈可以存储java中的任何引用数据类型的数据
*      2、在栈中提供push方法模拟压栈(栈满了，要有提示信息)
*      3、在栈中提供pop方法模拟弹栈(栈空了，要有提示信息)
*      4、编写测试程序，new栈对象，调用push pop方法模拟压栈弹栈动作
*      5、默认栈的初始化容量为10
* 提示：栈帧为0的时候，栈空了；栈帧为最大值的时候，栈满了
*/
public class Homework01 {
    public static void main(String[] args) {

        MyStack ms = new MyStack();
        // ms.pop();
        ms.push("hello");
        System.out.println(ms.getIndex());
        System.out.println(ms.getArray()[0]);
        ms.pop();
        System.out.println(ms.getArray()[0]);
        ms.pop();

        Object[] array2 = new Object[4];
        MyStack ms2 = new MyStack(array2);
        ms2.push("nihao");
        ms2.push("world");
        ms2.push("didi");
        ms2.push("dada");
        System.out.println(ms2.getArray()[3]);
        ms2.push("titi");
        System.out.println(ms2.getArray()[3]);
    }
}

class MyStack{

    private int index; // 定义栈帧
    private Object[] array = new Object[10]; // 定义栈的大小

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

    public void push(Object obj){ // 压栈方法
        if (index >= array.length){
            System.out.println("栈内存已满，无法存储数据");
            return;
        }
        this.array[index] = obj;
        index++;
        System.out.println("压栈" + obj + "元素成功");
    }
    public void pop(){ // 弹栈方法
        if (index < 1){
            System.out.println("栈内存已空，没有数据需要弹栈");
            return;
        }
        System.out.println("弹栈" + this.array[index-1] + "成功");
        this.array[index-1] = null;
        index--;
    }
}
