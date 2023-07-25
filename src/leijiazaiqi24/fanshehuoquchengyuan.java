package leijiazaiqi24;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class fanshehuoquchengyuan {
    /**
     * 通过反射获取成员变量并赋值
     * */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class<?> aClass = Class.forName("leijiazaiqi24.Student");

        Constructor<?> constructor = aClass.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        Object o = constructor.newInstance("yahaha");
        System.out.println(o);

        Field f = aClass.getDeclaredField("age");
        f.set(o,12);
        System.out.println(o);

        Field fname = aClass.getDeclaredField("name");
        fname.setAccessible(true);
        fname.set(o,"宋伸");
        System.out.println(o);
        /**
         * 包含 setAccessible(true) 方法：
         *      1.字段（Field）对象：通过反射获取类的字段对象后，
         *          可以调用 setAccessible(true) 来访问私有字段或修改 final 修饰的字段的值。
         *      2.方法（Method）对象：通过反射获取类的方法对象后，
         *          可以调用 setAccessible(true) 来调用私有方法或方法的私有成员。
         *      3.构造方法（Constructor）对象：通过反射获取类的构造方法对象后，
         *          可以调用 setAccessible(true) 来创建私有构造方法的实例。
         *
         **/
        System.out.println("-----------");
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method method:declaredMethods){
            System.out.println(method);
        }
        System.out.println("----------------");

        /**
         * m.invoke(obj) 是 Java 反射机制中用于调用方法的方法调用语法。
         * 在这里，m 是一个 Method 对象，表示一个特定的方法。
         * invoke(obj) 方法用于调用该方法，并将 obj 作为调用方法的对象。
         *
         * m: 表示一个特定的方法对象，可以通过反射获取类的方法对象，
         * 例如：Method m = SomeClass.class.getDeclaredMethod("methodName", parameterTypes);
         *
         * obj: 表示要调用方法的对象，该对象必须是声明了该方法的类的实例。
         *
         * m.invoke(obj): 这一行代码表示调用 m 所表示的方法，
         * 并将 obj 作为该方法的调用对象。这将执行该方法的代码，
         * 并返回方法的返回值（如果有的话）。
         * */
        Method m = aClass.getMethod("method1");

        Constructor<?> constructor1 = aClass.getConstructor();
        Object o1 = constructor1.newInstance();

        m.invoke(o1);
        /**
         * obj.m(): 这是普通的方法调用语法，表示直接调用对象 obj 的方法 m()。
         * 在编译时，编译器会对方法调用进行静态绑定，即确定调用的方法是哪个类中的方法，
         * 这是编译时确定的。
         * m.invoke(obj): 这是通过 Java 反射机制调用方法的方式。
         * m 是一个 Method 对象，表示一个特定的方法。
         * 通过 m.invoke(obj) 调用方法时，是在运行时动态绑定的，
         * 即在运行时根据 obj 对象的实际类型来确定调用的方法，这是运行时确定的。
         **/

        Method method2 = aClass.getMethod("method2", String.class);
        method2.invoke(o1,"yahaha");
        System.out.println("----------------");
        Method method3 = aClass.getMethod("method3", String.class, int.class);
        Object invoke = method3.invoke(o1,"ss",12);
        System.out.println(invoke);

        System.out.println("------------");
        Method function = aClass.getDeclaredMethod("function");
        function.setAccessible(true);
        function.invoke(o1);


    }
}
