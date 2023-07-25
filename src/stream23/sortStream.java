package stream23;

import java.util.ArrayList;

public class sortStream {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("linqingxia");
        list.add("zhangmanyu");
        list.add("wangzuxian");
        list.add("liuyan");
        list.add("zhangmin");
        list.add("zhangwuji");

        //需求1：按照字母顺序把数据在控制台输出
        list.stream().sorted().forEach(System.out::println);
        System.out.println("-------------------");

        //需求2：按照字符串长度把数据在控制台输出
        list.stream().sorted((s1,s2)->{
           int num = s1.length()-s2.length();
           int num2 = num==0?s1.compareTo(s2):num;
           return num2;
        }).forEach(System.out::println);
    }
}
