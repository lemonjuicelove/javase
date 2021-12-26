/*
 * 1、变量的分类：变量根据出现的位置进行划分
 * 			在方法体当中声明的变量：局部变量
 * 			在方法体之外，类体内声明的变量：成员变量(成员变量又可分为实例变量和静态变量)
 *
 * 2、局部变量只在方法体当中有效，方法体执行结束后该变量的内存就释放了
 */
public class VarTest03 {

    int age = 18; // 实例变量
    public static int i;
    static Integer c = new Integer(21);
    public String s;
    final static Integer a = new Integer(31);
    final static int b = 20;
    final static String d = "hello";

    public static void main(String[] args) {
        int i = 100; // 局部变量
        VarTest03 v = new VarTest03();
        System.out.println(v.a);
    }

}
