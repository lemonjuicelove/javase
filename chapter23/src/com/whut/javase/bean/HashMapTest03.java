package com.whut.javase.bean;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*
* HashMap集合key部分允许null，但是HashMap集合的key null值只能有一个：因为key重复的话，value会自动覆盖
* 可以允许有多个value值为null
*/
public class HashMapTest03 {
    public static void main(String[] args) {

        Map map = new HashMap();

        // HashMap集合允许key和value为null
        map.put(null, null);
        System.out.println(map.size());

        // key重复的话value进行覆盖
        // map.put(null, 100);
        // 允许多个value值为null
        map.put(10, null);
        System.out.println(map.size());

        Set<Map.Entry> set = map.entrySet();
        for (Map.Entry node : set){
            System.out.println(node.getKey() + "=" + node.getValue());
        }
        System.out.println(map.get(null));


        // 没有使用泛化机制时，为了避免类型错误，取出来的时候统一认为是Object类型
        for (Object node : map.entrySet()){
            if (node instanceof Map.Entry){
                Map.Entry node1 = (Map.Entry)node;
                System.out.println(node1.getKey() + "=" + node1.getValue());
            }
        }

    }
}
