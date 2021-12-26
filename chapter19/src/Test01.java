/*
* 关于Object类中的toString()方法
*   1、源代码是什么样的：
*   public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
*   源代码上toString()方法的默认实现是：
*       类名@对象的内存地址转换成16进制的形式
*
*   2、SUN公司设计toString()方法的目的是什么：
*      toString()方法的设计目的：通过调用这个方法可以将一个"java对象"转换成"字符串形式"
*
*   3、SUN公司开发java语言时，建议所有的子类都去重写toString()方法
*      toString()方法的结果应该是一个简洁的，易阅读的。
*/
public class Test01 {
    public static void main(String[] args) {

        Mytime t1 = new Mytime(2020,10,25);
        String s1 = t1.toString();
        // 重写toSting()方法之前的输出值
        // System.out.println(s1); // Mytime@2d98a335

        // 重写toString()方法之后的输出值
        // 输出引用的时候，会自动调用该引用的toString()方法
        System.out.println(s1);

    }
}

class Mytime{

    int year;
    int month;
    int day;

    public Mytime() {
    }
    public Mytime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // 重写之后的toString()方法
    public String toString(){
        return year + "年" + month +"月" + day + "日";
    }

}