package lambda22;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class streamliu {
    /**
     * Stream 流是 Java 8 引入的新特性，用于处理集合（Collection）或数组（Array）等元素的序列。
     * Stream 提供了丰富的函数式编程操作，如映射、过滤、排序等，以及聚合操作，如求和、计数、归约等。
     *
     * Stream 流可以处理各种类型的数据，包括原始类型和对象类型。
     * 它们是面向元素的操作，提供了丰富的中间操作和终端操作，如 map()、filter()、collect() 等。
     *
     * InputStream/OutputStream 是阻塞式的输入输出流，读取和写入操作会阻塞当前线程，
     * 直到有数据可读或写入完成。而 Stream 流可以进行并行处理，利用多线程执行操作以提高性能。
     * InputStream/OutputStream 是字节流，用于处理二进制数据，如图像、音频、视频等。它们提供了字节的读取和写入方法，如 read() 和 write()。
     * InputStream/OutputStream 是阻塞式的输入输出流，读取和写入操作会阻塞当前线程，直到有数据可读或写入完成。而 Stream 流可以进行并行处理，利用多线程执行操作以提高性能。
     *
     * Stream 流可以处理各种类型的数据，包括原始类型和对象类型。它们是面向元素的操作，提供了丰富的中间操作和终端操作，如 map()、filter()、collect() 等。
     * Stream 流和 InputStream/OutputStream 之间的联系是，可以通过适当的转换将字节流转换为字符流，然后使用 Stream API 进行进一步的处理。例如，可以使用 InputStreamReader 将字节流转换为字符流，然后使用 BufferedReader 读取行，并将其作为 Stream 流进行处理。
     * */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ss");
        list.add("sb");
        list.add("sc");
        list.stream()
                .distinct()
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return false;
                    }
                });
        /**
         * 在给定的代码中，list.stream() 创建了一个 Stream 流，它是对列表 list 进行操作的起点。
         * .distinct() 是一个中间操作，它用于去除流中的重复元素。它会保留流中的唯一元素，并返回一个新的流。在处理流的过程中，通过调用 .distinct() 可以确保流中的元素是唯一的。
         * .filter(Predicate<T> predicate) 是另一个中间操作，它用于基于给定的条件过滤流中的元素。Predicate 是一个函数式接口，可以根据指定的条件对流中的元素进行判断，并返回一个布尔值。只有满足条件的元素才会被保留在流中，而不满足条件的元素将被过滤掉。
         * 例如，可以使用 .filter() 对流中的元素进行条件筛选，保留满足某个特定条件的元素。传递给 .filter() 的参数是一个 Predicate 接口的实现，它定义了元素的判断条件。
         * 在给定的代码中，.filter() 可能是用来对流中的元素进行进一步的筛选，根据指定的条件过滤掉不符合要求的元素，只保留满足条件的元素。
         * 总之，.distinct() 用于去除流中的重复元素，而 .filter() 用于根据条件对流中的元素进行筛选和过滤。它们都是 Stream API 中提供的中间操作，可以对流进行多步处理以满足特定需求。
         *
         *
         * 除了 .distinct() 和 .filter()，Stream 流还提供了许多其他操作，可以根据具体的需求对流进行转换、筛选、映射、排序等操作。以下是一些常见的 Stream 操作：
         * .map(Function<T, R> mapper): 将流中的每个元素根据给定的映射函数进行转换，返回一个新的流。
         * .flatMap(Function<T, Stream<R>> mapper): 将流中的每个元素根据给定的映射函数进行转换，并将结果扁平化为一个新的流。
         * .sorted(Comparator<T> comparator): 根据给定的比较器对流中的元素进行排序，返回一个新的流。
         * .limit(long maxSize): 限制流中的元素数量不超过指定的最大值，返回一个新的流。
         * .skip(long n): 跳过流中的前 n 个元素，返回一个新的流。
         * .forEach(Consumer<T> action): 对流中的每个元素执行给定的操作。
         * .collect(Collector<T, A, R> collector): 将流中的元素收集到集合或其他数据结构中，返回一个结果。
         * .reduce(T identity, BinaryOperator<T> accumulator): 根据给定的初始值和累加函数，对流中的元素进行归约操作。
         * 这只是一些常见的 Stream 操作，还有其他操作如 findFirst()、findAny()、anyMatch()、allMatch()、noneMatch() 等可以根据具体的需求选择使用。
         *
         * */
    }
}
