package stream23;

import java.util.function.Function;

public class jiekoulianxi {
    /**
     * String s = "林青霞,30";
     * 请按照我指定的要求进行操作：
     * 1:将字符串截取得到数字年龄部分
     * 2:将上一步的年龄字符串转换成为int类型的数据
     * 3:将上一步的int数据加70，得到一个int结果，在控制台输出
     * 请通过Function接口来实现函数拼接
     *
     *
     * */


    public static void main(String[] args) {
        String s = "林青霞,30";
        convert(s,ss->Integer.parseInt(ss.split(",")[1]),i->i+70);
    }

    private static void convert(String s, Function<String,Integer> fun1, Function<Integer, Integer> fun2){
        int i = fun1.andThen(fun2).apply(s);
        System.out.println(i);

    }
}
