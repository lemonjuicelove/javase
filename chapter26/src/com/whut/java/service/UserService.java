package com.whut.java.service;

public class UserService {

    public String login(String name, String password){
        if ("jack".equals(name) && "123".equals(password)){
            return "登录成功";
        }
        return "用户名或密码错误";
    }

    public void logout(){
        System.out.println("系统已经安全退出");
    }

}
