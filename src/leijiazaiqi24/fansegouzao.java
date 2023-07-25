package leijiazaiqi24;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class fansegouzao {
    /**
     * 在Java中，可以通过getConstructors()、getConstructor()、getDeclaredConstructors()
     * 和getDeclaredConstructor()等方法来获取构造方法对象。
     * 这些方法可以用于获取类中的构造方法信息，并通过构造方法对象实例化对象。
     * */
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /**
         * Class.forName() 方法默认情况下使用的是当前线程的上下文类加载器来加载类。
         * 如果类无法在当前类路径下找到，或者要加载的类位于自定义的类加载器之外，
         * 就可以通过Class.forName(String className, boolean initialize, ClassLoader loader)
         * 方法的第三个参数指定类加载器来加载类。
         *
         *
         * */

        Class<?> aClass = Class.forName("jihe16_shuanglie.Student");
        Constructor<?>[] constructors = aClass.getConstructors();
        ///Constructor<?>[] getConstructors() 返回一个包含 Constructor对象的数组，
        //Constructor对象反映了由该 Class对象表示的类的所有公共构造函数
        for (Constructor c: constructors){
            System.out.println(c);
        }

        //Constructor<?>[] getDeclaredConstructors() 返回反映由该 Class对象表示的类
        //声明的所有构造函数的 Constructor对象的数组
        Constructor<?>[] declaredConstructor = aClass.getDeclaredConstructors();
        for (Constructor con : declaredConstructor){
            System.out.println(con);
        }
        //Constructor<T> getConstructor(Class<?>... parameterTypes) 返回一个
        //        Constructor对象，该对象反映由该 Class对象表示的类的指定公共构造函数
        //Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes) 返回
        //        一个 Constructor对象，该对象反映由此 Class对象表示的类或接口的指定构造函数
        Constructor<?> constructor = aClass.getConstructor();
        //Constructor提供了一个类的单个构造函数的信息和访问权限
        //T newInstance(Object... initargs) 使用由此 Constructor对象表示的构造函数，
        //        使用指定的初始化参数来创建和初始化构造函数的声明类的新实例
        Object o = constructor.newInstance();
        System.out.println(o);


    }

}
