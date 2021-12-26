package com.whut.javase.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
* 重要：Map集合遍历的两种方式
*/

/*
 * Map的key自动排序的假象：
 *      当int类型作为key的时候，偶尔会出现自动排序这种情况。
 *          1.当插入的数据多了就不是自动排序的了。(key要不连续)
 *          2.其他类型作为key，也不是自动排序的了。
 */
public class MapTest02 {
    public static void main(String[] args) {

        // 创建Map集合对象
        Map<Integer, String> myMap = new HashMap<>();
        // 添加键值对
        myMap.put(1, "张三");
        myMap.put(4, "李四");
        myMap.put(3, "王五");
        myMap.put(20, "赵六");
        myMap.put(12, "赵六2");
        myMap.put(10, "赵六3");
        myMap.put(6, "赵六4");
        myMap.put(9, "赵六5");
        myMap.put(6, "赵六6");
        myMap.put(0, "赵六7");
        myMap.put(21, "赵六8");
        myMap.put(30, "赵六9");

        // 第一种方式：获取所有的key，通过遍历key，来遍历value
        // 这种方式是先获取key值，然后还要通过key值去哈希表中找value值，效率较低

        // 只是将Map集合中的key部分转换为Set集合
        Set<Integer> keySet = myMap.keySet();

        // foreach遍历
        for (Integer key : keySet){
            System.out.println(key + "---->" + myMap.get(key));
        }
        System.out.println("-----------------");

        // 迭代器遍历：迭代器迭代的是Set集合中的key值，然后通过key获取Map集合中的value
        Iterator<Integer> it = keySet.iterator();
        while (it.hasNext()){
            Integer key =it.next();
            String value = myMap.get(key);
            System.out.println(key + "---->" + value);
        }
        System.out.println("--------------");


        // 第二种方式：Set<Map.Entry<K,V>> entrySet()
        // 以上这个方法是把Map集合直接全部转换成Set集合，其中Set集合中元素的类型是：Map.Entry<K,V>
        // Set集合中存储的是Map.Entry类型的对象，这个对象有key和value两个属性

        Set<Map.Entry<Integer,String>> set = myMap.entrySet();
        // foreach遍历set集合，每次取出来的是一个Map.Entry<Integer,String>类型的node对象
        // 这个node对象有key和value两个属性
        // 这种方式效率比较高，因为获取key和value都是直接从node对象中获取的属性值
        // 这种方式比较适合于大数据量
        for (Map.Entry<Integer,String> node : set){
            System.out.println(node.getKey() + "-------->" + node.getValue());
        }

        System.out.println("------------------------------------");

        // 迭代器迭代
        Iterator<Map.Entry<Integer,String>> it2 = set.iterator();
        while (it2.hasNext()){
            // 每次取出来的是一个Map.Entry<Integer,String>类型的node对象
            // 这个node对象有key和value两个属性
            Map.Entry<Integer,String> node = it2.next();
            System.out.println(node.getKey() + "-------->" + node.getValue());
        }

    }
}
