package com.whut.javase;

public class OverrideTest02 {
    public static void main(String[] args) {

        People p1 = new Chinese("杨杨杨");
        People p2 = new American("jack");
        p1.speak();
        p2.speak();

    }
}

class People{

    private String name;

    public People(){
    }
    public People(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void speak(){
        System.out.println(name + "........");
    }
}

class Chinese extends People{

    public Chinese() {
    }
    public Chinese(String name) {
        super(name);
    }
    public void speak(){
        System.out.println(this.getName() + "正在说汉语");
    }

}

class American extends People{

    public American() {
    }
    public American(String name) {
        // this.setName(name); // 这个方式不好，以后在说：只有子，没有父
        super(name); // 调用父类的有参构造方法：要有子，先有父
    }
    public void speak(){
        System.out.println(this.getName() + " speaks English");
    }

}