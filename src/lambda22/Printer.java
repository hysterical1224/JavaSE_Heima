package lambda22;

/**
 * 类名::静态方法
 * 对象::成员方法
 *
 * 类名::成员方法
 *
 * 引用构造器，其实就是引用构造方法
 * 类名::new
 *引用构造器是 Java 中方法引用的一种形式，它允许我们通过方法引用来创建对象的实例。
 * 在构造器引用中，我们可以直接引用类的构造器，并将其作为函数式接口的实现，
 * 从而实现了通过方法引用来创建对象的实例。
 *
 * */

public interface Printer {
    //Printer 接口：
    //是一个函数式接口，它包含一个抽象方法 printUpperCase，该方法接收一个字符串参数 s。
    public void printUpperCase(String s);
}
