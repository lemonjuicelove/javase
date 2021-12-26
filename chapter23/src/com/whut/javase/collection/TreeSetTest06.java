package com.whut.javase.collection;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;
/*
* TreeSet集合中元素可排序的第二种方式：使用比较器的方式
*
* 结论： 放在TreeSet或者TreeMap集合key部分的元素要想做到排序，包括两种方式：
*       第一种：放在集合中的元素实现java.lang.Comparable接口
*       第二种：在构造TreeSet或者TreeMap集合的时候给它传一个比较器对象
*
* Comparable和Comparator怎么选择：
*       当比较规则不会发生改变的时候，或者当比较规则只有一个的时候，建议实现Comparable接口，在比较对象中重写compareTo方法
*       如果比较规则有多个，并且需要多个比较规则之间频繁切换，建议使用Comparator接口，传入比较器对象
*/
public class TreeSetTest06 {
    public static void main(String[] args) {

        // 创建TreeSet集合的时候，需要使用这个比较器
        // TreeSet<WuGui> ts = new TreeSet<>(); // 这样不行，没有通过构造方法传递一个比较器进去

        // 给构造方法传递一个比较器
        TreeSet<WuGui> ts = new TreeSet<>((wuGui, t1) -> 0);
        ts.add(new WuGui(200));
        ts.add(new WuGui(100));
        ts.add(new WuGui(1100));
        ts.add(new WuGui(800));

        for (WuGui wuGui : ts){
            System.out.println(wuGui);
        }


        TreeMap<String,WuGui> map = new TreeMap<>();
        map.put("1",new WuGui());

    }
}

class WuGui{

    private int age;

    public WuGui() {
    }
    public WuGui(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "WuGui{" +
                "age=" + age +
                '}';
    }

}

// 单独编写一个比较器
// 比较器实现java.util.Comparator接口(Comparable是java.lang包下的，Comparator是java.util包下的)
class WuGuiComparator implements Comparator<WuGui>{
    @Override
    public int compare(WuGui wuGui, WuGui t1) {
        // 指定比较规则
        return wuGui.getAge() - t1.getAge();
    }
}