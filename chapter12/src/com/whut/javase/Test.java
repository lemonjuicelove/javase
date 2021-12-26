package com.whut.javase;

public class Test {
    public static void main(String[] args) {

        Fu f = new Zi();
        f.getShow();

    }
}

class Fu{

    public Fu() {
    }

    private void show(){
        System.out.println("Fu show");
    }

    public void getShow(){
        show();
    }

}

class Zi extends Fu{

    public Zi() {
    }

    public void show(){
        System.out.println("Zi show");
    }

}