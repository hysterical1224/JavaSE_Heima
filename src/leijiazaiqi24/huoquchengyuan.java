package leijiazaiqi24;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class huoquchengyuan {
    /**
     * Field[] getFields() 返回所有公共成员变量对象的数组
     * Field[] getDeclaredFields() 返回所有成员变量对象的数组
     * Field getField(String name) 返回单个公共成员变量对象
     * Field getDeclaredField(String name) 返回单个成员变量对象
     * */
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("leijiazaiqi24.Student");
        Field[] fields = aClass.getDeclaredFields();
        //Field[] getFields() 返回一个包含 Field对象的数组， Field对象反映由该 Class对
        //象表示的类或接口的所有可访问的公共字段
        //Field[] getDeclaredFields() 返回一个 Field对象的数组，反映了由该 Class对象
        //表示的类或接口声明的所有字段
        for (Field f1:fields){
            System.out.println(f1);
        }

        System.out.println("-------------");
        //Field getField(String name) 返回一个 Field对象，
        // 该对象反映由该 Class对象表示的类或接口的指定公共成员字段
        //Field getDeclaredField(String name) 返回一个 Field对象，
        // 该对象反映由该Class对象表示的类或接口的指定声明字段
        Field address = aClass.getField("address");
        Constructor<?> constructor = aClass.getConstructor();
        Object o = constructor.newInstance();
        address.set(o,"西安");
        // Field提供有关类或接口的单个字段的信息和动态访问
        // void set(Object obj, Object value)
        // 将指定的对象参数中由此 Field对象表示的字段设置为指定的新值
        System.out.println(o);
    }
}
