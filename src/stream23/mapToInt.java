package stream23;

import java.util.ArrayList;

public class mapToInt {
    /**
     * mapToInt是Stream接口中的一个中间操作方法之一，它用于将Stream中的元素映射为int类型的值。
     * 具体来说，它将一个包含对象的Stream转换为一个包含int类型元素的IntStream。
     *
     * */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("10");
        list.add("20");
        list.add("30");
        list.add("40");
        list.add("50");

        /**
         * 当你调用list.stream().map()时，你实际上是在创建一个Stream流并对其中的元素进行映射操作。
         * map是Stream接口的一个中间操作方法，用于对流中的每个元素应用给定的函数，并将映射后的结果生成一个新的Stream。
         *
         * 具体来说，map方法接收一个Function函数式接口作为参数，该接口定义了一个抽象方法R apply(T t)，
         * 其中T是流中的元素类型，R是映射后的结果类型。在map方法的执行过程中，流中的每个元素都会被应用给定的函数，
         * 然后将映射后的结果生成一个新的Stream。
         *
         *
         * 与map方法不同，mapToInt方法将流中的元素映射为int类型的值，这样生成的IntStream不再包含泛型类型，
         * 而是只包含int类型的元素。这种映射可以更高效地处理大量的int类型数据。
         *
         * 以下是一个示例，演示了如何使用mapToInt方法将一个包含整数的列表中的元素进行平方映射，
         * 并生成一个新的IntStream
         **/
        int[] ints = list.stream().mapToInt(Integer::parseInt).toArray();
        for (int i:ints){
            System.out.println(i);
        }


    }


}
