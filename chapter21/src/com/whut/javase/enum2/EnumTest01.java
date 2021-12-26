package com.whut.javase.enum2;

// 采用枚举的方式写程序

/*
* 1、枚举是一种引用数据类型
* 2、枚举类型定义的语法：
*       enum 枚举类型名{
*           枚举值1, 枚举值2...
*       }
* 3、结果只有两种情况的，建议使用布尔类型
*    结果超过两种并且可以一枚一枚列举出来的，建议使用枚举类型
*/

public class EnumTest01 {

    public static void main(String[] args) {
        Result r = divide(10, 1);
        System.out.println(r.equals(Result.SUCCESS));
        System.out.println(r.hashCode());
        System.out.println(Result.SUCCESS.hashCode());
        // 枚举中的每一个值可以看作是常量，常量都是存储在常量池当中的，所以使用==比较内存地址
        System.out.println(r == Result.SUCCESS ? "计算成功" : "计算失败");
    }

    public static Result divide(int a, int b){
        try{
            int c = a / b;
            return Result.SUCCESS;
        }catch (Exception e){
            return Result.FAIL;
        }
    }

}

/*
* 枚举：一枚一枚可以列举出来的，才建议使用枚举类型
* 枚举编译后也生成class文件
* 枚举是一种引用数据类型
* 枚举中的每一个值可以看作是常量
*/

/*
当我们使用enum来定义一个枚举类型的时候，编译器会自动帮我们创建一个final类型的类继承Enum类，所以枚举类型不能被继承。
*/

enum Result{
    SUCCESS, FAIL
}