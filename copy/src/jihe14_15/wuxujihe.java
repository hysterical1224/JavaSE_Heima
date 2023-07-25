package jihe14_15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class wuxujihe {
    /*
    * Set集合的特点
        元素存取无序
        没有索引、只能通过迭代器或增强for循环遍历
        不能存储重复元素
        Set集合的基本使用
    *
    *
    * */
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("Java");
        set.add(" hhhh");
        //set没有序列号，不能用普通的for进行遍历
        for(String name:set){
            System.out.println(name);
        }

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
        //HashSet集合保证元素唯一性的原理
        //1.根据对象的哈希值计算存储位置
        //如果当前位置没有元素则直接存入
        //如果当前位置有元素存在，则进入第二步
        //2.当前元素的元素和已经存在的元素比较哈希值
        //如果哈希值不同，则将当前元素进行存储
        //如果哈希值相同，则进入第三步
        //3.通过equals()方法比较两个元素的内容
        //如果内容不相同，则将当前元素进行存储
       






    }



}
