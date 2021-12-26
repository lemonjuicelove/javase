/*
* final修饰的变量，如果这个变量是一个引用会怎么样？
*   重点：final修饰的变量只能赋一次值（引用也是变量）
*
*   final修饰的引用：该引用只能指向一个对象，并且它只能永远指向该对象，无法在指向其他对象。并且在该方法执行过程中，
*                   该引用指向对象之后，该对象不会被垃圾回收器回收，直到当前方法结束，才会释放内存空间
*
*   虽然final的引用指向对象A之后，不能再重新指向对象B，但是对象A内部的数据可以被修改
*   因为可以有其他的引用指向对象A，然后对A的数据进行修改
*/
public class FinalTest02 {
    public static void main(String[] args) {

        final Person p1 = new Person(30);

        final Person p2 = p1; // 值传递
        System.out.println(p2.getAge());

        // 保存的对象的内存地址不变，但是该对象内部的数据可以修改
        p1.setAge(28);
        System.out.println(p2.getAge());
    }
}

class Person{
    private int age;

    public Person() {
    }
    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
