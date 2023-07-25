package stream23;

import java.util.ArrayList;

public class streamzhongjiecaozuo {
    /**
     * 终结操作的意思是，执行完此方法之后，Stream流将不能再执行其他操作。
     * 方法名 说明
     * void forEach(Consumer action) 对此流的每个元素执行操作
     * long count() 返回此流中的元素数
     * */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");

        long count = list.stream().filter(s -> s.startsWith("张")).count();
        System.out.println(count);
    }
}
