/*
* final修饰的实例变量
*
* 实例变量如果没有手动赋值的话，系统会赋默认值
* 实例变量在什么时候赋值(初始化) ：构造方法执行的过程中赋值(new的时候赋值)
*
* 结论：final修饰的实例变量，系统不给赋默认值，要求程序员必须手动赋值
*      这个手动赋值，在变量后面赋值可以，在构造方法中赋值也可以
*/
public class FinalTest03 {
    public static void main(String[] args) {

        User u1 = new User();
        System.out.println(u1.a);
        User u2 = new User(20);
        System.out.println(u2.a);

    }
}

class User{
    // final int age; 报错，因为没有直接在后面赋值，也没有在构造方法中赋值
    final int i = 10; // 不报错，因为手动赋值了

    // 必须要确保这个变量能赋值一次，构造方法中不赋值的话，系统也不会赋默认值，编译报错
    // 无参构造和有参构造都要有赋值操作，这样才能保证一定进行了赋值操作
    final int a;
    public User() {
        this.a = 10; // 赶在系统赋默认值之前赋值就行
    }
    public User(int a) {
        this.a = a;
    }

}
