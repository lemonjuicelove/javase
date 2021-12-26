package com.whut.javase.array;
/*
* 第二题：
*   为某个酒店编写程序：酒店管理系统，模拟订房、退房、打印所有房间状态等功能
*   1、该系统的用户是：酒店前台
*   2、酒店使用一个二维数组来模拟："Room[][] rooms;"
*   3、酒店中的每一个房间应该是一个java对象：Room
*   4、酒店中的每一个房间都应该有：房间编号，房间类型，房间状态
*   5、系统提供的功能：
*       可以预定房间：输入房间编号，订房
*       可以退房：用户输入房间编号，退房
*       可以查看所有房间状态：设计一个方法打印所有房间状态
*/
public class Homework02 {
    public static void main(String[] args) {

        Hotel h1 = new Hotel();
        System.out.println(h1.getRooms()[1][1].getRoomNum());
        System.out.println(h1.getRooms()[2][4].getRoomType());
        System.out.println(h1.getRooms()[0][3].getRoomStyle());

        h1.getRooms()[0][2].dingFang();
        System.out.println(h1.getRooms()[0][2].getRoomStyle());
        h1.getRooms()[0][2].dingFang();
        h1.getRooms()[0][2].tuiFang();
        h1.getRooms()[0][2].tuiFang();

        h1.getRooms()[0][4].dingFang();
        h1.getRooms()[1][3].tuiFang();

        h1.printRoomStyle();

    }
}

class Hotel{

    private Room[][] rooms = {
            {new Room(), new Room(), new Room(), new Room(), new Room()},
            {new Room(), new Room(), new Room(), new Room(), new Room()},
            {new Room(), new Room(), new Room(), new Room(), new Room()}
    };

    public Hotel() { // 无参构造初始化酒店所有方法的属性
        for (int i = 0; i < rooms.length; i++) {
            if (i == 0){
                for (int j = 0; j < rooms[i].length; j++) {
                    rooms[i][j].setRoomNum(1+"0" +(j+1));
                    rooms[i][j].setRoomType("单人间");
                    rooms[i][j].setRoomStyle("空闲");
                }
            }else if (i == 1){
                for (int j = 0; j < rooms[i].length; j++) {
                    rooms[i][j].setRoomNum(2+"0" +(j+1));
                    rooms[i][j].setRoomType("双人间");
                    rooms[i][j].setRoomStyle("有客");
                }
            }else if (i == 2){
                for (int j = 0; j < rooms[i].length; j++) {
                    rooms[i][j].setRoomNum(3+"0" +(j+1));
                    rooms[i][j].setRoomType("三人间");
                    rooms[i][j].setRoomStyle("空闲");
                }
            }
        }
    }
    public Hotel(Room[][] rooms) {
        this.rooms = rooms;
    }

    public Room[][] getRooms() {
        return rooms;
    }
    public void setRooms(Room[][] rooms) {
        this.rooms = rooms;
    }

    public void printRoomStyle(){ // 显示所有房间状态
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.print(rooms[i][j].getRoomStyle() + " ");
            }
            System.out.println();
        }
    }

}

class Room{

    private String roomNum;
    private String roomType;
    private String roomStyle;

    public Room() {
    }
    public Room(String roomNum, String roomType, String roomStyle) {
        this.roomNum = roomNum;
        this.roomType = roomType;
        this.roomStyle = roomStyle;
    }

    public String getRoomNum() {
        return roomNum;
    }
    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    public String getRoomType() {
        return roomType;
    }
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomStyle() {
        return roomStyle;
    }
    public void setRoomStyle(String roomStyle) {
        this.roomStyle = roomStyle;
    }

    public void dingFang(){
        if ("有客".equals(this.roomStyle)){
            System.out.println("该房间已满，请换房");
            return;
        }
        this.roomStyle = "有客";
        System.out.println("订房成功");
    }
    public void tuiFang(){
        if ("空闲".equals(this.roomStyle)){
            System.out.println("空房间无需退房");
            return;
        }
        this.roomStyle = "空闲";
        System.out.println("退房成功");
    }

}
