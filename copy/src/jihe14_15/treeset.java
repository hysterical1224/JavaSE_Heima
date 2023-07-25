package jihe14_15;

import java.util.TreeSet;

public class treeset {
    /*
    * TreeSet集合概述
    元素有序，可以按照一定的规则进行排序，具体排序方式取决于构造方法
    TreeSet()：根据其元素的自然排序进行排序
    TreeSet(Comparator comparator) ：根据指定的比较器进行排序
    没有带索引的方法，所以不能使用普通for循环遍历
    由于是Set集合，所以不包含重复元素的集合
    *
    *
    *
    *
    * TreeSet 是 Set 接口的一个实现类，它是基于红黑树（一种自平衡的二叉搜索树）实现的。
    * 在 TreeSet 中，元素会按照它们的自然顺序进行排序，或者根据传入的比较器进行自定义排序。
    * 对于 String 类型的元素，默认情况下，它们会按照字典顺序（即字符的Unicode值）进行排序。
    * 这意味着在 TreeSet 中，存放的字符串元素会按照字母顺序进行排序。
    * */



    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("aad");
        ts.add("aaa");
        ts.add("bad");
        ts.add("baa");
        System.out.println(ts);
    }





}
