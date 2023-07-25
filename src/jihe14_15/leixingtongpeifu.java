package jihe14_15;

import java.util.ArrayList;
import java.util.List;

public class leixingtongpeifu {
    /**
     * 当不确定泛型的具体类型时，例如使用List<?>表示一个未知类型的列表。
     * 当需要限制类型的上界或下界时，
     * 例如使用List<? extends Number>表示一个元素类型必须是Number或其子类的列表。
     *
     *
     * */


    public static void main(String[] args) {
        List<?> list1 = new ArrayList<Object>();
        List<?> list2 = new ArrayList<Number>();
        List<?> list3 = new ArrayList<Integer>();
        System.out.println("---------------");
        List<?> list4 = new ArrayList<Object>();
        List<? extends Number> list5 = new ArrayList<Number>();
        List<? extends Number> list6 =new ArrayList<Integer>();

        List<?super Number> list7 = new ArrayList<Object>();
        List<?super Number> list8 = new ArrayList<Number>();





    }


}
