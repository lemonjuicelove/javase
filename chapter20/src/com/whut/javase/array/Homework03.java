package com.whut.javase.array;

import java.sql.SQLOutput;

/*
* 题目：写一个Army类，代表一支军队，这个类中有一个属性Weapon数组w(用来存储军队中所有的武器)
*      该类还提供一个构造方法，在构造方法里传一个int类型的参数来限定该类所能拥有的最大武器数量，
*      并用这一大小来初始化数组w
*
*      该类还提供一个方法addWeapon(Weapon wa),表示把参数wa所代表的武器加入到数组w中
*      还提供attackAll()让w中的所有武器攻击，moveAll()让w中的所有武器移动
*
* 提示：Weapon类中不要定义方法，分别用两个接口实现移动方法和射击方法
*/
public class Homework03 {
    public static void main(String[] args) {

        Army army = new Army(4);
        try {
            army.addWeapon(new ZhanJi());
            army.addWeapon(new TanKe());
            army.addWeapon(new DaoDan());
            army.addWeapon(new SaiChe());
            army.addWeapon(new SaiChe());
        } catch (WeaponException e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }
        army.attackAll();
        army.moveAll();

    }
}

class Army{
    private int weaponNum;
    private Weapon[] w;
    private int index;

    public Army() {
    }
    public Army(int weaponNum) {
        this.weaponNum = weaponNum;
        this.w = new Weapon[weaponNum];
    }

    public int getWeaponNum() {
        return weaponNum;
    }
    public void setWeaponNum(int weaponNum) {
        this.weaponNum = weaponNum;
    }

    public Weapon[] getW() {
        return w;
    }
    public void setW(Weapon[] w) {
        this.w = w;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void addWeapon(Weapon wa) throws WeaponException { // 添加武器方法
        if (index >= weaponNum){
            /*System.out.println("武器已满，无法继续添加");
            return;*/
            throw new WeaponException("武器已满，无法继续添加");
        }
        w[index] = wa;
        index++;
        System.out.println("军队添加武器成功");
    }

    public void attackAll(){ // 全部攻击方法
        for (int i = 0; i < w.length; i++) {
            if (w[i] instanceof ZhanJi || w[i] instanceof TanKe || w[i] instanceof DaoDan){
                w[i].attack();
            }
        }
    }

    public void moveAll(){ // 全部移动方法
        for (int i = 0; i < w.length; i++) {
            if (w[i] instanceof ZhanJi || w[i] instanceof TanKe || w[i] instanceof SaiChe){
                w[i].move();
            }
        }
    }

}
class Weapon{
    public void attack(){
    }
    public void move(){
    }
}
class ZhanJi extends Weapon{
    @Override
    public void attack() {
        System.out.println("歼十开火!!!");
    }

    @Override
    public void move() {
        System.out.println("歼十雄鹰翱翔");
    }
}
class TanKe extends Weapon{
    @Override
    public void attack() {
        System.out.println("开炮开炮!!!");
    }

    @Override
    public void move() {
        System.out.println("坦克正在推进!!!");
    }
}
class DaoDan extends Weapon{
    @Override
    public void attack() {
        System.out.println("东风导弹发射");
    }
}
class SaiChe extends Weapon{
    @Override
    public void move() {
        System.out.println("突击车冲锋!!!");
    }
}

class WeaponException extends Exception{

    public WeaponException() {
    }

    public WeaponException(String message) {
        super(message);
    }
}