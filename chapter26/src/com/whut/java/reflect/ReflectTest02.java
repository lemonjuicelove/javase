package com.whut.java.reflect;

import com.whut.java.bean.User;

/*
* 通过Class的newInstance()方法来实例化对象
* 注意：newInstance()调用的是无参构造，所以必须要保证无参构造是存在的
*/
public class ReflectTest02 {
    public static void main(String[] args) {

        try {
            // 通过反射机制，来获取Class，通过Class来实例化对象
            Class c = User.class;   // c代表User类型

            // newInstance()这个方法会调用User类的无参数构造方法，完成对象的创建
            // 注意：newInstance()调用的是无参构造，所以必须要保证无参构造是存在的
            Object obj =  c.newInstance();
            System.out.println(obj);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
