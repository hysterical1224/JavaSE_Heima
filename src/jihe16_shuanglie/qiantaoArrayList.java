package jihe16_shuanglie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class qiantaoArrayList {
    /**
     * 分组数据：你可以使用 HashMap 来将数据按照某种标准进行分组，并使用 ArrayList 存储每个分组的数据项。
     * 例如，假设你有一个学校的学生信息，你可以使用学生的班级作为键，将同一班级的学生存储在一个 ArrayList 中。
     *
     * 多对多关系：当存在多个键与多个值之间的多对多关系时，HashMap 嵌套 ArrayList 可以很好地表示这种关系。
     * 例如，你可以使用 HashMap 来表示一个学生和他们选择的课程之间的关系，其中学生是键，而选择的课程是存储在 ArrayList 中的值。
     *
     * 数据聚合：如果你需要聚合具有相同属性的数据，可以使用 HashMap 嵌套 ArrayList。
     * 例如，假设你有一个销售数据集，你可以使用产品类别作为键，将相同类别的产品存储在一个 ArrayList 中。
     *
     *
     * */


    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        list.add("孙悟空");
        list.add("猪八戒");
        list.add("沙悟净");
        hashMap.put("西游记",list);

        ArrayList<String> list2 = new ArrayList<>();
        list.add("刘备");
        list.add("曹操");
        list.add("孙权");
        hashMap.put("三国演义",list2);

        ArrayList<String> list3 = new ArrayList<>();
        list.add("薛宝钗");
        list.add("贾宝玉");
        list.add("贾母");
        hashMap.put("红楼梦",list3);
        Set<String> keyset = hashMap.keySet();
        for (String key:keyset){
            System.out.println(key+":");
            ArrayList<String> arrayList = hashMap.get(key);

            for (String s:arrayList){
                System.out.println("\t"+s);
            }
        }


    }








}
