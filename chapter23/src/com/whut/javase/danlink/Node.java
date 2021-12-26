package com.whut.javase.danlink;

/*
* 单链表中的节点，节点是单向链表中基本的单元
*
* 每一个节点Node都有两个属性：
*       一个属性：是存储的数据
*       另一个属性：是下一个节点的内存地址
*/
public class Node {

    // 存储的数据
    private Object data;
    // 下一个节点的内存地址(next是引用，保存着下一个节点的内存地址)
    private Node next;

    public Node() {
    }
    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }

}
