package com.whut.javase;
/*
 * 	switch语句：
 * 		1、switch语句也是选择语句，也可以叫做分支语句
 * 		2、switch语句的语法格式
 * 			switch(值){
 * 			case 值1:
 * 				java语句;
 * 				java语句;...
 * 				break;
 * 			case 值2:
 * 				java语句;
 * 				java语句;...
 * 				break;
 *  		case 值3:
 * 				java语句;
 * 				java语句;...
 * 				break;
 * 			default:
 * 				java语句;
 * 			}
 *
 * 			以上是一个完整的switch语句：其中 break;语句和default分支不是必须的
 *
 * 			switch语句支持的值有哪些：支持int类型以及String类型
 * 			switch语句本质上是只支持int和String类型，但是byte，short，char也可以用在switch语句当中，因为可以进行自动类型转换
 *
 * 			switch语句中的值与值1、值2进行比较的时候会使用==进行比较
 *
 * 		3、switch语句的执行原理
 * 			拿值与值1进行比较，如果相同，则执行该分支中的java语句，然后遇到
 * 			break;语句，整个switch语句就结束了
 *
 * 			如果值与值1不相等，会继续拿值与值2进行比较，如果相同，则执行该分支
 * 			中的java语句，然后遇到break;语句，整个switch语句结束
 *
 * 			注意：如果分支执行了，但是分支最后没有break;语句，此时会发生case穿透现象。
 *          case穿透现象：没有break;语句时，会不进行case判断的往下执行，直到遇到break;语句为止
 *
 * 			所有的case都没有匹配成功，那么最后default分支会执行
 */

/*
switch(表达式)中表达式的返回值类型必须是以下几种类型：
    byte、short、char、int、枚举、String

原因：case子句中的值必须是常量。String类型是常量（存储再常量池当中），枚举类型中的值也是常量
     case子句中的值是一般是int类型的常量,小转大可以自动转换，大转小不行。
 */

public class SwitchTest01 {
    public static void main(String[] args) {

    }
}
