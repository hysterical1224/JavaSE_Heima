package stream23;

import java.util.ArrayList;
import java.util.function.Predicate;

public class predicate19 {
    /**
     * 练习描述
     * String[] strArray = {"林青霞,30", "柳岩,34", "张曼玉,35", "貂蝉,31", "王祖贤,33"};
     * 字符串数组中有多条信息，请通过Predicate接口的拼装将符合要求的字符串筛选到集合ArrayList中，
     * 并遍历ArrayList集合
     * 同时满足如下要求：姓名长度大于2；年龄大于33
     * 分析
     * 有两个判断条件,所以需要使用两个Predicate接口,对条件进行判断
     * 必须同时满足两个条件,所以可以使用and方法连接两个判断条件
     * */
    public static void main(String[] args) {
        String[] strArray = {"林青霞,13", "柳岩,34", "张曼玉,35", "貂蝉,31", "王祖贤,33"};
        ArrayList<String> array = checkItem(strArray, s -> s.split(",")[0].length() > 2, s -> Integer.parseInt(s.split(",")[1]) > 23);
        for (String str: array){
            System.out.println(str);
        }

    }
    private static ArrayList<String> checkItem(String[] str, Predicate<String> pre1,Predicate<String> pre2){

        //如果去掉 array 集合，方法仍然可以通过遍历 strArray 并使用条件判断，
        // 但无法保留满足条件的字符串，从而无法实现返回包含满足条件的字符串的集合的功能。
        // 因此，保留 array 集合是为了有效地存储满足条件的字符串，并通过返回该集合来提供方法的结果。
        ArrayList<String> al = new ArrayList<>();

        for (String s: str){
            if (pre1.and(pre2).test(s)){
                al.add(s);
            }
        }
        return al;
    }
}
