package com.whut.javase.exception;

/*
* 编写程序模拟用户注册
* 1、程序开始执行时，提示用户输入账号和密码信息
* 2、输入信息之后，后台java程序模拟用户注册
* 3、用户名长度在[6,14]之间，小于或大于都表示异常
*/

public class HomeworkTest01 {
    public static void main(String[] args) {

        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入用户名：");
        String username = s.next();
        System.out.print("请输入密码：");
        String password = s.next();

        UserService user = new UserService();
        try {
            user.register(username,password);
        } catch (HomeException e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}

class UserService{

    private String username;
    private String password;

    public UserService() {
    }

    public UserService(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void register(String username, String password) throws HomeException {
        // 引用等于null这个判断最好放在所有条件的最前面
        // username == null 不如 null == username (编程经验)
        if (null == username || username.length() < 4 || username.length() > 10){
            throw new HomeException("用户名长度不正确");
            // 抛出异常之后，下面的代码不会执行
        }
        this.username = username;
        this.password = password;
        System.out.println("注册成功，欢迎"+username+"登陆");
    }

}

// 自定义异常
class HomeException extends Exception{

    public HomeException() {
    }
    public HomeException(String message) {
        super(message);
    }

}
