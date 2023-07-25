package stream23;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamshouji {
    /**
     * 对数据使用Stream流的方式操作完毕后，可以把流中的数据收集到集合中。
     * 方法名 说明
     * R collect(Collector collector) 把结果收集到集合中
     * 常用方法
     * 方法名 说明
     * public static Collector toList() 把元素收集到List集合中
     * public static Collector toSet() 把元素收集到Set集合中
     * public static Collector toMap(Function keyMapper,Function valueMapper)
     * 把元素收集到Map集合中
     * */

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");

        Stream<String> stringStream = list.stream().filter(s -> s.length() == 3);
        /**
         * 在Java的Stream中，流操作被分为两类：
         * 中间操作（Intermediate Operations）和终端操作（Terminal Operations）。
         * 中间操作返回的是一个新的Stream，可以进行多次链式调用。
         * 但是，终端操作是一个最终的操作，执行终端操作之后，流将会被消耗，不再可用。
         *
         * 中间操作：sorted,distinct,filter,map,limit,skip,peek
         * 终端操作：forEach，toArray，collect，reduce，min,max,count,anyMatch,allMatch,noneMatch,
         * findMatch,findAny
         * */
        List<String> collect = stringStream.collect(Collectors.toList());


        for (String s:collect){
            System.out.println(s);
        }

        /**
         * collect()是一个终端操作，用于将Stream流中的元素收集到一个容器中，如List、Set、Map等，并生成一个最终的结果。
         *
         * collect()方法的参数是一个Collector类型的对象，它定义了收集Stream元素的规则。
         * Java提供了许多内置的Collector，可以满足不同的收集需求，例如Collectors.toList()用于将元素收集到List中，
         * Collectors.toSet()用于将元素收集到Set中，Collectors.toMap()用于将元素收集到Map中等。
         *
         *
         *
         *Collectors.toList(): 将Stream中的元素收集到一个List中。
         * Collectors.toSet(): 将Stream中的元素收集到一个Set中。
         * Collectors.toMap(keyMapper, valueMapper): 将Stream中的元素按照keyMapper和valueMapper指定的映射规则收集到一个Map中。
         * Collectors.groupingBy(classifier): 根据给定的分类函数（classifier）对Stream中的元素进行分组，形成一个Map，键是分类的结果，值是对应分类的元素列表。
         * Collectors.groupingBy(classifier, downstream): 在groupingBy的基础上，允许对每个分组的元素进行进一步的操作，downstream可以是另一个Collector。
         * Collectors.joining(): 将Stream中的元素按照指定的分隔符连接成一个字符串。
         * Collectors.counting(): 计算Stream中元素的个数，返回一个Long类型的结果。
         * Collectors.summingInt(), Collectors.summingLong(), Collectors.summingDouble(): 分别对Stream中的int、long、double类型的元素求和，返回对应的结果类型。
         * Collectors.averagingInt(), Collectors.averagingLong(), Collectors.averagingDouble(): 分别对Stream中的int、long、double类型的元素求平均值，返回对应的结果类型。
         * Collectors.maxBy(), Collectors.minBy(): 分别找到Stream中的最大值和最小值，返回Optional类型的结果。
         * 这些是Java中Collectors类提供的一些常见的内置Collector。
         * 除了上述的内置Collector，你还可以通过Collectors.collectingAndThen()和Collectors.reducing()等方法创建更复杂的收集器，
         * 以满足特定的需求。使用这些Collector可以极大地简化对Stream中数据的收集和处理操作。
         * */
        Set<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(33);
        set.add(35);

        Stream<Integer> nameage = set.stream().filter(age -> age > 25);
        Set<Integer> age = nameage.collect(Collectors.toSet());
        for (Integer e: age){
            System.out.println(e);
        }

        String[] strArrays = {"林青霞,30", "张曼玉,35", "王祖贤,33", "柳岩,25"};

        //Stream.of() 用于创建一个由指定元素组成的 Stream 流。
        // 它可以接受任意数量的参数，并将这些参数作为 Stream 流的元素。
        Stream<String> strArrays1 = Stream.of(strArrays).filter(s->Integer.parseInt(s.split(",")[1])>30);
        Map<String,Integer> map = strArrays1.collect(Collectors.toMap(s->s.split(",")[0],s->Integer.parseInt(s.split(",")[1])));

        Set<String> keyset = map.keySet();
        for (String key:keyset){
            Integer value = map.get(key);
            System.out.println(key+","+value);
        }


    }
}
