package com.whut.java.annotation6;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectAnnotationTest {
    public static void main(String[] args) throws ClassNotFoundException {

        StringBuffer s = new StringBuffer();
        Class c = Class.forName("com.whut.java.annotation6.MyAnnotation");
        s.append(Modifier.toString(c.getModifiers()));
        s.append(" @interface ");
        s.append(c.getSimpleName() + "{\n");
        /*Field[] fields = c.getDeclaredFields();
        for (Field field : fields){
            s.append("\t");
            s.append(Modifier.toString(field.getModifiers()));
            s.append(" ");
            s.append(field.getName());
            s.append("();");
        }*/

        s.append("\n}");
        System.out.println(s);
    }
}
