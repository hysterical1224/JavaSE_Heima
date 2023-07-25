package stream23;

import java.util.ArrayList;
import java.util.stream.Stream;

public class concatdistinct {


    public static void main(String[] args) {
        //需求4：合并需求1和需求2得到的流，并把结果在控制台输出，要求字符串元素不能重复
        ArrayList<String> list = new ArrayList<String>();

        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");

        Stream<String> stringStream = list.stream().limit(3);
        Stream<String> stringStream1 = list.stream().skip(4);

        Stream.concat(stringStream,stringStream1).distinct().forEach(System.out::println);


    }
}
