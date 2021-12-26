package com.whut.javase;
/*
 * 	关于垃圾回收器：GC
 * 		在java语言中，垃圾回收器主要针对的是堆内存，当一个java对象没有任何引用指向该对象时，GC会考虑将该垃圾数据释放回收掉
 *
 * 	出现空指针异常的前提条件：
 * 		空引用访问实例相关(对象相关)的数据时，都会出现空指针异常
 */
public class NullPointTest {
    public static void main(String[] args) {

        KeHu k = new KeHu();
        k.id = 9521;
        System.out.println("客户的id是：" + k.id);

        k = null; // k为空引用
        // 编译没错，运行时会出现异常：NullPointerException
        System.out.println(k.id);
        
    }
}
class KeHu {
    int id;
}