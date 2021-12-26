package com.whut.javase.array;
/*
* 关于一维数组的扩容
*
* 在java开发中，数组长度一旦确定就不可变，数组满了，就需要扩容
* java中对数组的扩容是：先创建一个大容量的数组，然后将小容量数组中的数据拷贝到大数组当中
*
* 结论：数组扩容效率较低，因为涉及到拷贝的问题
* 优化方法：可以在创建数组对象的时候预估计，这样可以减少数组的扩容次数，提高效率
*/
public class  ArrayTest07 {
    public static void main(String[] args) {

        // java中的数组是怎么进行拷贝的
        // System.arraycopy(5个参数);

        int[] array1 = {1,2,3,4};
        int[] array2 = new int[10];
        // 参数1：源   参数2：拷贝源起点    参数3：拷贝目标    参数4：拷贝目标起点    参数5：拷贝长度
        System.arraycopy(array1,0, array2,0, array1.length);
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        String[] array3 = {"nihao", "muyan", "hello", "world"};
        String[] array4 = new String[10];
        System.arraycopy(array3,0, array4,2, array3.length);
        for (int i = 0; i < array4.length; i++) {
            System.out.println(array4[i]);
        }

    }
}
