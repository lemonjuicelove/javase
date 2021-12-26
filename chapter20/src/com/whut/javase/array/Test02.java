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
public class Test02 {
    public static void main(String[] args) {
        
        Room1[][] room1 = new Room1[3][5];
        for (int i = 0; i < room1.length; i++) {
            for (int j = 0; j < room1[i].length; j++) {
                room1[i][j] = new Room1();
            }
        }

        Hotel1 hotel1 = new Hotel1(room1);
        hotel1.printRoom();
        hotel1.inRoom(202);
        hotel1.printRoom();

    }
}
// 酒店类
class Hotel1{

    // 酒店里的房间属性
    Room1[][] rooms = null;

    public Hotel1() {
    }

    public Hotel1(Room1[][] rooms) {
        this.rooms = rooms;
        for(int i = 0; i < rooms.length; i++){ // 二维数组中的一维数组的循环
            for (int j = 0; j < rooms[i].length; j++) { // 一维数组中的元素的循环
                if (i == 0){ // 表示第一层
                    rooms[i][j].setRoomNum((10 + "") + (j+1));
                    rooms[i][j].setRoomType("单人间");
                }
                if (i == 1){ // 表示第二层
                    rooms[i][j].setRoomNum((20 + "") + (j+1));
                    rooms[i][j].setRoomType("双人间");
                }
                if (i == 2){ // 表示第三层
                    rooms[i][j].setRoomNum((30 + "") + (j+1));
                    rooms[i][j].setRoomType("豪华间");
                }
                rooms[i][j].setRoomState("空闲");
            }
        }
    }

    public void printRoom(){
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.print(rooms[i][j] + "，");
            }
            System.out.println();
        }
    }

    public void inRoom(int roomNum){
        int i = roomNum / 100;
        int j = roomNum - 100*i;
        if ("有客".equals(rooms[i-1][j-1].getRoomState())){
            System.out.println("该房间已经被预定了");
            return;
        }
        rooms[i-1][j-1].setRoomState("有客");
        System.out.println("预定成功");
    }
    public void outRoom(int roomNum){
        int i = roomNum / 100;
        int j = roomNum - 100*i;
        if ("空闲".equals(rooms[i-1][j-1].getRoomState())){
            System.out.println("该房间已经是空闲的了");
            return;
        }
        rooms[i-1][j-1].setRoomState("空闲");
        System.out.println("退房成功");
    }

}
// 房间类
class Room1{

    private String roomNum;
    private String roomType;
    private String roomState;

    public Room1() {
    }
    public Room1(String roomNum, String roomType, String roomState) {
        this.roomNum = roomNum;
        this.roomType = roomType;
        this.roomState = roomState;
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

    public String getRoomState() {
        return roomState;
    }
    public void setRoomState(String roomState) {
        this.roomState = roomState;
    }

    @Override
    public String toString() {
        return "{" +
                "roomNum='" + roomNum + '\'' +
                ", roomType='" + roomType + '\'' +
                ", roomState='" + roomState + '\'' +
                '}';
    }

}