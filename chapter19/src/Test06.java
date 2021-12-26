/*
* hashCode方法：
*   在Object中的hashCode方法是什么样的？
*       public native int hashCode();
*   这个方法不是抽象方法，带有native关键字，底层调用C++程序
*
*   hashCode()方法返回的是哈希码：
*       实际上就是一个java对象的内存地址，经过哈希算法得出的一个值
*       所以hashCode()方法的执行结果可以等同看做一个java对象的内存地址
*/
public class Test06 {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        // 对象内存地址经过哈希算法转换成的一个数字。等同看成内存地址
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
    }
}
