package stream23;

import java.util.ArrayList;
import java.util.function.Predicate;

public class stramliu {
    /**
     * 创建一个集合，存储多个字符串元素
     * 把集合中所有以"张"开头的元素存储到一个新的集合
     * 把"张"开头的集合中的长度为3的元素存储到一个新的集合
     * 遍历上一步得到的集合
     * */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");

        //把集合中所有以"张"开头的元素存储到一个新的集合
        ArrayList<String> zz = zhang(list, s -> s.startsWith("张"), s -> s.length() == 3);
        System.out.println(zz);

        //Stream流的好处
        //直接阅读代码的字面意思即可完美展示无关逻辑方式的语义：获取流、过滤姓张、过滤长度为3、逐一打印
        //Stream流把真正的函数式编程风格引入到Java中

        list.stream().filter(s->s.startsWith("张")).filter(s -> s.length() == 3).forEach(System.out::println);

    }
    private static ArrayList<String> zhang(ArrayList<String> al, Predicate<String> pre, Predicate<String> pre2){
        ArrayList<String> array = new ArrayList<>();
        for (String s:al){
            if (pre.and(pre2).test(s)){
                array.add(s);
            }
        }
        return array;
    }


}
