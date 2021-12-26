/*
* 抽象类：
*   1、抽象类中不一定有抽象方法，但抽象方法必须出现在抽象类当中
*
*   2、结论：一个非抽象的类继承抽象类，必须将抽象类中的抽象方法实现，不然编译报错
*           这里的覆盖，重写，也可以叫做实现(对抽象的实现)
*/
public class AbstractTest02 {
    public static void main(String[] args) {

        // 多态机制
        Animal a = new Bird();
        // 这就是面向抽象编程，Animal是抽象的
        a.move();
    }
}
abstract class Animal{ // 抽象类
    public abstract void move(); // 抽象方法
}
class Bird extends Animal{
    // 将父类继承的抽象方法进行覆盖/重写，也叫做实现
    public void move() {
        System.out.println("Bird is flying");
    }
}