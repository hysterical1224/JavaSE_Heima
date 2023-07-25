package com.company;

import java.util.ArrayList;

public class Arrays {
//    什么是集合
    //提供一种存储空间可变的存储模型，存储的数据容量可以发生改变
    //ArrayList集合的特点
    //底层是数组实现的，长度可以变化
    //泛型的使用
    //用于约束集合中存储元素的数据类型
//    public boolean remove(Object o) 删除指定的元素，返回删除是否成功
    //public E remove(int index) 删除指定索引处的元素，返回被删除的元素
    //public E set(int index,E element) 修改指定索引处的元素，返回被修改的元素
    //public E get(int index) 返回指定索引处的元素
    //public int size() 返回集合中的元素的个数
    //public boolean add(E e) 将指定的元素追加到此集合的末尾
    //public void add(int index,E element) 在此集合中的指定位置插入指定的元素


    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("java");
        System.out.println(strings.remove("122"));
        System.out.println(strings);
        System.out.println(strings.remove("java"));
        System.out.println(strings);
        strings.add("guys");
        for (int i=0; i<strings.size(); i++){
            String s = strings.get(i);
            System.out.println(s);
        }


    }

}
