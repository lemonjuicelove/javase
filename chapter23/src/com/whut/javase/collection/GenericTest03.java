package com.whut.javase.collection;
/*
* 自定义泛型：
*       自定义泛型的时候，<>中的内容是一个标识符，随便写
*       java源代码中经常出现的是：<E>和<T>
                               E是Element单词首字母，T是Type单词首字母
*/
public class GenericTest03<标识符随便写> { // 这个标识符在new对象的时候指定是什么泛型，它就是什么泛型。
    public static void main(String[] args) {

        // new对象的时候指定了泛型是：String类型
        GenericTest03<String> gt = new GenericTest03<>();
        // 类型不匹配
        // gt.doSome(123);
        gt.doSome("abc");

        // new对象的时候指定了泛型是：Integer类型
        GenericTest03<Integer> gt2 = new GenericTest03<>();
        // 类型不匹配
        // gt2.doSome("def");
        gt2.doSome(100);

        // 不用泛型就是Object类型
        GenericTest03 gt3 = new GenericTest03();
        gt3.doSome(200); // 自动装箱
        gt3.doSome("def");
    }

    public void doSome(标识符随便写 o){  // 这个类在new对象的时候指定了什么泛型，这个数据类型就是什么泛型。
                                       // 但是要保持和上面类的泛型名称一致
        System.out.println(o);
    }

}
