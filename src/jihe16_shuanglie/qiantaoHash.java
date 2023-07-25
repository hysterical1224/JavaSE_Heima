package jihe16_shuanglie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
 * 学生成绩管理：可以使用ArrayList存储学生对象，每个学生对象包含一个HashMap，其中键为科目名称，值为对应的成绩。这样可以轻松地添加、删除和检索学生的成绩信息。
 *
 * 产品目录：可以使用ArrayList存储产品对象，每个产品对象包含一个HashMap，其中键为产品属性（如名称、价格、描述等），值为对应的属性值。这样可以方便地组织和搜索产品信息。
 *
 * 嵌套配置设置：如果你有一个具有层次结构的配置设置，可以使用ArrayList存储不同的配置组，每个组使用HashMap存储键值对。这种方式可以支持多级配置，使得配置的管理和访问更加方便。
 *
 * 表格数据存储：当你需要存储和操作类似表格的数据时，ArrayList嵌套HashMap是一个不错的选择。你可以使用ArrayList表示表格的行，每一行使用HashMap存储列名和对应的值。
 *
 * */

public class qiantaoHash {
    /**
     * 创建一个ArrayList集合，存储三个元素，每一个元素都是HashMap
     * 每一个HashMap的键和值都是String，并遍历。
     * */
    public static void main(String[] args) {
        List<HashMap<String, String>> list = new ArrayList<>();
        HashMap<String, String> hm = new HashMap<>();
        hm.put("001","ss");
        hm.put("002","sa");
        hm.put("003","sv");
        list.add(hm);
        HashMap<String, String> hm2 = new HashMap<String, String>();
        hm2.put("郭靖", "黄蓉");
        hm2.put("杨过", "小龙女");
        //把HashMap作为元素添加到ArrayList集合
        list.add(hm2);

        HashMap<String, String> hm3 = new HashMap<String, String>();
        hm3.put("令狐冲", "任盈盈");
        hm3.put("林平之", "岳灵珊");
        //把HashMap作为元素添加到ArrayList集合
        list.add(hm3);

    }
}
