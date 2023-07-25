package jihe14_15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class diedaiqi {
    /*
    * 迭代器，集合的专用遍历方式
    Iterator iterator()：返回此集合中元素的迭代器，通过集合的iterator()方法得到
    迭代器是通过集合的iterator()方法得到的，所以我们说它是依赖于集合而存在的
    *
    * */

    public static void main(String[] args) {
        //创建集合对象
        Collection<String> c = new ArrayList<>();

        //添加元素
        c.add("hello");
        c.add("world");
        c.add("java");
        c.add("javaee");
        Iterator<String> it = c.iterator();
        //多线程情景中，一个线程遍历，一个线程修改，
        //即使采用迭代器(Iterator)来遍历还是会出现ConcurrentModificationException异常，
        // 单线程情境下安全的操作，多线程情境中不再安全。
        //多线程情况下，将ArrayList改为CopyOnWriteArrayList在多线程环境中同样可以避免出现这个异常。

        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

    }
//    Collection 接口的设计目标是为了提供一组通用的集合操作方法，而不包含按索引访问元素的方法。
    //    如果需要按索引访问元素，应该选择实现了 List 接口的集合类。


}



