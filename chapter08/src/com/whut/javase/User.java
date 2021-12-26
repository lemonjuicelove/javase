package com.whut.javase;

public class User {
    int id;
    String username;
    // Address是一种引用数据类型，addr是一个引用，同时也是一个实例变量
    Address addr;
}

class Address{
    String zipcode;
    String city;
    String street;
}