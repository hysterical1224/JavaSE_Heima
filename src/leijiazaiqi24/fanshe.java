package leijiazaiqi24;

import jihe16_shuanglie.Student;

public class fanshe {
    /**
     * 反射使得Java程序能够在运行时通过名称来操作类，而不需要在编译时知道类的具体信息，
     * 从而实现了一种动态性和灵活性。
     *
     *
     * 反射主要通过java.lang.Class类及其相关的Method、Field、Constructor等类来实现。
     * 通过反射，我们可以做到以下几点：
     * 获取类的信息：通过Class类可以获取类的名称、包名、父类、实现的接口等信息。
     * 获取类的成员：通过Class类的方法可以获取类的字段（属性）、方法和构造函数等成员。
     * 调用类的方法：通过反射可以在运行时动态调用类的方法。
     * 访问对象的属性：通过反射可以在运行时动态获取和修改对象的属性值。
     * 创建对象的实例：通过反射可以在运行时动态创建类的实例，实现动态代理、反射调用等功能。
     *
     * */

    //获得Class类对象的三种方式：
    //类名.class属性
    //对象名.getClass()方法
    //Class.forName(全类名)方法
    public static void main(String[] args) throws ClassNotFoundException {
        Class<Student> studentClass = Student.class;
        System.out.println(studentClass);

        Class<Student> studentClass1 = Student.class;
        System.out.println(studentClass==studentClass1);

        Student student = new Student();
        Class<? extends Student> aClass = student.getClass();
        System.out.println(studentClass == aClass);

        Class<?> aClass1 = Class.forName("jihe16_shuanglie.Student");
        System.out.println(studentClass==aClass1);


    }



}
