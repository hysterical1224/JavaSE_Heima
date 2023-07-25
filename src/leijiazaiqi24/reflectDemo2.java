package leijiazaiqi24;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class reflectDemo2 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("leijiazaiqi24.Student");
        Constructor<?> constructor = aClass.getDeclaredConstructor(String.class);
        /**
         * 暴力反射（Violent Reflection）是指使用 Java 反射机制绕过访问控制权限，
         * 直接访问和修改对象的私有字段、方法和构造函数等成员，而不遵循原本的访问控制规则。
         * 在正常情况下，Java 中的字段、方法和构造函数可以通过访问控制修饰符
         * （如 private、protected、public、default）限制其可见性和可访问性，
         * 只能在合适的上下文中访问和使用。
         *
         *
         * */


        //constructor.setAccessible(true) 是使用反射进行暴力反射时的一个重要步骤。它的目的是设置构造函数、方法或字段的可访问性为 true，从而绕过类的访问控制权限，允许在运行时访问和操作类的私有成员。
        //
        //在正常情况下，Java 中的构造函数、方法和字段可以使用访问控制修饰符（如 private、protected、public、default）来限制其可见性和可访问性。这样做的目的是为了控制类的访问范围，保护类的内部实现细节，以及提供封装和安全性。
        //
        //然而，通过反射机制，可以绕过访问控制权限，直接访问和操作类的私有成员。默认情况下，反射的 getDeclaredField()、getDeclaredMethod() 和 getDeclaredConstructor() 等方法无法访问私有成员，会抛出 IllegalAccessException 异常。
        //
        //为了解决这个问题，可以使用 setAccessible(true) 方法将类的私有成员设置为可访问。当 setAccessible(true) 被调用后，即使是私有成员，也可以在运行时通过反射来访问和修改它们，而不会触发访问控制权限的检查。
        //
        //需要注意的是，暴力反射绕过了 Java 的访问控制规则，可能会导致安全问题和不稳定性。因此，在正常的业务逻辑中，应该遵循类的访问控制规则，避免滥用暴力反射，以保证代码的稳定性和安全性。仅在特定的场景和特殊需求下使用暴力反射，同时谨慎处理相关异常。
        constructor.setAccessible(true);
        Object o = constructor.newInstance("yahaha");
        System.out.println(o);

    }
}
