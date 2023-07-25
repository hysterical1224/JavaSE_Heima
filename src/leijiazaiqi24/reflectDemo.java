package leijiazaiqi24;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class reflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<?> aClass = Class.forName("leijiazaiqi24.Student");
        Constructor<?>[] classes = aClass.getDeclaredConstructors();
        for (Constructor con : classes){
            System.out.println(con);
        }
        /**
         * 动态实例化对象：当我们在编程时不知道具体类的名称，但知道类的构造函数签名时，可以使用这种方式来动态地实例化对象。
         * 反射创建对象：反射是一种在运行时动态获取和操作类的信息的机制，可以通过构造函数的反射来创建对象。
         * 数据库映射：在使用数据库映射框架时，有时需要根据数据库中的数据来实例化对象。通过获取类的特定构造函数，然后传入对应的参数，就可以实现数据库数据到对象的映射。
         * 序列化和反序列化：在对象的序列化和反序列化过程中，需要调用类的构造函数来实例化对象。
         *
         * */

        Constructor<?> constructor = aClass.getConstructor(String.class, int.class, String.class);
        Object o = constructor.newInstance("林青霞", 30, "西安");
        System.out.println(o);
    }
}
