package stream23;

import java.util.ArrayList;

public class limiskip {


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");

        list.stream().limit(3).forEach(System.out::println);
        System.out.println("---------");


        list.stream().skip(3).forEach(System.out::println);
        System.out.println("---------");

        list.stream().skip(2).limit(2).forEach(System.out::println);


    }
}
