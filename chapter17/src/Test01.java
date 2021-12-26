/*
* 关于java语言中的package和import机制：
*
*   1、为什么要使用package？
*         package是java中包机制。包机制的作用是为了方便程序的管理。不同功能的类分别存放在不同的包下
*
*   2、package怎么用？
*         package是一个关键字，后面加包名。根目录下有其他包时，会导入包名
*        注意：package语句只允许出现在java源代码的第一行
*
*   3、关于import的使用
*      import什么时候使用：A类中使用B类。A类和B类都在同一个包下，不需要import，A类和B类不在同一个包下，需要使用import。
*      java.lang.*;这个包下的类不需要import导入，自动导入
*
*    import怎么用：import语句只能出现在package语句之下，class声明语句之上
*                 import语句还可以采用*的方式，表示导入所有类
*/
public class Test01 {
    public static void main(String[] args) {
        System.out.println();
    }
}


