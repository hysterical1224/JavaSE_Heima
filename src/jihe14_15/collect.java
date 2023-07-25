package jihe14_15;

import java.util.ArrayList;
import java.util.Collection;

public class collect {
//集合类的特点
    //提供一种存储空间可变的存储模型，存储的数据容量可以随时发生改变
    //    集合分单列和双列
    //单列集合（Single Column Collections）:
    //
    //List: 有序集合，允许重复元素。可以通过索引访问元素。
    //Set: 无序集合，不允许重复元素。通常用于去重和判重的操作。
    //Queue: 队列集合，按照一定规则进行元素插入和移除操作。常用的实现类有LinkedList和PriorityQueue。
    //Deque: 双端队列集合，可以在两端插入和移除元素。常用的实现类有ArrayDeque和LinkedList。

    //双列集合（Double Column Collections）:
    //
    //Map: 键值对集合，存储具有唯一键和对应值的元素。常用的实现类有HashMap、TreeMap和LinkedHashMap。
    //注意，虽然 List 是有序的，但它也被视为单列集合，因为它的元素是单一的，不是键值对形式。
    //
    //这些集合接口及其实现类提供了丰富的操作和功能，可以根据具体的需求选择适合的集合类型。
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<String>();
        collection.add("hello");
        collection.add(" java");
        System.out.println(collection);
        /*
        *  ArrayList<Integer> 提供了丰富的方法和功能，例如添加、删除、搜索、排序等。
        * 它还实现了 List 接口，可以使用 List 的各种方法进行操作。
        * new int[] 是一个简单的数组，提供了基本的访问和修改元素的功能，但没有内建的方法用于添加、删除或其他高级操作
        *
        * */

        //boolean add(E e) 添加元素
        //boolean remove(Object o) 从集合中移除指定的元素
        //void clear() 清空集合中的元素
        //boolean contains(Object o) 判断集合中是否存在指定的元素
        //boolean isEmpty() 判断集合是否为空
        //int size() 集合的长度，也就是集合中元素的个数




    }




}
