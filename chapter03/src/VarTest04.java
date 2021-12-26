/*
 * 变量的作用域
 * 		1、什么是作用域：变量的有效范围
 * 		2、作用域：出了大括号就失效了
 * 		3、就近原则：谁近访问谁
 */

public class VarTest04 {

    int i = 10; // 实例变量，需要引用.访问

    public static void main(String[] args) {
        int i = 100;
        System.out.println(i); // 在静态方法里面不能使用this.，所以访问不到实例变量i
    }

    public void doSome(){
        System.out.println(i); // 在实例方法中能够通过this.去访问实例变量
    }

}
