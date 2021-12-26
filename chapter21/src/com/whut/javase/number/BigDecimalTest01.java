package com.whut.javase.number;

import java.math.BigDecimal;

/*
* BigDecimal 属于大数据，精度极高。不属于基本数据类型，属于引用数据类型
* 这是SUN提供的一个类，专门用在财务软件当中
*
* 处理财务数据用的是java.math.BigDecimal，不是double
*/
public class BigDecimalTest01 {
    public static void main(String[] args) {

        // 不是普通的100，是精度极高的100
        BigDecimal b1 = new BigDecimal(100);
        BigDecimal b2 = new BigDecimal(200);

        // b1和b2都是引用，要调用方法求和，不能使用+求和
        BigDecimal b3 = b1.add(b2);
        System.out.println(b3);

    }
}
