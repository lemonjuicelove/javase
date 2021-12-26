package com.whut.javase.bean;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
* HashMap集合：
*
*       1、HashMap集合底层是哈希表/散列表的数据结构
*
*       2、哈希表是怎样的一个数据结构：哈希表是一个数组和单向链表的结合体
*               数组：在查询方面效率很高，随机增删方面效率很低
*               单向链表：在随机增删方面效率很高，查询方面效率很低
*               哈希表将以上的两种数据结构融合在一起，充分发挥它们各自的优点
*
*       3、HashMap集合底层的源代码：
*           public class HashMap{
*               // HashMap底层实际上是一个一维数组
*               Node<K,V>[] table;
*               // 静态内部类HashMap.Node
*               static class Node<K,V> {
*                   final int hash; // 哈希值：是key的HashCode()方法的执行结果。hash值通过哈希算法，可以转换为数组的下标
*                   final K key; // 存储到Map集合中的key
*                   V value; // 存储到Map集合中的value
*                   Node<K,V> next; // 下一个节点的内存地址
*               }
*           }
*           哈希表/散列表：一维数组，这个数组中每一个元素是一个单向链表。(数组和链表的结合体)
*
*       4、最主要掌握的是：map.put(k,v)   v = map.get(k)
*          以上这两个方法的实现原理，是必须掌握的
*
*       5、HashMap集合的key部分特点：无序不可重复
*               为什么无序：因为不一定存储到哪个单向链表上
*               怎么保证不可重复：equals方法来保证HashMap集合的key不可重复，如果key重复，那么将原来的value进行覆盖
*
*               放在HashMap集合key部分的元素其实就是放到HashSet集合中了，
*               所以HashSet集合中的元素也需要同时重写hashCode()+equals()方法
*
*       6、哈希表HashMap使用不当时无法发挥性能
*           假设将所有的hashCode()方法返回值固定为某个值，那么会导致底层哈希表变成了纯单向链表
*           这种情况我们称为：散列分布不均匀
*           什么是散列分布均匀：
*               假设有100个元素，10个单向链表；那么每个单向链表上有10个节点，这样就是散列分布均匀的
*
*           假设将所有的hashCode()方法返回值都设定为不一样的值，这样会导致底层哈希表就成为了一维数组，
*           没有链表的概念了，也是散列分布不均匀的
*
*           散列分布均匀需要在重写hashCode()方法时有一定的技巧
*
*       7、重点：放在HashMap集合key部分的元素和放在HashSet集合中的元素，需要同时重写hashCode和equals方法
*
*       8、HashMap集合的默认初始化容量是16，默认加载因子是0.75
*          默认加载因子是当HashMap集合底层数组的容量达到75%的时候，数组开始扩容
*          扩容之后的容量是原容量的2倍
*
*       重点：HashMap集合初始化容量必须是2的倍数，这是因为达到散列均匀，提高HashMap集合的存取效率所必须的
*
*       9、在JDK8之后，如果哈希表单向链表中元素超过8个，单向链表这种数据结构会变成红黑树数据结构；当红黑树
*          上的节点数量小于6时，会重新把红黑树变成单向链表数据结构。
*
*          这种方式也是为了提高检索效率，二叉树的检索会再次缩小检索范围
*/
public class HashMapTest01 {
    public static void main(String[] args) {

        // 测试HashMap集合key部分元素的特点
        // Integer类型的元素是key，它的hashCode和equals方法已经重写了
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "张三");
        map.put(20, "李四1");
        map.put(3, "李四2");
        map.put(4, "李四3");
        map.put(15, "李四4");
        map.put(26, "李四5");
        map.put(7, "李四6");
        map.put(78, "李四7");
        map.put(59, "王五");
        map.put(100, "king"); // key重复的时候会将原来的value覆盖掉
        System.out.println(map.size());

        // 遍历Map集合
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for (Map.Entry<Integer, String> node : set){
            System.out.println(node.getKey() + "=" + node.getValue());
        }

    }
}
