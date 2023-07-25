package jihe14_15;

import java.util.Arrays;
import java.util.List;

public class kebian_canshu_yingyong {
    /**
     * 将一个数组转换为一个固定大小的列表。它将数组中的元素作为列表的元素，返回一个包含这些元素的 List 对象。
     *1.快速创建一个固定大小的列表；2.数组与列表之间的转换；3.方便与其他集合框架交互；4.适用于处理固定大小的数据集合
     *
     * Arrays工具类中有一个静态方法：
     * public static List asList(T... a)：返回由指定数组支持的固定大小的列表
     * 返回的集合不能做增删操作，可以做修改操作
     *
     *
     * List接口中有一个静态方法：
     * public static List of(E... elements)：返回包含任意数量元素的不可变列表
     * 返回的集合不能做增删改操作
     * Set接口中有一个静态方法：
     * public static Set of(E... elements) ：返回一个包含任意数量元素的不可变集合
     * 在给元素的时候，不能给重复的元素
     * 返回的集合不能做增删操作，没有修改的方法
     *
     *
     * */

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","Java","duidui");
        System.out.println(list);
        list.set(2,"ss");
        System.out.println(list);
        //增删过程语法通过，但是编译不通过
//        list.add(3,"123");
//        System.out.println(list);




    }
}
