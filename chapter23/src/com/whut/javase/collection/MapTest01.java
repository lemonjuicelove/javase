package com.whut.javase.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
* java.util.Map接口中常用的方法：
*
*       1、Map和Collection没有继承关系
*
*       2、Map集合以key和value的方式存储数据：键值对
*           key和value都是引用数据类型
*           key和value都是存储对象的内存地址
*           key起主导地位，value是key的一个附属品
*
*       3、Map接口中的常用方法：
*            V put(K key, V value) 向Map集合中添加键值对
*            V get(K key) 通过key获取value
*            void clear() 清空Map集合
*            boolean containsKey(Object key) 判断Map中是否包含某个key
*            boolean containsValue(Object value) 判断Map中是否包含某个value
*            boolean isEmpty() 判断Map集合中元素个数是否为0
*            Set<K> keySet() 获取Map集合所有的key(所有的key是一个set集合)
*            V remove(Object key) 通过key删除键值对
*            int size() 获取Map集合中键值对的个数
*            Collection<V> values() 获取Map集合中所有的value，返回一个Collection
*
*            Set<Map.Entry<K,V>> entrySet()
*               将Map集合转换成Set集合
*               假设现在有一个Map集合，如下所示：
*                   map1集合对象
*                   key             value
*                   ----------------------------
*                   1               lisi
*                   2               zhangsan
*                   3               王五
*
*                   Set set1 = map1.entrySet();
*                   set1集合对象中的元素为：
*                   1=lisi  [注意：Map集合通过entrySet()方法转换成的这个Set集合，Set集合中元素的类型是 Map.Entry<K,V>]
*                   2=zhangsan  [Map.Entry和String一样，都是一种类型的名字，只不过：Map.Entry是Map中的静态内部类]
*                   3=王五
*/
public class MapTest01 {
    public static void main(String[] args) {

        // 使用泛型机制创建Map集合对象
        Map<Integer, String> myMap = new HashMap<>();

        // 向Map集合中添加键值对
        myMap.put(1, "zhangsan");

        String put = myMap.put(1, "jack");
        System.out.println(put);

        myMap.put(2, "lisi");
        myMap.put(3, "wangwu");
        myMap.put(4, "zhaoliu");
        myMap.put(5, "zhaoliu2");
        myMap.put(6, "zhaoliu3");

        // 通过key获取value
        // 如果没有使用泛型机制，数据类型应该写为Object
        String value2 = myMap.get(2);
        System.out.println(value2);

        // 获取键值对的数量
        System.out.println("键值对的数量为：" + myMap.size());

        // 通过key删除key-value
        // 底层调用的equals方法进行比较
        String remove = myMap.remove(2);
        System.out.println("remove:" + remove);
        System.out.println("键值对的数量为：" + myMap.size());

        // contains方法底层调用的都是equals进行比对的，所以自定义的类型需要重写equals方法
        // 判断是否包含某个key
        System.out.println(myMap.containsKey(3));
        // 判断是否包含某个value
        System.out.println(myMap.containsValue("lisi"));

        // 获取所有的value
        Collection<String> values = myMap.values();
        for (String s : values){
            System.out.println(s);
        }

        // 获取所有的key
        Set<Integer> key = myMap.keySet();
        for(Integer k : key){
            System.out.println(k);
        }

        // 清空集合
        myMap.clear();
        System.out.println("键值对的数量为：" + myMap.size());
        // 判断集合中的元素个数是否为0
        System.out.println(myMap.isEmpty()); // true

    }
}
