package IOliu19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class propertiesIO {

    /**
     * void load(InputStream inStream) 从输入字节流读取属性列表（键和元素对）
     * void load(Reader reader) 从输入字符流读取属性列表（键和元素对）
     * void store(OutputStream out, String comments) 将此属性列表（键和元素对）写入此 Properties表中，以适合于使用load(InputStream)方法的格式写入输出字节流
     * void store(Writer writer, String comments) 将此属性列表（键和元素对）写入此 Properties表中，以适合使用load(Reader)方法的格式写入输出字符流
     **/
    public static void main(String[] args) throws IOException {
        //把集合中的数据保存到文件
        //        myStore();

        //把文件中的数据加载到集合
        myLoad();

    }

    private static void myLoad() throws IOException {
        Properties prop = new Properties();

        //void load(Reader reader)：
        FileReader fr = new FileReader("myOtherStream\\fw.txt");
        prop.load(fr);
        fr.close();

        System.out.println(prop);
    }

    private static void myStore() throws IOException {
        Properties prop = new Properties();

        prop.setProperty("itheima001","林青霞");
        prop.setProperty("itheima002","张曼玉");
        prop.setProperty("itheima003","王祖贤");

        //void store(Writer writer, String comments)：
        FileWriter fw = new FileWriter("myOtherStream\\fw.txt");
        prop.store(fw,null);
        fw.close();
    }

    public static void ma() {
        try (BufferedReader reader = new BufferedReader(new FileReader("config.properties"))) {
            Properties properties = new Properties();
            String line;
            while ((line = reader.readLine()) != null) {
                // 解析每行内容，例如以等号 "=" 分隔键和值
                String[] parts = line.split("=");
                if (parts.length == 2) {
                    String key = parts[0].trim();
                    String value = parts[1].trim();
                    properties.setProperty(key, value);
                }
            }

            // 可以通过 Properties 对象获取配置项的值
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            // 其他操作...
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
