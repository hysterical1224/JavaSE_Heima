package stream23;

import java.util.function.Consumer;

public class xiaofeizhejiekou {
    /**
     * Consumer接口
     * Consumer接口也被称为消费型接口，它消费的数据的数据类型由泛型指定
     *
     *
     * Consumer 是 Java 中的一个函数式接口，它属于 Java.util.function 包，
     * 用于表示接收一个参数并进行处理的操作。该接口包含一个抽象方法 void accept(T t)，
     * 用于接收类型为 T 的参数，并在方法中对该参数进行相应的处理。
     *
     * Consumer 接口在很多场景下非常有用，例如遍历集合、处理元素、打印输出等。
     * 它可以作为方法的参数传递，也可以与其他函数式接口进行组合使用，如 andThen() 方法。
     * */
    public static void main(String[] args) {
        /**
         * 我们定义了两个 Consumer 对象：printConsumer 和 uppercaseConsumer，
         * 分别用于打印输出和转换字符串为大写。我们使用 accept() 方法来执行 Consumer 的操作。
         * 在组合操作中，我们使用 andThen() 方法将两个 Consumer 进行组合，
         * 形成一个新的 Consumer，先执行前一个 Consumer 的操作，再执行后一个 Consumer 的操作。
         *
         * void accept(T t) 对给定的参数执行此操作
         * default Consumer andThen(Consumer
         * after)
         *  返回一个组合的Consumer，依次执行此操作，然后执行
         * after操作
         **/
        operatorString("yahaha",s-> System.out.println(s),s-> System.out.println(s));

    }

    private static void operatorString(String name, Consumer<String> con1, Consumer<String> con2){
        con1.accept(name);
        con1.andThen(con2).accept(name);
    }
}
