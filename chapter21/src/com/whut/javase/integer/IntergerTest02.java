package com.whut.javase.integer;

/*
* 1、8种基本数据类型对应的包装类型名是什么？
*       基本数据类型          包装类型
*       ----------------------------
*       byte                java.lang.Byte (父类Number)
*       short               java.lang.Short (父类Number)
*       int                 java.lang.Integer (父类Number)
*       long                java.lang.Long (父类Number)
*       float               java.lang.Float (父类Number)
*       double              java.lang.Double (父类Number)
*       boolean             java.lang.Boolean (父类Object)
*       char                java.lang.Character (父类Object)
*
* 2、8种包装类中有6个都是数字对应的包装类，它们的父类都是Number，研究一下Number中公共的方法
*
*       Number是一个抽象类，无法实例化对象
*       Number类中有这样的方法：
*           public abstract int intValue(); 以int形式返回指定的数值
            public abstract long longValue(); 以long形式返回指定的数值
            public abstract float floatValue(); 以float形式返回指定的数值
            public abstract double doubleValue(); 以double形式返回指定的数值
            public byte byteValue(); 以byte形式返回指定的数值
            public short shortValue(); 以short形式返回指定的数值
            这些方法所有的数字包装类的子类中都有，是负责拆箱的

  3、主要学习Integer包装类，其他照葫芦画瓢
*/
public class IntergerTest02 {
    public static void main(String[] args) {

        // 123这个基本数据类型，通过构造方法的包装达到了：基本数据类型向引用数据类型的转换
        // 基本数据类型 ---> 引用数据类型 (装箱)
        // "="等号右边的式子先执行
        Integer i = new Integer(100);

        // 引用数据类型 ---> 基本数据类型 (拆箱)
        int i1 = i.intValue(); // 返回int类型的数值
        System.out.println(i1);
        float f = i.floatValue(); // 返回float类型的数值
        System.out.println(f);

    }
}
