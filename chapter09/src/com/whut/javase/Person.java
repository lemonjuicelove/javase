package com.whut.javase;

// 没有封装的Person类

/*
public class Person {
	int age; // age属性是暴露的，在外部程序中可以随便访问，导致了数据不安全
}
*/

// 封装的优点：1、数据安全   2、调用方便
public class Person {

    // private 表示私有化，被这个关键字修饰之后，该数据只能在本类中访问，出了这个类，age属性就无法访问了
    private int age;

    // 封装的第二步：对外提供公开的set方法和get方法作为操作入口，并且都不带static(static是静态方法)
    /*
     * 	注意：java开发规范中有要求，set方法和get方法要满足一定格式
     * 			get方法的格式要求：
     * 				public 返回值类型  get+属性名首字母大写(无参){
     * 					return xxx;
     * 				}
     * 			set方法的格式要求：
     * 				public void set+属性名首字母大写(有一个参数){
     * 					xxx = 参数;
     * 				}
     */
    public int getAge() { // 实例方法  引用.访问
        return age;
    }
    public void setAge(int age) { // set方法只用来改，所以没有返回值，读还是用get方法
        // 在这个位置上设置条件，进行判断
        if(age < 0 || age > 150) {
            System.out.println("无效的年龄，请重新赋值");
            return;
        }
        this.age = age;
    }

}
