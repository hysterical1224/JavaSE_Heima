package lambda22;

public class fnagfayinyong {
    /**
     * 方法引用：System.out::println 是方法引用的语法，它是一种简化的方法调用形式，
     * 用于引用已经存在的方法作为一个函数式接口的实例。在这种情况下，System.out.println 是一个已经存在的方法，
     * 它可以被引用并传递给函数式接口或使用方法引用来调用。
     *
     * 方法调用：System.out.println() 是直接调用 System.out 对象的 println 方法。
     * 它是在代码中直接调用方法的方式，会执行方法中的逻辑并输出结果。
     *
     * 区别：
     *
     * 语法形式：System.out::println 是方法引用的语法形式，用于引用已存在的方法。System.out.println() 是直接调用方法的语法形式。
     * 使用场景：方法引用适用于将方法作为函数式接口的实例进行传递，可以用于函数式编程和 lambda 表达式中。
     * 方法调用适用于直接调用方法的场景，可以用于执行方法中的逻辑和输出结果。
     * 参数传递：方法引用可以将方法作为参数进行传递，而方法调用则是直接调用方法并传递参数。
     * 总的来说，System.out::println 是一种方法引用的形式，用于引用 System.out 的 println 方法，
     * 而 System.out.println() 是直接调用 System.out 的 println 方法的方式。
     * 方法引用适用于函数式编程和传递方法的场景，而方法调用适用于直接执行方法逻辑的场景。
     * */


    //方法引用符
    //:: 该符号为引用运算符，而它所在的表达式被称为方法引用
    //推导与省略
    //如果使用Lambda，那么根据“可推导就是可省略”的原则，无需指定参数类型，也无需指定的重载形式，
    //它们都将被自动推导
    //如果使用方法引用，也是同样可以根据上下文进行推导
    //方法引用是Lambda的孪生兄弟
    /**
     * 引用类方法，其实就是引用类的静态方法
     * 格式
     * 类名::静态方法
     * 范例
     * Integer::parseInt
     * Integer类的方法：public static int parseInt(String s) 将此String转换为int类型数据
     * 练习描述
     * 定义一个接口(Converter)，里面定义一个抽象方法 int convert(String s);
     * 定义一个测试类(ConverterDemo)，在测试类中提供两个方法
     * */
    public static void main(String[] args) {
        useConverter(Integer::parseInt);

    }

    public static void useConverter(Converter c) {
        int number = c.convert("8888");
        System.out.println(number);
    }



}
