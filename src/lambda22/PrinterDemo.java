package lambda22;

import java.util.Locale;

public class PrinterDemo {
    public static void main(String[] args) {
        usePrinter(s -> {
            System.out.println(s.toUpperCase(Locale.ROOT));
        });
        PrintString ps = new PrintString();
        usePrinter(ps::printUpper);

    }

    /**
    * usePrinter 方法：
     *是一个静态方法，接收一个 Printer 接口的实例，
     * 并调用该实例的 printUpperCase 方法，将字符串 "HelloWorld" 作为参数传入。
    * */
    private static void usePrinter(Printer p){
        p.printUpperCase("helloWorld!");
    }
}
