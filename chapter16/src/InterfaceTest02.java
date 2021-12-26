/*
* 接口的基础语法：
*   1、类和类之间叫做继承，类和接口之间叫做实现。(仍然可以将实现看成继承)
*      继承使用extends关键字完成，实现使用implements关键字完成
*
*   2、当一个非抽象的类实现接口的话，必须将接口中所有的抽象方法全部实现(覆盖、重写)
*/
public class InterfaceTest02 {
    public static void main(String[] args) {

        // 多态机制，父类型的引用指向子类型的对象
        MyTest m1 = new Math();
        // 静态绑定接口中的方法，动态绑定实例对象的方法(面向接口编程)
        int result = m1.sum(10,20);
        System.out.println(result);

    }
}

interface MyTest{
    int sum(int a, int b);
    int sub(int a, int b);
}

class Math implements MyTest{

    // 实现/覆盖/重写接口中的方法，这样编译才不会报错
    @Override
    public int sum(int a, int b) {
        return a + b;
    }
    @Override
    public int sub(int a, int b) {
        return a - b;
    }

}
