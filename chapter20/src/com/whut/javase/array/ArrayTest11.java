package com.whut.javase.array;

// Object[] 这是一个万能的数组，这个数组中可以装任何引用数据类型的数据

public class ArrayTest11 {
    public static void main(String[] args) {

        // 注意："hello"这是一个字符串对象，字符串在java中比较特殊，不需要new也是一个对象
        Object[] array = {new Husband(), new Wife(), "HELLO"};

    }
}
class Husband{
}
class Wife{
}