package leijiazaiqi24;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class important {
    /**
     * 通过反射运行配置文件中指定类的指定方法:
     *  通过反射运行配置文件中指定类的指定方法，可以实现在运行时动态加载和调用类的方法，
     *  从而实现灵活的配置和功能扩展。
     *
     *
     * */

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /**
         * Properties 是 Java 中的一个类，它是 java.util.Properties 类的一个实例。它用于管理配置信息，通常用于读取和保存配置文件中的键值对数据。Properties 类继承自 Hashtable，并且特别适合用于读取和写入配置文件。
         * 主要用途包括：
         * 读取配置文件：Properties 可以用于读取配置文件中的键值对数据，将配置信息加载到内存中，以便在程序中使用。
         * 保存配置信息：Properties 可以用于将键值对数据保存到配置文件中，从而实现将程序中的配置信息持久化。
         *
         * */
        Properties properties = new Properties();
        FileReader fr = new FileReader("myReflect\\class.txt");
        /**
         * 一个 Properties 对象 prop，并使用它读取和保存配置文件 config.properties 中的配置信息。
         * load() 方法用于加载配置文件，getProperty() 方法用于读取配置信息，setProperty()
         * 方法用于修改配置信息，store() 方法用于将配置信息保存到文件中。
         *
         * */
        properties.load(fr);
        /**
         * properties.load() 方法可以从多种类型的输入流中加载数据，包括：
         * 文件输入流（FileInputStream）：从文件中加载配置数据。
         * 类路径资源输入流（ClassLoader.getResourceAsStream()）：从类路径下的资源文件中加载配置数据。
         * 网络输入流（URL.openStream()）：从网络中加载配置数据。
         * 字符串输入流（StringReader）：从字符串中加载配置数据。
         * 缓冲输入流（BufferedInputStream）：从其他输入流中加载配置数据，并提供缓冲功能，加快读取速度。
         **/
        fr.close();

        String className = properties.getProperty("className");
        String methodName =properties.getProperty("methodName");

        Class<?> aClass = Class.forName(className);
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
        Object o = declaredConstructor.newInstance();
        Method declaredMethod = aClass.getDeclaredMethod(methodName);
        Object invoke = declaredMethod.invoke(o);


    }
}
