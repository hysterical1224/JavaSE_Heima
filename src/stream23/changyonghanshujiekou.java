package stream23;

import java.util.function.Function;

public class changyonghanshujiekou {
    //单一输入单一输出
    //其作用是将一个类型的数据转换为另一个类型的数据。
    // Function 接口中有一个抽象方法 apply(T t)，该方法接收一个类型为 T 的参数，
    // 然后返回一个类型为 R 的结果

    /**
     * Function接口
     * Function<T,R>接口通常用于对参数进行处理，转换(处理逻辑由Lambda表达式实现)，然后返回一个新的值
     * 方法名 说明
     * R apply(T t) 将此函数应用于给定的参数
     * default Function
     * andThen(Function after)
     *  返回一个组合函数，首先将该函数应用于输入，然后将after函
     * 数应用于结果
     *
     * */
    public static void main(String[] args) {

        convert("100", Integer::valueOf);
        convert(123, String::valueOf);



    }

    private static void convert(String s, Function<String, Integer> fun){
        //把一个字符串转化为integer
        int i = fun.apply(s);
        System.out.println(i);
    }

    private static void convert(Integer i, Function<Integer, String> fun){

        String s = fun.apply(i);
        System.out.println(s);
    }

}
