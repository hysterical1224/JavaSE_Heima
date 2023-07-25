package lambda22;

public class lambda14_1 {


    public static void main(String[] args) {
        useAddable((int x, int y)->{
            return x+y;
        });

        useAddable((x, y) -> {
            return x + y;
        });

        //Lambda 表达式的实参（参数值）是在函数调用中传递的，
        // 而不是在 Lambda 表达式的语法结构中指定的。
        // 这种设计使得 Lambda 表达式可以灵活地适应不同的函数调用，
        // 并且可以根据需要传递不同的参数值。
        /**
         * 省略的规则
         * 参数类型可以省略。但是有多个参数的情况下，不能只省略一个
         * 如果参数有且仅有一个，那么小括号可以省略
         * 如果代码块的语句只有一条，可以省略大括号和分号，和return关键字
         * */

        /**
         * 使用Lambda必须要有接口，并且要求接口中有且仅有一个抽象方法
         * 必须有上下文环境，才能推导出Lambda对应的接口
         * 根据局部变量的赋值得知Lambda对应的接口
         * Runnable r = () -> System.out.println("Lambda表达式");
         * 根据调用方法的参数得知Lambda对应的接口
         *
         * */

        /**
         * lambda和匿名内部类的区别：
         *
         * 所需类型不同
         * 匿名内部类：可以是接口，也可以是抽象类，还可以是具体类
         * Lambda表达式：只能是接口
         * 使用限制不同
         * 如果接口中有且仅有一个抽象方法，可以使用Lambda表达式，也可以使用匿名内部类
         * 如果接口中多于一个抽象方法，只能使用匿名内部类，而不能使用Lambda表达式
         * 实现原理不同
         * 匿名内部类：编译之后，产生一个单独的.class字节码文件
         * Lambda表达式：编译之后，没有一个单独的.class字节码文件。对应的字节码会在运行的时候动态生成
         * */


    }

    private static void useAddable(Addable a) {
        int sum = a.add(10,20);
        System.out.println(sum);
    }
}
