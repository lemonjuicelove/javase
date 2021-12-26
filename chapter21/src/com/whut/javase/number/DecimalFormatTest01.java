package com.whut.javase.number;

import java.text.DecimalFormat;

/*
* 关于数字的格式化
*/
public class DecimalFormatTest01 {
    public static void main(String[] args) {

        // java.test.DecimalFormat 专门负责数字格式化的
        // DecimalFormat df = new DecimalFormat("数字格式")

        /*
        * 数字格式有哪些： # 代表任意数字  ，代表千分位  .代表小数点  0 代表不够时补0
        * ###,###.## 表示：加入千分位，保留两位小数
        */

        DecimalFormat df = new DecimalFormat("##,###.##");
        String s = df.format(123.41);
        System.out.println(s); // 123.41

        // 加入千分位，保留4位小数，不够时补0
        DecimalFormat df2 = new DecimalFormat("##,###.0000");
        String s2 = df2.format(100.3);
        System.out.println(s2); // 100.3000

    }
}
