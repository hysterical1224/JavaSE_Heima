package jihe16_shuanglie;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map {
    /**
     * Map集合的特点
     * 键值对映射关系
     * 一个键对应一个值
     * 键不能重复，值可以重复
     * 元素存取无序
     *
     *
     * V put(K key,V value) 添加元素
     * V remove(Object key) 根据键删除键值对元素
     * void clear() 移除所有的键值对元素
     * boolean containsKey(Object key) 判断集合是否包含指定的键
     * boolean containsValue(Object value) 判断集合是否包含指定的值
     * boolean isEmpty() 判断集合是否为空
     * int size() 集合的长度，也就是集合中键值对的个数
     *
     *
     *
     * V get(Object key) 根据键获取值
     * Set keySet() 获取所有键的集合
     * Collection values() 获取所有值的集合
     * Set<Map.Entry<K,V>> entrySet() 获取所有键值对对象的集合
     *
     *
     *
     *
     *
     * */
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("00001","ss");
        map.put("00002","sb");
        System.out.println(map);



        //V get(Object key) 根据键获取值
        System.out.println(map.get("000001"));
        //没有值的时候返回空值
        System.out.println(map.get("00001"));
        //Set keySet() 获取所有键的集合
        System.out.println(map.keySet());

        //Collection values() 获取所有值的集合
        Collection<String> values = map.values();
        for (String value : values){
            System.out.println(value);
        }

        //Set<Map.Entry<K,V>> entrySet()
        //Map.Entry 接口没有对应的具体类别
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for(Map.Entry<String,String> me:entrySet){
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key+","+value);
        }
        /**
         * 键值对的存储和查找：当需要存储和快速查找键值对数据时，可以使用 HashMap。它根据键的哈希值进行存储和检索，使得查找操作的时间复杂度接近 O(1)，具有高效的性能。
         *
         * 唯一键的存储：HashMap 中的键是唯一的，每个键只能关联一个值。这使得 HashMap 可以用于去重操作，例如从列表中提取唯一的元素，并将它们存储在 HashMap 中。
         *
         * 映射关系的建立：HashMap 可以用于建立键与值之间的映射关系。例如，可以使用 HashMap 存储学生的学号和对应的成绩，以便快速查找和更新成绩信息。
         *
         * 数据缓存：由于 HashMap 的快速查找特性，它常被用作数据缓存的存储结构。可以将计算结果或其他昂贵的操作结果存储在 HashMap 中，以便后续快速访问。
         *
         *
         *
         * */




    }
}
