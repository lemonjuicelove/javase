/*
* 接口：
*   1、接口也是一种引用数据类型，编译之后也是一个class字节码文件
*
*   2、接口是完全抽象的(抽象类是半抽象的)，或者说接口是特殊的抽象类(无法new对象进行实例化)
*
*   3、接口怎么定义，语法：[修饰符列表] interface 接口名{}
*
*   4、接口支持多继承，一个接口可以继承多个接口(通过implements关键字进行继承操作)
*
*   5、接口中只包含两部分内容：常量、抽象方法。
*
*   6、接口中所有的元素都是public修饰的
*
*   7、接口中的抽象方法定义时，public abstract修饰符可以省略,直接"返回值类型 + 方法名"
*
*   8、接口中的常量定义时，public static final可以省略，直接"数据类型 + 常量名"
*
*   9、接口中的方法都是抽象方法，所以接口中的方法不能有方法体
*/

/*
1）jdk1.8之后接口中使用static关键字修饰的方法有方法体
​ 静态方法需要有方法体
2）jdk1.8之后接口中使用default关键字修饰的方法有方法体
 */
public class InterfaceTest01 {
    public static void main(String[] args) {

        System.out.println(MyMath.NUM);
    }
}
interface MyMath{
    int NUM = 10; // 常量
    int sum(int x, int y); // 抽象方法
}