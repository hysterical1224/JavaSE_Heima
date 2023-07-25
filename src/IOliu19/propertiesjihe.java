package IOliu19;

import java.util.Properties;

public class propertiesjihe {
    /**
     * Properties介绍
     * 是一个Map体系的集合类
     * Properties可以保存到流中或从流中加载
     * 属性列表中的每个键及其对应的值都是一个字符串
     *
     * */
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.put("yhh", "ss");
        /**
         * Object setProperty(String key,String value)
         *  设置集合的键和值，都是String类型，底层调用 Hashtable方法 put
         * String getProperty(String key) 使用此属性列表中指定的键搜索属性
         * Set stringPropertyNames() 从该属性列表中返回一个不可修改的键集，其中键及其对应的
         * 值是字符串
         *
         * */



    }

}
