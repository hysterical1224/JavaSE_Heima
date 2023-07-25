package jihe14_15;

import java.util.Comparator;
import java.util.TreeSet;

public class ziranpaixuDemo {

    public static void main(String[] args) {
        /*
        * TreeSet 使用元素的 compareTo 方法（如果实现了 Comparable 接口）或者提供的自定义比较器（Comparator）来进行元素的排序和唯一性判断。
        * 这样可以确保在 TreeSet 中的元素是有序的，并且不重复。
        *
        *
        *
        *
        *
        *
        *
        *
        *
        * */
        TreeSet<ziranpaixu> ts = new TreeSet<>();
        ziranpaixu z1 = new ziranpaixu("ss",12);
        ziranpaixu z2 = new ziranpaixu("sa", 14);
        ziranpaixu z3 = new ziranpaixu("as",13);
        ziranpaixu z4 = new ziranpaixu("ab", 15);
        ziranpaixu z5 = new ziranpaixu("aa",15);
        ziranpaixu z6 = new ziranpaixu("ddd", 23);
        ts.add(z1);
        ts.add(z2);
        ts.add(z3);
        ts.add(z4);
        ts.add(z5);
        ts.add(z6);
        for (ziranpaixu z:ts){
            System.out.println(z.getName()+","+z.getAge());
        }

        TreeSet<ziranpaixu> treeSet = new TreeSet<>(new Comparator<ziranpaixu>() {
            @Override
            public int compare(ziranpaixu o1, ziranpaixu o2) {
                int num = o1.getName().compareTo(o2.getName());
                int num2 = num==0?o2.getAge() - o1.getAge():num;
                return num2;
            }
        });
        System.out.println("-----------------------------------------");
        ziranpaixu z11 = new ziranpaixu("ss",12);
        ziranpaixu z21 = new ziranpaixu("sa", 14);
        ziranpaixu z31 = new ziranpaixu("as",13);
        ziranpaixu z41 = new ziranpaixu("ab", 15);
        ziranpaixu z51 = new ziranpaixu("aa",15);
        ziranpaixu z61 = new ziranpaixu("ddd", 23);
        treeSet.add(z11);
        treeSet.add(z21);
        treeSet.add(z31);
        treeSet.add(z41);
        treeSet.add(z51);
        treeSet.add(z61);
        for (ziranpaixu z:treeSet){
            System.out.println(z.getName()+","+z.getAge());
        }

    }
}
