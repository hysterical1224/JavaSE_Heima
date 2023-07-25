package jihe16_shuanglie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class jihegongju {
    /**
     *
     *Collections类常用方法
     *
     *方法名 说明
     * public static void sort(List list) 将指定的列表按升序排序
     * public static void reverse(List<?> list) 反转指定列表中元素的顺序
     * public static void shuffle(List<?> list) 使用默认的随机源随机排列指定的列表
     *
     *
     *
     *
     * */

    //接受的参数类型不同：Collections.sort() 方法接受一个实现了 List 接口的集合作为参数，而 Arrays.sort() 方法接受一个数组作为参数。
    //
    //修改原始集合或数组的能力不同：Collections.sort() 方法会就地对集合进行排序，即直接修改原始集合的顺序。
    // 而 Arrays.sort() 方法会对传入的数组进行排序，不会修改原始数组的内容。
    //
    //排序算法的实现不同：Collections.sort() 方法使用的是归并排序（Merge Sort）算法，而 Arrays.sort() 方法使用的是优化的快速排序（Quick Sort）算法或归并排序算法，具体取决于实现。
    //
    //对 null 元素的处理方式不同：Collections.sort() 方法允许集合中存在 null 元素，并将 null 视为小于非 null 元素。而 Arrays.sort() 方法在遇到 null 元素时会抛出 NullPointerException 异常。
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("ss");
        ls.add("sd");
        ls.add("yhh");
        ls.add("la");
        ls.add("sa");
        Collections.sort(ls);//原地排序，修改的原始集合
        System.out.println(ls);
    }
}
