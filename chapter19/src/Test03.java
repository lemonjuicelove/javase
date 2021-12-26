/*
* java语言当中的字符串String是否重写了toString方法和equals方法
* 总结：1、String类已经重写了toString方法
*      2、String类已经重写了equals方法，比较两个字符串不能使用 ==，必须使用equals，equals是通用的
*
* 结论：
*   java中什么类型的数据可以使用"=="判断：
*       java中基本数据类型比较是否相等，使用"=="
*
*   java中什么类型的数据需要使用equals判断
*       java中所有的引用数据类型统一使用equals方法来判断内容是否相等
*/
public class Test03 {
    public static void main(String[] args) {

        // 大部分情况，采用这样的方式创建字符串对象(s1是一个引用)
        String s1 = "hello";

        // String是一个类，就可以采用new的方式创建对象
        String s2 = new String("world");
        String s3 = new String("world");

        // "=="判断的是内存地址，不是内容
        // 使用equals判断引用数据类型的内容是否相等
        System.out.println(s2 == s3); // false
        System.out.println(s2.equals(s3)); // true 说明重写了equals方法

        // 重写了toString()方法
        System.out.println(s3);

    }
}
