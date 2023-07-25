package jihe14_15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Linkedlist {
    /*
    * LinkedList集合的特有功能【应用】
        方法名 说明
        public void addFirst(E e) 在该列表开头插入指定的元素
        public void addLast(E e) 将指定的元素追加到此列表的末尾
        public E getFirst() 返回此列表中的第一个元素
        public E getLast() 返回此列表中的最后一个元素
        public E removeFirst() 从此列表中删除并返回第一个元素
        public E removeLast() 从此列表中删除并返回最后一个元素
    *
    *
    *
    *
    *
    * */

    public static void main(String[] args) {
        //collection不支持get和set操作，
        // 但是array支持，collection只支持用Iterator遍历
        Collection<String> collection = new ArrayList<>();
        collection.add("exo");
        collection.add("yjh");
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }

        List<String> list = new ArrayList<>();
        list.add("nmm");
        list.add("cccc");
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
