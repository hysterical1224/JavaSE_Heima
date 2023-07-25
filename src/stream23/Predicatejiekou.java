package stream23;

import java.util.function.Predicate;

public class Predicatejiekou {
    /**
     * Predicate 用于接收一个参数，并返回一个 boolean 值，表示参数是否满足特定条件。
     * 主要用途是进行条件判断、筛选和过滤操作，根据条件过滤集合中的元素。
     * 例子：过滤集合元素、验证输入是否符合特定规则等。
     *
     * boolean test(T t) 对给定的参数进行判断(判断逻辑由Lambda表达式实现)，返回
     * 一个布尔值
     * default Predicate negate() 返回一个逻辑的否定，对应逻辑非
     * default Predicate and(Predicate
     * other) 返回一个组合判断，对应短路与
     * default Predicate or(Predicate
     * other) 返回一个组合判断，对应短路或
     *
     * */
    public static void main(String[] args) {
        boolean b1 = checkString("hello", s->s.length()>8);
        System.out.println(b1);

        boolean b2 = checkString2("hello", s->s.length()>3,s->s.length()<3);
        System.out.println(b2);


    }

    private static boolean checkString(String s, Predicate<String> pre){
        return pre.negate().test(s);
        //return pre.negate().test(s);:
        // 在这一行代码中，首先调用了 pre.negate() 方法，该方法返回 pre 的否定值，即原来条件判断的相反结果。
        // 然后，调用 test(s) 方法，对字符串 s 进行条件判断，返回判断结果。
    }

    private static boolean checkString2(String s, Predicate<String> pre, Predicate<String> pre2){

        return pre.and(pre2).test(s);
    }


}
