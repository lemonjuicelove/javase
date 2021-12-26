package com.whut.javase.danlink;

public class Link {

    // 头节点
    Node header;
    // 节点个数
    private int size;
    // 节点索引下标
    private int index;

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    // 向链表中添加元素的方法(末尾节点添加新节点)
    public void add(Object data){
        // 创建一个新的节点对象，让之前单链表的末尾节点next指向新对象节点
        // 这个增加的元素可能是第一个，可能是第二个，也可能是最后一个
        if (header == null){
            // 说明还没有节点，该元素是头节点
            // 这个时候即是头节点，又是末尾节点，该节点的next为空
            header = new Node(data);
        }else{
            // 说明存在节点，那就找出末尾节点
            // 末尾节点的next属性指向增加的新节点
            // 如何找出末尾节点,定义一个查找方法进行寻找：末尾节点的next属性为null
            Node lastNode = findLast(header);
            lastNode.setNext(new Node(data));
        }
        size++;
    }

    // 删除链表中某个元素的方法
    public void remove(Object obj) throws NotFoundException {
        // 先判断要删除的元素是否在这个链表当中
        if (findNodePos(header, obj) != -1){
            // 先找到要删除的节点
            Node removeNode = findNodeModify(header, obj);
            // 将该节点中保存的下一个节点的内存地址赋给一个中间变量
            Node temp = removeNode.getNext();
            // 找到保存该节点的上一个节点
            Node upNode = findUpNode(header, removeNode);
            // 修改上一个节点中保存的内存地址
            upNode.setNext(temp);
            size--;
        }else {
            throw new NotFoundException("链表中不存在要删除的数据");
        }
    }

    // 修改链表中某个数据的方法
    public void modify(Object obj1, Object obj2) throws NotFoundException {
        // 首先找到这个数据所在的链表的位置
        Node currentNode = findNodeModify(header, obj1);
        currentNode.setData(obj2);
    }

    // 查找存储指定数据的元素在链表中的位置
    public void find(Object obj){
        index = 0; // 要确保每一次查找元素时，下标都是从0开始检索的
        int flag = findNodePos(header, obj);
        System.out.println(flag == -1 ? "要查找的数据不存在链表当中" : ("该元素在链表中的下标位置是：" + flag));
        // index = 0; // 放在这里不行，因为在调用find方法之前，可能已经调用了findNodePos方法，index并不是从0开始的了
    }

    /**
     * 专门查找末尾节点的方法
     */
    private Node findLast(Node node) {
        // 通过判断节点的next属性是否为空，来确定是否为末尾节点
        if (node.getNext() == null){
            // 找到了末尾节点，返回这个末尾节点
            return node;
        }
        // 程序执行到这里，next属性不为null，node不是末尾节点
        // 递归继续判断下一个节点，node.getNext()相当于是下一个节点
        return findLast(node.getNext());
    }

    /**
     * 查找到存储对应数据的节点在链表中的下标位置
     * 返回值类型是该节点的在链表中的下标值
     */
    private int findNodePos(Node node, Object obj){
        // 通过判断节点保存的数据是否和要删除的数据相同，来确定保存这个数据的节点的位置
        if (node.getData().equals(obj)){
            return index;
        }
        // 先判断节点中保存的数据，再判断这个节点是否为空，为空表示已经将最后一个节点都判断完了
        if (node.getNext() == null){
            return -1;
        }
        index++;
        return findNodePos(node.getNext(), obj);
    }

    /**
     * 专门查找到存储对应数据的节点
     * 返回值类型是存储相应数据的节点
     */
    private Node findNodeModify(Node node, Object obj) throws NotFoundException {
        if (node.getData().equals(obj)){
            return node;
        }
        // 判断该节点是不是最后一个节点
        if (node.getNext() == null){
            throw new NotFoundException("要修改的数据不存在链表当中");
        }
        return findNodeModify(node.getNext(), obj);
    }

    /**
     *  查找上一个节点的位置
     */
    private Node findUpNode(Node node1, Node node2){
        // 通过判断上一个节点的next属性中保存的内存地址是否与该节点的内存地址相同
        // 来查找该节点的上一个节点
        if (node1.getNext() == node2){
            return node1;
        }
        return findUpNode(node1.getNext(), node2);
    }

}

// 自定义一个异常类
class NotFoundException extends Exception{

    public NotFoundException() {
    }

    public NotFoundException(String message) {
        super(message);
    }

}