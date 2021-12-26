/*
* 抽象类：
*   1、什么是抽象类？
*       类和类之间具有共同特征，将这些共同特征提取出来，形成的就是抽象类
*       类本身是不存在的，所以抽象类无法创建对象
*       对象本身是存在的，所以类可以创建对象
*       抽象类 ---> 类 ---> 实例对象
*
*   2、抽象类属于什么类型？
*        抽象类属于引用数据类型
*
*   3、抽象类怎么定义?
*       语法：[修饰符列表] abstract class 类名{
*                  类体;
*            }
*
*   4、抽象类无法实例化，无法创建对象，所以抽象类天生是用来被子类继承的
*
*   5、final和abstract不能联合使用 (因为final修饰的类无法被继承)
*
*   6、抽象类的子类也可以是抽象类
*
*   7、抽象类虽然无法实例化，但是抽象类有构造方法，这个构造方法是供子类使用的(super关键字的作用)
*
*   8、抽象类关联到一个概念：抽象方法。什么是抽象方法？
*       抽象方法表示没有实现的方法，没有方法体的方法。例如：
*            public abstract void doSome();
*     抽象方法的特点：没有方法体，以分号结尾；前面修饰符列表中有abstract关键字
*
*   9、抽象类中不一定有抽象方法，但抽象方法必须出现在抽象类当中
*/
public class AbstractTest01 {
    public static void main(String[] args) {

        Person p1 = new Chinese();
        p1.doSome();

    }
}
abstract class Person{
    public void doOther(){}   //非抽象方法
    public abstract void doSome();    //抽象方法
}

class Chinese extends Person{
    // 重点：非抽象类继承抽象类，必须将抽象类中的抽象方法进行实现
    public void doSome(){
        System.out.println("doSome!!!");
    }
}
