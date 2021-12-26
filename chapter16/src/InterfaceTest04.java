/*
* 继承和实现都存在的情况：extends关键字在前，implements关键字在后
*/
public class InterfaceTest04 {
    public static void main(String[] args) {

        // 多态机制
        Flyable f = new Fish();
        f.fly();
        if (f instanceof Fish){
            Fish f2 = (Fish)f;
            f2.move();
        }

        DongWu w = new Fish();
        w.move();
        if(w instanceof Fish){
            Fish w2 = (Fish) w;
            w2.fly();
        }

    }
}
// 抽象类
abstract class DongWu{
    public abstract void move();
}
// 接口
interface Flyable{
    void fly();
}

class Fish extends DongWu implements Flyable{

    // 实现抽象类中的抽象方法
    @Override
    public void move() {
        System.out.println("鲤鱼跃龙门");
    }

    // 实现接口中的抽象方法
    @Override
    public void fly() {
        System.out.println("我是一条六眼飞鱼！！！");
    }

}