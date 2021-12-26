package com.whut.java.reflect;

import com.whut.java.service.UserService;

import java.lang.reflect.Method;

/*
* 重点：通过反射机制调用一个对象的方法
*
* 反射机制让代码具有很强的通用性，可变化的内容都写到配置文件当中了，将来修改配置文件之后，
* 创建的对象不一样了，调用的方法不同了，但是java代码不需要做任何改动，这就是反射机制的魅力
*/
public class ReflectTest10 {
    public static void main(String[] args) throws Exception{

        // 使用反射机制来调用对象的方法
        Class userService = Class.forName("com.whut.java.service.UserService");
        Object obj = userService.newInstance(); // 实例化对象

        // 获取login方法
        // 通过方法名和形参的数据类型来获取所需要的方法，避免了方法重载获取其他的方法
        Method loginMethod = userService.getDeclaredMethod("login",String.class,String.class);

        /*
        * 调用方法的四要素：
        * loginMethod：要调用的方法
        * obj：对象
        * "jack","123"：实参
        * retValue：返回值
        */
        // 因为编译阶段不运行，所以不知道是什么类型，为了避免报错，返回值统一使用Object类型
        // 返回值类型  返回值  方法  对象  实参
        Object retValue = loginMethod.invoke(obj,"jack","123");
        System.out.println(retValue);

    }
}
