package stream23;

public class hanshujiekou {
    /**
     * 有且仅有一个抽象方法的接口
     * 如何检测一个接口是不是函数式接口
     * @FunctionalInterface
     * 放在接口定义的上方：如果接口是函数式接口，编译通过；如果不是，编译失败
     * 注意事项
     * 我们自己定义函数式接口的时候，@FunctionalInterface是可选的，就算我不写这个注解，只要保证满足函数
     * 式接口定义的条件，也照样是函数式接口。但是，建议加上该注解
     * */
    public static void main(String[] args) {

        startThread(()->System.out.println("yahaha"));

    }

    public static void startThread(Runnable r) {
        new Thread(r).start();

    }
}
