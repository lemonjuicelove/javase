package com.whut.javase;
/*
 * 	编写一个类Book，代表教材：
 * 		1、具有属性：名称，页数
 * 		2、页数不少于200业，否则输出错误信息，并赋予默认值200
 * 		3、为各属性提供赋值和取值方法
 * 		4、具有方法：detail，用来在控制台输出每本教材的名称和页数
 * 		5、编写测试类，为Book对象的属性赋予初始值
 */
public class Homework01 {
    public static void main(String[] args) {

        Book b1 = new Book();
        b1.detail();

        Book b2 = new Book("资本论",100);
        b2.detail();

        Book b3 = new Book("新世界",500);
        b3.detail();
        b3.setPaperNum(100);
        b3.detail();

    }
}

class Book{
    private String name;
    private int paperNum;

    public Book() {
        this("未知",200);
    }
    public Book(String name, int paperNum) {
        if (paperNum >= 200){
            this.name = name;
            this.paperNum = paperNum;
        }else {
            try {
                throw new NumberWrongException("教材页数错误");
            } catch (NumberWrongException e) {
                System.out.println(e.getMessage());
            }
            this.name = name;
            this.paperNum = 200;
        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPaperNum() {
        return paperNum;
    }
    public void setPaperNum(int paperNum) {
        if (paperNum >= 200){
            this.paperNum = paperNum;
        }else {
            try {
                throw new NumberWrongException("教材页数错误");
            } catch (NumberWrongException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void detail(){
        System.out.println("书名：" + this.getName() + "," + "页数：" + this.getPaperNum());
    }
}

class NumberWrongException extends Exception{
    public NumberWrongException() {
    }
    public NumberWrongException(String message) {
        super(message);
    }
}