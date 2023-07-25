package jihe14_15;

import java.util.LinkedHashSet;

public class linkedhashset {
    //LinkedHashSet集合特点
    //哈希表和链表实现的Set接口，具有可预测的迭代次序
    //由链表保证元素有序，也就是说元素的存储和取出顺序是一致的
    //由哈希表保证元素唯一，也就是说没有重复的元素
    public static void main(String[] args) {
        //创建集合对象
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

        //添加元素
        linkedHashSet.add("hello");
        linkedHashSet.add("world");
        linkedHashSet.add("java");

        linkedHashSet.add("world");

        //遍历集合
        for(String s : linkedHashSet) {
            System.out.println(s);
        }


    }
}
