package stream23;

import java.util.function.Supplier;

public class Supplierjiekou {
    /**
     * Supplier 接口：
     * Supplier 是 Java 8 引入的函数式接口之一。
     * 它是一个包含单个抽象方法 T get() 的函数式接口，用于产生一个类型为 T 的结果。
     * 该接口没有输入参数，只返回一个结果。
     * Supplier 接口通常用于生成或提供数据。通过实现 get() 方法，我们可以自定义返回结果的逻辑。
     *
     *Supplier 接口是 Java 8 引入的一个函数式接口，用于产生一个结果并没有输入参数。
     *
     * */
    public static void main(String[] args) {
        String s = getString(()-> String.valueOf(123));

        Integer i = getInteger(() -> 30);
        System.out.println(i);

    }

    //Supplier 接口是一个用于提供产生结果的逻辑的函数式接口，通过实现其 get() 方法，
    // 我们可以自定义返回结果的逻辑。
    // 它广泛用于各种场景，如产生随机数、惰性计算、延迟加载、动态生成数据等。在使用时，
    // 我们可以根据具体需求实现 get() 方法，以满足不同的功能要求

    public static String getString(Supplier<String> sup) {
        return sup.get();

    }

    //定义一个方法，返回一个整数数据
    private static Integer getInteger(Supplier<Integer> sup) {
        return sup.get();
    }



}
