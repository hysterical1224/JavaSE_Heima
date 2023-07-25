package ChangjianAPI;

public class Integ {
    //public static Integer valueOf(int i) 返回表示指定的 int 值的 Integer 实例
    //public static Integer valueOf(String s) 返回一个保存指定值的 Integer 对象 String
    //使用静态工厂方法valueOf()的好处是它能够重用已有的Integer对象，特别是在常用的整数范围内（-128到127之间）。
    //这意味着通过valueOf()方法创建的Integer对象可能是同一个实例，从而减少了对象的创建和内存消耗。
    //该构造函数接受一个int类型的参数，用于将整数值封装为Integer对象。
    // 然而，从Java 9开始，引入了一种更加高效和更安全的方式来创建Integer对象，即使用静态工厂方法valueOf()。
    // 这个方法具有更好的性能和更好的内部缓存机制，因此推荐使用它来创建Integer对象。
    public static void main(String[] args) {
        Integer i = Integer.valueOf("123");
        System.out.println(i);

        Integer i1 = Integer.valueOf(123);
        System.out.println(i1);
        System.out.println(i.equals(i1));
    }
}
