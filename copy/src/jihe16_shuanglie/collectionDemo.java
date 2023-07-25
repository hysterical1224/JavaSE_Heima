package jihe16_shuanglie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class collectionDemo {

    public static void main(String[] args) {
        /**
         * ArrayList存储学生对象，使用Collections对ArrayList进行排序
         * 要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
         *
         *
         * */

        ArrayList<Student> array = new ArrayList<Student>();

        //创建学生对象
        Student s1 = new Student("linqingxia", 30);
        Student s2 = new Student("zhangmanyu", 35);
        Student s3 = new Student("wangzuxian", 33);
        Student s4 = new Student("liuyan", 33);

        //把学生添加到集合
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
        Collections.sort(array, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o1.getAge()-o2.getAge();
                int num2 = num==0?o1.getName().compareTo(o2.getName()):num;
                return num2;
            }
        });
        for (int i=0;i<array.size();i++){
            System.out.println(array.get(i).getName()+"||"+array.get(i).getAge());
        }





    }
}
