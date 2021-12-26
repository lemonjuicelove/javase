package com.whut.javase;
/*
 * 1、在java中，boolean类型只有两个值：true和false
 * 	  和C或C++不同，C语言中1和0也可以表示布尔类型
 * 2、boolean类型在实际开发中使用在逻辑判断当中
 * 	  通常放在条件的位置上充当条件
 */
public class BooleanTest01 {
    public static void main(String[] args) {

        boolean sex = false;
        if(sex) {
            System.out.println("man");
        }else {
            System.out.println("woman");
        }

    }
}
