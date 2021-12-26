package com.whut.javase;
/*
 * 	回顾一下方法重载：
 * 		什么时候考虑使用方法重载overload？
 * 		当在一个类当中，如果功能相似的话，建议将名字定义成一样的。
 *
 * 		满足什么条件之后能够构成方法重载？
 * 		    1：在同一个类当中
 * 		    2：方法名相同
 * 		    3：参数列表不同(个数、顺序、类型)
 *
 * 	什么时刻考虑使用方法覆盖？
 * 		子类继承父类之后，当继承过来的方法无法满足当前子类的业务需求，子类有权利对这个方法
 * 		进行重新编写，有必要进行方法覆盖
 *
 * 	结论：当子类对父类继承过来的方法进行方法覆盖之后，子类对象调用该方法时，一定执行覆盖之后的方法
 *
 * 	当代码怎么编写时，在代码级别上构成了方法覆盖？
 * 		1：两个类必须要有继承关系
 * 		2：重写之后的方法和之前的方法具有：
 * 				相同的返回值类型
 * 				相同的方法名
 * 				相同的形式参数列表
 * 		3：访问权限不能更小，可以更大	public>protected>默认>private
 * 		4：重写之后的方法不能比之前的方法抛出更多的异常，可以更少
 *
 * 	注意事项：
 * 		注意1：方法覆盖只是针对于方法，和属性无关
 * 		注意2：私有方法无法覆盖	(因为private修饰的方法只能在本类中访问，出了这个范围之后就失效了)
 * 		注意3：构造方法不能被继承，所以构造方法也不能被覆盖
 * 		注意4：方法覆盖只是针对于实例方法，静态方法覆盖没有意义
 * 			  解释：实例方法调用需要对象，静态方法的执行不需要对象(类名.的方式调用)
 */
public class OverrideTest01 {
    public static void main(String[] args) {

        Animal a = new Animal();
        Animal b = new Bird();
        Animal c = new Cat();
        a.move();
        b.move();
        c.move();

    }
}

class Animal{
    public void move(){
        System.out.println("动物在移动");
    }
}

class Bird extends Animal{
    // 对move方法进行方法覆盖，override
    public void move() {
        System.out.println("鸟儿在飞翔");
    }
}

class Cat extends Animal{
    public void move() {
        System.out.println("猫在走猫步");
    }
}