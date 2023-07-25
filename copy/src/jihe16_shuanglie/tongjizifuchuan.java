package jihe16_shuanglie;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class tongjizifuchuan {
    /**
     * 键盘录入一个字符串，要求统计字符串中每个字符串出现的次数。
     * 举例：键盘录入“aababcabcdabcde” 在控制台输出：“a(5)b(4)c(3)d(2)e(1)”
     *
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = scanner.nextLine();

        //在Java中，泛型类型参数不能是原始类型（primitive types），
        // 而必须是引用类型（reference types）。
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        for (int i=0;i<line.length();i++){
            char key =line.charAt(i);
            //得到字符串中的字符

            Integer value = treeMap.get(key);
//            System.out.println(value);
            if(value==null){
                treeMap.put(key,1);
            } else {
                value++;
                treeMap.put(key, value);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        Set<Character> keyset = treeMap.keySet();
        for (Character c:keyset) {
            Integer value = treeMap.get(c);
            stringBuilder.append(c).append('(').append(value).append(')');
        }
        String result = stringBuilder.toString();
        System.out.println(result);

    }

}
