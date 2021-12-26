import java.util.Objects;

public class Test04 {
    public static void main(String[] args) {

        Student s1 = new Student(111,"WHUT");
        Student s2 = new Student(111,"WUT");
        System.out.println(s1.equals(s2)); // 这是Student类中的equals方法，因为s1和s2的数据类型都是Student
    }
}

class Student{

    int no; // 比较两个基本数据类型，用 ==
    String school; // 比较两个引用数据类型，用equals方法，school相当于一个引用

    public Student() {
    }
    public Student(int no, String school) {
        this.no = no;
        this.school = school;
    }

    // 重写toSring方法
    public String toString(){
        return "学号：" + no + " 学校：" + school;
    }

    // 重写equals方法
    // 要求：学号相等，学校相同时，表示同一个学生
    @Override
    public boolean equals(Object o) { // Student类中的equals方法
        // 调用toString方法进行先比较
        if (this == o) return true;

        // 判断o是否为null或者是否是Student类
        if (o == null || !(o instanceof Student)) return false;

        // 代码执行到这里，说明o就是Student类的一个实例化对象,向下转型
        Student student = (Student)o;

        // 基本数据类型判断相等用==，字符串判断相等，用equals方法
        // school是String类型，String类中的equals方法已经重写了
        return this.no == student.no && this.school.equals(student.school);
    }

}
