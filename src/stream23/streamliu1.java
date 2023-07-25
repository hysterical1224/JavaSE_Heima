package stream23;

import java.util.*;
import java.util.stream.Stream;

public class streamliu1 {
    /**
     * 生成Stream流的方式
     * Collection体系集合
     * 使用默认方法stream()生成流， default Stream stream()
     * Map体系集合
     * 把Map转成Set集合，间接的生成流
     * 数组
     * 通过Stream接口的静态方法of(T... values)生成流
     * */

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Stream<String> listStream = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> setStream = set.stream();

        Map<String, Integer> map = new HashMap<>();
        Stream<String> key = map.keySet().stream();
        Stream<Integer> value = map.values().stream();
        Stream<Map.Entry<String,Integer>> mapStream = map.entrySet().stream();

        String[] strArray = {"hello", "World", "java"};
        Stream<String> stringStream = Stream.of(strArray);
        //Stream接口的静态方法of用于创建一个包含指定元素的Stream流。
        // 这个方法接收可变参数，可以传入任意数量的元素，并将它们转换为一个Stream流。
        Stream<String> stringStream1 = Stream.of("hi","ss","sb");

        Stream<Integer> integerStream = Stream.of(10,20,30);
        /**
         * Stream filter(Predicate predicate) 用于对流中的数据进行过滤
         * Stream limit(long maxSize) 返回此流中的元素组成的流，截取前指定参数个数的数据
         * Stream skip(long n) 跳过指定参数个数的数据，返回由该流的剩余元素组成的
         * 流
         * static Stream concat(Stream a, Stream
         * b) 合并a和b两个流为一个流
         * Stream distinct() 返回由该流的不同元素（根据Object.equals(Object) ）组
         * 成的流
         * Stream sorted() 返回由此流的元素组成的流，根据自然顺序排序
         * Stream sorted(Comparator
         * comparator)
         *  返回由该流的元素组成的流，根据提供的Comparator进行
         * 排序
         * Stream map(Function mapper) 返回由给定函数应用于此流的元素的结果组成的流
         * IntStream mapToInt(ToIntFunction
         * mapper)
         *  返回一个IntStream其中包含将给定函数应用于此流的元素
         * 的结果
         * */




    }
}
