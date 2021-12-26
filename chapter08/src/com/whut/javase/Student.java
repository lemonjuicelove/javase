package com.whut.javase;
/*
 * 	变量有一个特点：必须先声明，再赋值，才能访问
 * 	注意：对于成员变量来说，没有手动赋值时，系统默认赋值
 *
 * 	类型			默认值
 * 	----------------------
 * 	byte		    0
 * 	short		    0
 * 	int		    	0
 * 	long	    	0L
 * 	float	    	0.0F
 * 	double		    0.0
 * 	boolean		    false
 * 	char		    \u0000
 * 	引用数据类型	    null
 *
 * 	null是一个java关键字，表示空。是引用类型的默认值
 *
 * 	分析：对于成员变量来说，有几个对象就有几份
 *
 *  Student既是一个类名，同时又是一个"类型名"，属于引用数据类型
 */
public class Student {

    // 属性，在java程序中以成员变量的形式存在
    // 这种成员变量又被称为实例变量
    int xueHao;
    String name;
    int age;
    boolean sex;
    String zhuZhi;

}
