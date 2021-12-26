package com.whut.javase.array;
/*
* 数组的元素查找
*   数组元素查找有两种方式：
*       第一种：一个一个挨着找，直到找到为止
*       第二种：二分法查找
*/
public class ArraySearch01 {
    public static void main(String[] args) {

        int[] array = {1, 2, 10, 52, 4};
        int index = arraySearch(array, 10);
        System.out.println(index == -1 ? "数组中不存在该元素" : "数组中该元素的下标为:" + index);
    }

    public static int arraySearch(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element){
                return i;
            }
        }
        return -1;
    }
}
