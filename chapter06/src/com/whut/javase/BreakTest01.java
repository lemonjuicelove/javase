package com.whut.javase;
/*
 * 	break;语句：
 * 		1、break语句是一个单词成为一个完整的java语句。
 * 		continue语句也是如此
 *
 * 		2、break;语句用在两个位置，其他位置不行
 * 			第一个位置：switch语句当中，用来终止switch语句的执行。
 * 				用在switch语句当中，防止case穿透现象，用来终止switch
 *
 * 			第二个位置：break;语句用在循环语句当中，用来终止循环的执行
 * 				用在for当中、用在while当中、用在do...while..当中
 *
 * 		3、break;语句的执行并不会让整个方法结束，break;语句主要用来终止离他最近的那个循环语句
 *         return;语句会让整个方法结束
 *
 * 		4、怎么用break;语句终止指定的循环
 * 			第一步：需要给循环起一个名字 a
 * 			第二步：break a;
 */
public class BreakTest01 {
    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) {
            System.out.println(i);
            if(i == 5) {
                break; // 终止离他最近的循环。if语句是选择语句
            }
        }

        for(int k = 0; k < 2; k++) { // 外层for
            for(int i = 0; i < 10; i++) { // 内层for
                System.out.println(i);
                if(i == 5) {
                    break; // 终止离他最近的循环。终止的是内层for
                }
            }
        }

        // break;语句终止指定的循环
        a:for(int k = 0; k < 2; k++) { // 外层for循环a
            b:for(int i = 0; i < 10; i++) { // 内层for循环b
                System.out.println(i);
                if(i == 5) {
                    break a; // 终止指定的循环a
                }
            }
        }

    }
}
