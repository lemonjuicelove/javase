package com.whut.javase.danlink;

public class LinkTest01 {
    public static void main(String[] args) {

        Link myLink = new Link();
        System.out.println(myLink.getSize());
        myLink.add(100);
        myLink.add(200);
        myLink.add(300);
        myLink.add(400);
        System.out.println(myLink.getSize());

        // 查找元素的下标位置
        myLink.find(100);
        myLink.find(2000);

        System.out.println("----------");

        // 修改链表中某个节点存储的数据
        myLink.find(200);
        try {
            myLink.modify(200, 1000);
            myLink.modify(1, 2);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("---------");

        // 移除存储某个数据的节点
        System.out.println(myLink.getSize());
        try {
            myLink.remove(300);
        } catch (NotFoundException e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }
        myLink.find(300);
        System.out.println(myLink.getSize());

        System.out.println("--------------");

        try {
            myLink.remove(10);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(myLink.getSize());

        System.out.println("------------");

        myLink.find(100);

    }
}
