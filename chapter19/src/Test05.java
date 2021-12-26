/*
* 关于Object类中的finalize()方法
*   1、在Object类中的源代码：
*      protected void finalize() throws Throwable{}
*      GC:负责调用finalize()方法
*
*   2、finalize()方法只有一个方法体，里面没有代码，而且这个方法是protected修饰的
*
*   3、这个方法不需要手动调用，JVM的垃圾回收器负责调用这个方法。
*      finalize()只需要重写，重写完将来自动会有程序调用
*
*   4、finalize()方法的执行时机：
*       当一个java对象即将被垃圾回收器回收的时候，垃圾回收器负责调用finalize()方法
*
*   5、finalize()方法实际上是SUN公司为程序员准备的一个时机：垃圾销毁时机
*      如果希望在对象销毁时机执行一段代码，就写在finalize()方法当中
*
*   6、java中的垃圾回收器不是轻易启动的，垃圾太少或者时间没到，都可能不会启动
*/
public class Test05 {
    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++){
            Person p1 = new Person();
            p1 = null;
            System.gc(); // 建议启动垃圾回收器(只是建议，可能启动，也可能不启动)
        }
    }
}

class Person{
    @Override
    protected void finalize() throws Throwable {
        super.finalize(); // 模拟要想先销毁儿子，必须要销毁父亲
        System.out.println(this + "即将销毁");
    }
}
