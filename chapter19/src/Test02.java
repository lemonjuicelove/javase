/*
* 关于Object类中的equals方法
*
*   1、equals方法的源代码
*   public boolean equals(Object obj) {
        return (this == obj);
    }
*   以上这个方法是Object类的默认实现
*
*   2、SUN公司设计equals方法的目的是什么？
*      equals方法是判断两个对象是否相等
*
*   3、我们需要研究一下Object类中默认的equals方法是否能够对所有类都通用
*
*       在Object类中的equals方法中，默认采用的是"=="判断两个java对象是否相等，
*       而"=="判断的是两个java对象的内存地址，我们应该判断两个java对象的内容是否相等，
*       所以Object类中的equals方法不能够进行通用，需要子类重写equals
*
*   4、判断两个java对象是否相等，不能使用"=="，因为"=="比较的是两个对象的内存地址
*/

import java.util.Objects;

public class Test02 {
    public static void main(String[] args) {

        Mytime2 t1 = new Mytime2(2020,10,25);
        Mytime2 t2 = new Mytime2(2020,10,25);
        // 重写Object equals方法之前(比较的是内存地址)
        // 重写Object equals方法之后(比较的是内容)
        boolean flag = t1.equals(t2);
        System.out.println(flag);
        Mytime2 t3 = new Mytime2(2020,10,30);
        System.out.println(t1.equals(t3));

    }
}

class Mytime2{

    int year;
    int month;
    int day;

    public Mytime2() {
    }
    public Mytime2(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

   // 改良equals方法
   /*public boolean equals(Object o) {
       if (o == null || !(o instanceof Mytime2)){
           return false;
       }
       // 输入引用会自动调用toString方法进行比较
       // 无论是重写前的还是重写后的都可以，因为下面还有代码进一步判断
       if (this == o){
           return true;
       }
       Mytime2 mt = (Mytime2)o;
       return this.year == mt.year && this.month == mt.month && this.day == mt.day;
   }*/

   /* @Override
    // IDEA自动生成的equals方法
    public boolean equals(Object o) {
        if (this == o) return true;
        // this.getClass() != o.getClass()，下面的代码省略了this
        // 两个类的class文件不同，说明不是同一个类
        if (o == null || getClass() != o.getClass()) return false;
        Mytime2 mytime2 = (Mytime2) o;
        return year == mytime2.year &&
                month == mytime2.month &&
                day == mytime2.day;
    }*/

}
