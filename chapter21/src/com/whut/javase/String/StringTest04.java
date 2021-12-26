package com.whut.javase.String;

// String类中常用的方法
public class StringTest04 {
    public static void main(String[] args) {

        // 1(掌握) public char charAt(int index)
        // 提取字符串中指定下标的元素为一个新字符
        char c = "安徽工程大学".charAt(0);
        System.out.println(c);

        // 2(了解) public int compareTo(String anotherString)
        // 字符串之间比较大小不能直接使用> <，需要使用compareTo方法
        // 从第一位开始比较大小
        System.out.println("abc".compareTo("abc")); // 0 前后一致
        System.out.println("abe".compareTo("abf")); // -1 前小后大
        System.out.println("abcg".compareTo("abc")); // 1 前大后小

        // 3(掌握) public boolean contains(CharSequence s)
        // 判断前面的字符串中是否包含后面的子字符串
        System.out.println("安徽工程大学".contains("大学")); // true

        // 4(掌握) public boolean endsWith(String suffix)
        // 判断当前字符串是否以某个字符串结尾
        System.out.println("机电工程学院".endsWith("学")); // false

        // 5(掌握) public boolean equals(Object anObject)
        // 比较两个字符串是否相等必须使用equals方法，不能使用"=="
        // equals方法只能看出相不相等，compareTo方法可以看出是否相等，并且看出谁大谁小

        // 6(掌握) public boolean equalsIgnoreCase(String anotherString)
        // 判断两个字符串是否相等，并且同时忽略大小写
        System.out.println("i love whut".equalsIgnoreCase("I love WHUT")); // true

        // 7(掌握) public byte[] getBytes()
        // 将字符串对象转换成byte数组
        byte[] bytes = "abcdefg".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + " ");
        }
        System.out.println();

        // 8(掌握) public int indexOf(String str)
        // 判断某个子字符串在当前字符串中第一次出现处的索引(下标)
        System.out.println("whut university".indexOf("whut")); // 0

        // 9(掌握) public boolean isEmpty()
        // 判断某个字符串是否为空字符串
        // 空格也算一个字符,并不是空
        System.out.println("hello".isEmpty()); // false

        // 10(掌握) public int length()
        // 面试题：判读数组长度和判断字符串长度不一样
        // 判断数组长度是length属性，判断字符串长度是length()方法
        // 也可以用length()方法判断字符串是不是空的
        System.out.println("abc".length());

        // 11(掌握) public int lastIndexOf(String str)
        // 判断某个子字符串在当前字符串中最后一次出现处的索引(下标)
        System.out.println("java python c++c# php go java".lastIndexOf("java")); // 20

        // 12(掌握) public String replace(CharSequence target, CharSequence replacement)
        // 用新字符串串替换旧字符串
        // String类的父接口就是：CharSequence
        String news1 = "python天下第一".replace("python", "java");
        System.out.println(news1);

        // 13(掌握) public String[] split(String regex)
        // 拆分字符串
        String[] news2 = "java python c++ c# c php".split(" ");
        for (int i = 0; i < news2.length; i++) {
            System.out.print(news2[i] + " ");
        }
        System.out.println();

        // 14(掌握) public boolean startsWith(String prefix)
        // 判断某个字符串是否以某个子字符串开始
        System.out.println("whut universitry".startsWith("whut")); // true

        // 15(掌握) public String substring(int beginIndex) 参数是要截取的起始下标
        // 截取字符串
        System.out.println("www.whut.com".substring(4)); // whut.com

        // 16(掌握) public String substring(int beginIndex, int endIndex)
        // beginIndex起始位置(包括)
        // endIndex终止位置(不包括)
        System.out.println("www.whut.com".substring(4,8)); // whut

        // 17(掌握) public char[] toCharArray()
        // 将字符串转换成char数组
        char[] newchar1 = "我是中国人".toCharArray();
        for (int i = 0; i < newchar1.length; i++) {
            System.out.print(newchar1[i] + " ");
        }
        System.out.println();

        // 18(掌握) public String toLowerCase()
        // 转换成小写
        System.out.println("ABCDEFG".toLowerCase());

        // 19(掌握) public String toUpperCase()
        // 转换成大写
        System.out.println("abcdefg".toUpperCase());

        // 20(掌握) public String trim()
        // 去除字符串前后空白
        System.out.println("    nihao     ".trim()); // nihao

        // 21(掌握) public static String valueOf() // 源代码中有方法重载
        // String中只有这一个方法是静态的，不需要new对象
        // 作用：将"非字符串"转换成"字符串"
        // 查看源代码可知：参数只要是合法的数据类型就行
        String s1 = String.valueOf(false);
        System.out.println(s1);

        // 这个静态的valueof()方法，参数是一个对象的时候，会自动调用该对象的toString()方法
        String s2 = String.valueOf(new Customer());
        // 没有重写Customer类中toString方法之前
        System.out.println(s2); // com.whut.javase.String.Customer@5b6f7412
        // 重写Customer类中toString方法之后
        System.out.println(s2); // Customer{}

        // 研究println()方法的源代码
        // 本质上System.out.println()这个方法在输出任何数据的时候都是先转换成字符串，再输出
        System.out.println(100);

    }
}

class Customer{
    @Override
    public String toString() {
        return "Customer{}";
    }
}
