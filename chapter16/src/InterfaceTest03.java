/*
* 接口和接口之间支持多继承，一个类可以同时实现多个接口
*
* java中类和类只支持单继承
* java中的接口弥补了单继承带来的缺陷
*/
public class InterfaceTest03 {
    public static void main(String[] args) {

        // 多态机制
        A a = new D();
        // 接口A中只有m1方法，不能静态绑定其他接口中的方法,需要向下转型才可以调用其他接口的方法
        a.m1();
        // 向下转型要使用instanceof运算符进行判断
        if (a instanceof D){
            D d = (D) a;
            d.m2();
            d.m3();
        }

        System.out.println(D.A_NUM);
        System.out.println(D.B_NUM);
        System.out.println(D.C_NUM);

    }
}

interface A{
    int A_NUM = 1;
    void m1();
}
interface B{
    int B_NUM = 2;
    void m2();
}
interface C{
    int C_NUM = 3;
    void m3();
}

class D implements A,B,C{

    // 要将所继承的接口中的抽象方法全部实现
    @Override
    public void m1() {
        System.out.println("m1...");
    }

    @Override
    public void m2() {
        System.out.println("m2...");
    }

    @Override
    public void m3() {
        System.out.println("m3...");
    }

}