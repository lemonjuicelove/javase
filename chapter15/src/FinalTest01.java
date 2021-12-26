/*
* final关键字
*   1、final修饰的变量？
*       final修饰的局部变量，一旦赋值后就不能重新赋值
*       final修饰的实例变量需要手动进行赋值
*
*   2、final修饰的方法？
*       final修饰的方法无法被覆盖。
*
*   3、final修饰的类？
*       final修饰的类无法继承
*
*   4、final修饰的表示不能变的，不能改的
*
* 重点：final修饰的变量只能赋一次值
*/
public class FinalTest01 {
    public static void main(String[] args) {

        final int i = 10;
        // i = 20; 无法重新赋值

    }
}


