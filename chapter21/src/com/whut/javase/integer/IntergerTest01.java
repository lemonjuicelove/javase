package com.whut.javase.integer;
/*
* 1、java中为8种基本数据类型又对应准备了8种包装类型。8种包装类属于引用数据类型，父类是Object
*
* 2、为什么要再提供8种包装类？
*       因为8种基本数据类型不够用，所以SUN公司又提供对应的8种包装类型
*/
public class IntergerTest01 {
    public static void main(String[] args) {

        // 需求：调用doSome()方法的时候需要传一个数字进去
        // 但是数字属于基本数据类型，doSome()方法参数的类型是Object，无法接收基本数据类型的数字
        // 方法：可以传一个数字对应的包装类进去

        // 把100经过构造方法包装成一个对象，这个对象属于Object类
        MyInt myint = new MyInt(100);
        doSome(myint);
    }

    public static void doSome(Object obj){
        System.out.println(obj);
    }
}

// 实际开发中这种包装类不需要自己写
// 8种基本数据类型对应的8种包装类，SUN公司写好了，直接调用
class MyInt{

    int value;

    public MyInt() {
    }
    public MyInt(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyInt{" +
                "value=" + value +
                '}';
    }
}
