package com.whut.java.annotation4;

public @interface MyAnnotation {

    /*
    * 注解中的属性的类型可以是：
    *           byte short int long float double boolean char String Class 枚举类型
    *           以及以上每一种的数组形式
    */
    int value1();
    int[] value2();
    Season value3();
    Season[] value4();
    Class value5();
    Class[] value6();

}
