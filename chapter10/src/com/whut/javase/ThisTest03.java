package com.whut.javase;
/*
 * 	1、this除了可以使用在实例方法中，还可以用在构造方法中
 *
 * 	2、新语法：通过当前的构造方法去调用另一个本类的构造方法，可以使用以下语法格式：
 * 	        this(实际参数列表);
 * 		        	通过一个构造方法1去调用构造方法2，可以做到代码复用。通过实参的不同来判断调用的是哪个构造方法
 * 			        但需要注意的是：构造方法1和构造方法2都是在同一个类当中。
 *
 * 	3、this()这个语法的作用：代码复用
 *
 * 	4、对于this()的调用只能出现在构造方法的第一行，并且只能写一次
 */
public class ThisTest03 {
    public static void main(String[] args) {

        Date d1 = new Date();
        System.out.println(d1);
        Date d2 = new Date(2020,12,3);
        System.out.println(d2);

    }
}

/*
需求：
	1、定义一个日期类，可以表示年月日信息
	2、如果调用无参数构造方法，默认创建的日期为：1970年1月1日
*/

class Date{
    int year;
    int month;
    int day;

    public Date() {
        // this(1970,1,1);
        this(2020,2);
    }
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Date(int year, int month) {
        this.year = year;
        this.month = month;
        day = 18;
    }

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

}