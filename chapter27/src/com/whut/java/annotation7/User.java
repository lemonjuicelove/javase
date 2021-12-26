package com.whut.java.annotation7;

import java.lang.reflect.Field;
import java.util.Properties;
import java.util.Set;

/*
* 注解的作用：
*   需求：
*       假设有这样一个注解：ID
*       这个注解只能出现在类上，当这个类上有这个注解的时候，要求这个类中必须有一个int类型
*       的id属性，如果没有这个属性就报异常，如果有这个属性就正常执行
*/
@ID
public class User {

    String name;
    // int id;

    public static void main(String[] args) {

        Class userClass = null;
        try {
            userClass = Class.forName("com.whut.java.annotation7.User");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 判断这个类上是否有ID注解
        if (userClass.isAnnotationPresent(ID.class)){
            System.out.println("类上存在ID注解,需要int类型的id属性");
            Field[] fields = userClass.getDeclaredFields();
            if (fields.length == 0){
                try {
                    throw new FieldNotFoundException("被id注解所注解的类缺少int类型的id属性");
                } catch (FieldNotFoundException e) {
                    System.out.println(e.getMessage());
                }
            }

            // 布尔标记
            boolean flag = false;
            for (Field field : fields){
                // 一个Field它包括了修饰符列表，数据类型，变量名，都可以获得
                if ("id".equals(field.getName()) && "int".equals(field.getType().getSimpleName())){
                    // 如果存在int类型的id属性，那么布尔标记为真
                    flag = true;
                    break;
                }
            }

            if (!flag){
                try {
                    throw new FieldNotFoundException("被id注解所注解的类缺少int类型的id属性");
                } catch (FieldNotFoundException e) {
                    System.out.println(e.getMessage());
                }
            }else {
                System.out.println("系统正常运行");
            }

        }else {
            try {
                throw new FieldNotFoundException("类上不存在ID注解，不需要int类型的id属性，系统正常运行");
            } catch (FieldNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }

    }

}
// 自定义异常
class FieldNotFoundException extends Exception{

    public FieldNotFoundException() {
    }

    public FieldNotFoundException(String message) {
        super(message);
    }

}


