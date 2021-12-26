package com.whut.javase;
/*
 * 	1、this可以使用在实例方法中，不能使用在静态方法中
 *
 * 	2、this关键字大部分情况下可以省略，什么时候不能省略：
 * 		    在实例方法中，或者构造方法中，为了区分局部变量和实例变量
 * 		    这种情况下：this. 是不能省略的
 */
public class ThisTest02 {
    public static void main(String[] args) {

        Student s1 = new Student(111,"zhangsan");
        System.out.println(s1.getNo());
        System.out.println(s1.getName());

    }
}

class Student{

    private int no;
    private String name;

    public Student() {
    }
    public Student(int no, String name) {
        // this.的作用：区分局部变量和实例变量
        this.no = no;
        this.name = name;
    }

	/*public void setNo(int no) { // 就近原则
		no = no; // 这两个no都是局部变量no，和实例变量no没有关系
	}*/

    public int getNo() {
        return no; // 严格来说，这里有一个this.，只不过可以省略，因为没有参数传进来，默认是实例变量
    }
    public void setNo(int no) {
        // this.no是实例变量，no是局部变量
        this.no = no;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}