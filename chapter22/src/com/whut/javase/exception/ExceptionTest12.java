package com.whut.javase.exception;
/*
* finally面试题
*/

/*
 * java语法规则：
 *   有这样一条语法规则：方法体中的代码必须遵循自上而下的顺序依次逐行执行
 *   还有一条语法规则：return语句一旦执行，整个方法必须结束
 */
public class ExceptionTest12 {

    public static void main(String[] args) {
        int result = test();
        System.out.println("main：" + result); // 100
    }

    private static int test() {
        int i = 100;
        try{
            // 这行代码出现在int i = 100;的下面，所以最终结果必须返回是100
            // return语句一旦执行，整个方法结束
            return i;
        }finally {

            // 相当于把i的值赋给了一个新的变量j，类似于java中的值传递
            // j++;
            // System.out.println(j);

            i++;
            System.out.println("test：" + i); // 101

        }
    }

}
