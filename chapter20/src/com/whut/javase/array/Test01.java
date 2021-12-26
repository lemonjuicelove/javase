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
public class Test01 {
    public static void main(String[] args) {

        MyStack1 s1 = new MyStack1();
        Object obj1 = new Object();
        s1.pop();
        s1.push(obj1);
        s1.push(obj1);
        s1.push(obj1);
        s1.push(obj1);
        s1.push(obj1);
        s1.push(obj1);
        s1.pop();
        s1.push(obj1);

    }
}
class MyStack1{

    Object[] stack = null;
    int index = 0;

    public MyStack1() {
        this(new Object[5]);
    }

    public MyStack1(Object[] stack) {
        this.stack = stack;
    }

    public void push(Object obj){
        if (index < stack.length){
            this.stack[index++] = obj;
            System.out.println("压栈成功");
        }else {
            System.out.println("栈满了，压栈失败");
        }
    }

    public void pop(){
        if (index == 0){
            System.out.println("栈空了，弹栈失败");
        }else if (index == stack.length){
            this.stack[--index] = null;
            System.out.println("弹栈成功");
        }else {
            this.stack[index--] = null;
            System.out.println("弹栈成功");
        }
    }

}