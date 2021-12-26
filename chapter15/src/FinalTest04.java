/*
* final修饰的实例变量一般添加static修饰
*
* 结论：static final联合修饰的变量称为"常量"，"类名."的方式进行访问
*      常量名建议全部大写，每个单词之间采用下划线连接
*
* 常量：实际上常量和静态变量一样，区别在于：常量的值不能改变
*      常量和静态变量都存储在方法区，并且都是在类加载时初始化
*      常量一般是公共的：public，因为就算是公开的也不能被修改
*/
public class FinalTest04 {
    public static void main(String[] args) {

        Chinese c1 = new Chinese();

        System.out.println(Chinese.name);
        System.out.println(c1.idCard);
        System.out.println(Chinese.COUNTRY);

        Chinese c2 = new Chinese();
        System.out.println(Chinese.COUNTRY);

        // Chinese.COUNTRY = "null"; 常量无法被修改
    }
}

class Chinese{

    static String name; // 静态变量，类名.访问
    String idCard; // 实例变量，引用.访问

    // 该实例变量被final修饰了，说明值不会随着对象的变化而变化
    // 那么可以再添加static修饰，变为常量，存储在方法区，节省内存空间
    public static final String COUNTRY = "China"; // 常量，需要手动赋值，类名.访问
}
