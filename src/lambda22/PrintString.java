package lambda22;

import java.util.Locale;

public class PrintString {
    public void printUpper(String s){

        //定义了一个方法 printUpper，该方法接收一个字符串参数 s，
        // 将其转换为大写形式，并在控制台输出结果。
        String result = s.toUpperCase(Locale.ROOT);
        System.out.println(result);
    }
}
