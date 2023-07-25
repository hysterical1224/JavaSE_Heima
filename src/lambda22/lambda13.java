package lambda22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class lambda13 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("cccc");
        arrayList.add("aa");
        arrayList.add("nnn");

        System.out.println("排序前："+arrayList);
        Collections.sort(arrayList,getComparator());

        Eatable e = new lambda13_1();
        useEatable(()-> {System.out.println("一天一苹果，医生远离我");
    });
    }
    private static Comparator<String> getComparator(){
        return (s1, s2)->s1.length()-s2.length();
    }
    //可以使用 Lambda 表达式来创建简单的匿名函数或函数式接口的实现。Lambda 表达式省略了行参的显式声明，编译器可以通过上下文推断出参数的类型。
    private static void useEatable(Eatable e) {
        e.eat();
    }
}
