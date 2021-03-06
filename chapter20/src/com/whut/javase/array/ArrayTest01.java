package com.whut.javase.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Vector;

/*
* Array
*   1、java语言中的数组是一种引用数据类型。不属于基本数据类型，数组的父类是Object
*
*   2、数组实际上是一个容器，可以同时容纳多个元素(数组是一组数据的集合)
*      数组：字面意思是一组数据
*
*   3、数组当中可以存储基本数据类型的数据，也可以存储引用数据类型的数据
*
*   4、数组因为是引用类型，所以数组对象存储在堆内存当中(数组存储在堆当中)
*
*   5、数组当中如果存储的是java对象，实际上存储的是对象的引用(该引用保存的内存地址指向该对象)
*
*   6、数组一旦创建，在java中规定，长度不可变。
*
*   7、数组的分类：一维数组，二维数组，多维数组...
*
*   8、所有的数组对象都有Length属性，用来获取数组中元素的个数
*
*   9、java中的数组要求数组中存储的元素的类型要统一
*
*   10、数组在内存中存储的时候，数组中的元素的内存地址是连续的。内存地址连续是数组存储元素的特点。
*       数组实际上是一种简单的数据结构
*
*   11、所有的数组都是拿数组中首元素的内存地址作为整个数组对象的内存地址
*
*   12、数组中每一个元素都是有下标的，下标从0开始，以1递增。最后一个元素的下标是：Length-1
*       我们对数组中元素进行存取的时候，都需要通过下标来进行
*
*   13、数组这种数据结构的优点和缺点是什么？
*           优点：查询/检索某个下标上的元素时效率极高。可以说是查询效率最高的一个数据结构
*                为什么检索效率高？
*                   第一：每个元素的内存地址在空间存储上是连续的
*                   第二：每一个元素类型相同，所占用的空间大小相同
*                   第三：知道第一个元素的内存地址，知道每一个元素占用空间的大小，又知道下标，所以通过一个数学表达式就可以计算
*                        出某个下标上元素的内存地址。直接通过内存地址定位元素，所以数组的检索效率最高
*
*               数组中存储100个元素，或者存储100万个元素，在元素检索方面，效率是相同的。因为数组中元素查找不会一个一个找，
*               是通过数学表达式计算出来的。(算出一个内存地址，直接定位的)
*
*           缺点：
*               第一：由于为了保证数组中每个元素的内存地址连续，所以在数组上随机删除或增加元素的时候，效率较低
*                    因为随机增删元素会涉及到后面元素统一向前或者向后位移的操作
*               第二：数组不能存储大数据量，因为很难在内存空间上找到一块特别大的连续的内存空间
*
*   14、怎么声明/定义一个一维数组？
*       语法格式：int[] array1;
*                double[] array2;
*                ......
*   15、怎么初始化一个一维数组？
*       包括两种方式：静态初始化一维数组，动态初始化一维数组
*
*        静态初始化语法格式：
*               int[] array = {1,20,300};
*        动态初始化语法格式：
*               int[] array = new int[5]; //   初始化一个长度为5的int类型数组，每个元素默认值0
*               String[] array = new String[6]； // 初始化一个长度为6的String类型数组，每个元素默认值null
*                                               //  动态初始化的时候会给数组中的元素赋默认值
*/
public class ArrayTest01 {
    public static void main(String[] args) {

        int[] a1 = {100,20,3}; // 静态初始化一个int类型的数组，长度为3


        System.out.println(a1[1]); // 读取数组中的元素，通过下标读取
        a1[2] = 300; // 改数组中的元素，通过"="赋值的方式
        System.out.println(a1[2]);

        // 从前往后遍历一维数组
        for (int i = 0; i < a1.length; i++){
            System.out.println(a1[i]);
        }
        // 从后往前遍历一维数组
        for (int i = a1.length-1; i >= 0; i--){
            System.out.println(a1[i]);
        }


        // foreach遍历数组
        for(int i : a1){
            System.out.println(i);
        }

        // 索引超出了下标的范围
        // System.out.println(a1[3]); ArrayIndexOutOfBoundsException

    }
}
