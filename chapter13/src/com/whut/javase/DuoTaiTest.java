package com.whut.javase;
/*
 * 	多态的基础语法：
 * 		1、先普及两个概念：
 * 		第一个：向上转型
 * 			子 ---> 父	(父类型的引用指向子类型的对象)
 * 		第二个：向下转型
 * 			父 ---> 子	(加强制类型转换符)
 *
 * 		注意:java中允许向上转型，也允许向下转型。无论是向上转型还是向下转型，
 * 			两种类型之间必须有继承关系，没有继承关系会报错
 *
 * 		2、多态指的是：
 * 			父类型引用指向子类型对象。分为编译阶段和运行阶段
 * 			编译阶段：静态绑定父类的方法
 * 			运行阶段：动态绑定子类型的对象的方法
 *
 * 		3、什么时候必须使用向下转型：
 * 			    当需要访问的是子类对象中特有的方法，此时必须进行向下转型
 *
 * 		4、多态的典型代码：父类型的引用指向子类型的对象
 */

public class DuoTaiTest {
    public static void main(String[] args) {

        // 父类型的引用指向子类型的对象
        Animal a = new Cat();
        a.move();
        /*
         * 分析编译阶段：
         * 		对于编译器来说，编译器只知道a的类型是Animal，所以编译器在检查语法的时候，
         * 		会去Animal.class字节码文件中找move()方法，绑定上move()方法，编译通过，
         * 		静态绑定成功。(编译阶段属于静态绑定)
         * 分析运行阶段：
         * 		运行阶段的时候，实际上在堆内存中创建的java对象是Cat对象，所以调用move方法
         * 		的时候，对象是Cat对象。所以运行阶段会动态执行Cat对象的move方法。这个过程
         * 		属于运行阶段绑定。(运行阶段绑定属于动态绑定)
         */

        // 错误：没有为类型 Animal 定义方法 CatchMouse()
        // 分析：在编译阶段，编译器去Animal.class文件中没有找到CatchMouse方法，静态绑定失败，编译报错
        // a.CatchMouse();

        Cat c = (Cat)a; // 向下转型
        c.CatchMouse();

        // 向下转型的风险
        Animal a2 = new Bird();
        /*
         * 分析下面代码是编译报错还是运行报错
         * 编译阶段：编译器只能检测到a2这个引用是Animal类型，而Animal和Cat之间存在继承关系
         *          所以可以向下转型，编译通过
         * 运行阶段：堆内存实际创建的对象是：Bird对象。实际运行时，Bird对象转换成Cat对象，
         *          因为二者之间没有继承关系，所以出现异常
         *  		java.lang.ClassCastException：类型转换异常
         */
        // Cat c2 = (Cat)a2; // 这里的代码运行出现问题
        // c2.CatchMouse();

        // 避免ClassCastException异常的发生
        /*
         * 运算符：instanceof
         * 第一：instanceof可以在运行阶段动态判断引用指向的对象的类型
         * 第二：instanceof的语法：(引用 instanceof 类型)
         * 第三：instanceof运算符的运算结果只能是：true/false
         * 第四：c是一个引用，c变量保存了内存地址，指向堆中的对象
         * 	(c instanceof Cat)为true表示：
         * 		c引用指向的堆内存中的java对象是一个Cat类型
         * 	(c instanceof Cat)为false表示：
         * 		c引用指向的堆内存中的java对象不是一个Cat类型
         *
         * 只要是对类型进行向下转型的时候，一定要使用instanceof运算符进行判断
         * 这样可以很好的避免：ClassCastException
         */
        if (a2 instanceof Cat){
            Cat c2 = (Cat)a2;
            c2.CatchMouse();
        }

    }
}

class Animal{
    public void move(){
        System.out.println("动物在移动");
    }
}

class Bird extends Animal{
    public void move() {
        System.out.println("鸟儿在飞翔");
    }
}

class Cat extends Animal{
    public void move() {
        System.out.println("猫在走猫步");
    }
    public void CatchMouse() {
        System.out.println("猫正在抓老鼠");
    }
}