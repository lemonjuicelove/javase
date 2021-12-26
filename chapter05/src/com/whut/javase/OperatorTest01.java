package com.whut.javase;
/*
 * 算术运算符：+  -   *   /    ++    --    % (%最后的符号和被模数相同)
 *
 * 对于++运算符来说：
 * 			可以出现在变量前，也可以出现在变量后
 * 			不管出现在变量前还是后，总之++执行结束后，变量的值一定会自加1
 */
public class OperatorTest01 {
    public static void main(String[] args) {

        // 分析：++出现在变量前和变量后有什么区别


        int a = 100;
        // 语法：当++出现在变量后时，会先做赋值运算，再自加1
        int b = a++;

        int x = 101;
        // 语法：当++出现在变量前时，会先进行自加1，再赋值运算
        int y = ++x;



        // int c = 80;
        // System.out.println(c++);
        // 传，这个“传”在这里有个隐形的赋值运算
        // int temp = c++;
        // System.out.println(temp);

    }
}
