package com.whut.javase.array;
/*
* 模拟一个系统，这个系统必须正确输入用户名和密码才能使用
*/
public class ArrayTest05 {

    // 用户名和密码输入到String[] args数组当中
    public static void main(String[] args) {
        // 判断是否输入了用户名和密码
        if (args.length != 2){
            System.out.println("请正确输入用户名和密码，例如：jack 456");
            return;
        }

        // 判断用户名和密码是否正确
        String username = args[0];
        String password = args[1];
        // 编写成下面的代码可以避免空指针异常
        // 即使username和password都是null，也不会出现空指针异常(编程经验)
        if ("muyan".equals(username) && "1218".equals(password)){
            System.out.println("登录成功，欢迎" + username + "回来");
        }else {
            System.out.println("用户名不存在或密码错误");
        }

    }
}
