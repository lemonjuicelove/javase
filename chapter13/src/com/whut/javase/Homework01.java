package com.whut.javase;
/*
 * 题目1：编写程序模拟主人喂养宠物的场景
 * 提示1：主人类Master，宠物类Pet，宠物类子类Dog Cat
 * 提示2：主人喂养方法 feed 宠物吃的方法 eat
 * 要求：主人类只提供一个feed方法，可以喂养各种类型的宠物
 */
public class Homework01 {
    public static void main(String[] args) {

        Pet p1 = new Dog();
        Pet p2 = new Cat1();

        Master m1 = new Master("jack");
        Master m2 = new Master("Tom");

        m1.feed(p1);
        m2.feed(p2);

    }
}
class Master{

    private String name;

    public Master() {
    }
    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void feed(Pet pet){
        System.out.println(this.name + "正在喂" + pet.eat());
    }

}
class Pet{
    public String eat(){
        // System.out.println("宠物在进食");
        return "宠物在进食";
    }
}
class Dog extends Pet{
    @Override
    public String eat() {
        // System.out.println("小狗在吃狗粮");
        return "小狗在吃狗粮";
    }
}
class Cat1 extends Pet{
    @Override
    public String eat() {
        // System.out.println("小咪咪在吃鱼");
        return "小咪咪在吃鱼";
    }
}
