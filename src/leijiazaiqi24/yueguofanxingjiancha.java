package leijiazaiqi24;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class yueguofanxingjiancha {
    /**
     * 通过反射技术，向一个泛型为Integer的集合中添加一些字符串数据
     *
     * */
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<String> arrayList = new ArrayList<>();
        Class<? extends ArrayList> aClass = arrayList.getClass();
        Method a1 = aClass.getMethod("add", Object.class);
        a1.invoke(arrayList,"hello");
        a1.invoke(arrayList,"world");
        a1.invoke(arrayList,"java");
        for (String s:arrayList){
            System.out.println(s);
        }
        /**
         * 在 Java 泛型中，参数化类型在编译后会进行类型擦除，也就是说，
         * 虽然编码时指定了 ArrayList<Integer>，但是在运行时，类型信息会被擦除，
         * ArrayList<Integer> 会被当作 ArrayList<Object> 处理。
         * 因此，反射获取的方法信息也会反映这种类型擦除。
         *
         * 在调用 getMethod 方法时，需要指定方法的名称和参数类型。
         * 对于 add 方法，由于泛型擦除的影响，其参数类型在运行时会被认为是 Object 类型而不是 Integer 类型。
         *
         * 因此，为了通过反射正确地调用 add 方法，需要使用 Object.class 作为参数类型，
         * 因为 Object.class 是 Integer 类型的父类，可以接收 Integer 类型的对象作为参数。
         *
         *
         * */

    }

}
