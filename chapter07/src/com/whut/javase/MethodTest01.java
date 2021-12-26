package com.whut.javase;
/*
 * 	对于一个java程序来说，如果没有"方法",会存在什么问题？
 * 		代码无法得到复用
 *
 * 	怎么提高复用性：可以定义方法，然后需要使用该功能的时候，直接调用一下方法即可。
 *
 *  注意：程序开始执行的时候是先执行main方法，因为main方法是一个入口方法
 *
 * 	main方法不需要手动调用，是由jvm调用的。除了main方法之外的其他方法，
 *  都需要手动调用，方法只有调用的时候才会执行，不调用是不会执行的
 */
public class MethodTest01 {




    // 方法定义在类体当中
    // 主方法  入口方法
    public static void main(String[] args) { // 方法体中的代码都是自上而下依次逐行运行
        // 需求1：计算100+200的和
        sumInt(100, 200);
        // 需求2：计算10+20的和
        sumInt(10, 20);
        // 需求3：计算30+40的和
        sumInt(30, 40);




    }

    // 专门在这个类体当中定义一个方法，用这个方法来完成求和
    //  x y z 在下面的sumInt方法中都属于局部变量
    // 局部变量的特点：方法结束之后，局部变量占用的内存会自动释放
    public static void sumInt(int x, int y) {
        int z = x + y;
        System.out.println(x + "+" + y + "=" + z);
    }



}

