package com.whut.java.reflect;

/*
* 可变长度参数：
*       int... args  这就是可变长度参数
*       语法是：数据类型...       (注意：一定是3个点)
*
*       1、可变长度参数要求的参数个数是：0-n个
*       2、可变长度参数在参数列表中必须在最后一个位置上，而且可变长度参数只能有1个
*       3、可变长度参数可以当做一个数组来看待
*/

/*
可变参数在被使用的时候，他首先会创建一个数组，数组的长度就是调用该方法时传递实参的个数，
然后再把参数值全部放到这个数组当中，再把这个数组作为参数传递到被调用的方法中
 */
public class ArgsTest {
    public static void main(String[] args) {

        m1();
        m1(1);
        m1(1,2);

        m2("abc");
        m2("abc",1,2);

        m3("abc","def","xyz");
        String[] strings = {"我","是","谁"};
        m3(strings);

    }

    public static void m1(int... args){
        System.out.println("m1方法执行了");
    }

    public static void m2(String args1, int... args2){
        System.out.println("m2方法执行了");
    }

    public static void m3(String... args){
        // args有length属性，说明args是一个数组
        /*for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }*/
        for(String s : args){
            System.out.println(s);
        }
    }

}
