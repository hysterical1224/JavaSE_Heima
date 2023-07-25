package jihe16_shuanglie;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StuDemo {
    /**
     * 需求：
     *         创建一个HashMap集合，键是学号(String)，值是学生对象(Student)。存储三个键值对
     * 元素，并遍历
     *
     *     思路：
     *         1:定义学生类
     *         2:创建HashMap集合对象
     *         3:创建学生对象
     *         4:把学生添加到集合
     *         5:遍历集合
     *             方式1：键找值
     *             方式2：键值对对象找键和值
     *
     *
     *
     * */


    public static void main(String[] args) {
        Map<String, Student> map = new HashMap<>();
        map.put("00001", new Student("ss", 12));
        map.put("00002", new Student("sa", 13));
        Set<String> sno = map.keySet();
        for (String no : sno){
            Student student = map.get(no);
            System.out.println(no + "," + student.getName() + "," +
                    student.getAge());

        }
    }

}
