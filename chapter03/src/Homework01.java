/*
 * = 等号右边只能是"字面量"
 */
public class Homework01 {
    public static void main(String[] args) {

        double shenGao = 1.85; // 带小数 默认为double数据类型，1.85F为float数据类型

        int b = 200;
        System.out.println(b);
        int c = b; // 执行原理：把b变量中的值复制一份传给变量c
        System.out.println(c);
    }
}
