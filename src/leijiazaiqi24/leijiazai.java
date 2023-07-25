package leijiazaiqi24;

public class leijiazai {
    /**
     * 当程序要使用某个类时，如果该类还未被加载到内存中，则系统会通过类的加载，类的连接，类的初始化
     * 这三个步骤来对类进行初始化。如果不出现意外情况，JVM将会连续完成这三个步骤，
     * 所以有时也把这三个步骤统称为类加载或者类初始化
     *
     *类的加载(将类的字节码加载到内存中，并生成Class对象)：
     *  就是指将class文件读入内存，并为之创建一个 java.lang.Class 对象
     *  任何类被使用时，系统都会为之建立一个 java.lang.Class 对象
     *
     *类的连接(验证、准备和解析类的字节码，确保类能够正确链接到JVM的运行时数据区中)：
     *  验证阶段：用于检验被加载的类是否有正确的内部结构，并和其他类协调一致
     *  准备阶段：负责为类的类变量分配内存，并设置默认初始化值
     *  解析阶段：将类的二进制数据中的符号引用替换为直接引用
     *
     *类的初始化(执行类的初始化代码，包括静态变量赋值和静态代码块的执行，在类第一次被使用时进行)：
     *  类的初始化是指在类第一次使用时，JVM执行类的初始化代码，包括静态变量赋值和静态代码块的执行。
     *  类的初始化是在类的连接过程完成后进行的，而且是一个延迟加载的过程，即在类首次被使用时才进行。
     *  类的初始化过程包括执行静态变量的赋值（按照定义顺序执行），执行静态代码块。
     *  初始化过程是按照线程安全的方式进行的，确保在多线程环境下类的初始化只会执行一次。
     *
     *  初始化步骤：
     *      假如类还未被加载和连接，则程序先加载并连接该类
     *      假如该类的直接父类还未被初始化，则先初始化其直接父类
     *      假如类中有初始化语句，则系统依次执行这些初始化语句
     *      注意：在执行第2个步骤的时候，系统对直接父类的初始化步骤也遵循初始化步骤1-3
     *
     *     类的初始化是在类首次被使用时进行，
     *     包括创建类的实例、访问类的静态成员、使用反射访问类、启动类以及子类初始化时触发父类初始化等情况。
     *     初始化是一个延迟加载的过程，在类的连接完成后进行。
     * */


    public static void main(String[] args) {
        /**
         * 类加载器：
         *      类加载器（Class Loader）是Java虚拟机（JVM）的一个重要组成部分，负责将Java类的字节码加载到JVM中，
         *      并生成对应的Class对象。在Java中，类加载器实现了类的动态加载，允许在运行时动态加载和链接Java类，
         *      从而实现了Java语言的特性，例如动态加载类、反射、热部署等。
         *
         *      当加载一个类时，类加载器会首先尝试使用其父类加载器来加载类，只有在父类加载器找不到类时，
         *      才会由当前类加载器来加载。
         *
         * 启动类加载器（Bootstrap Class Loader）：它是JVM的一部分，用于加载Java的核心类库，
         * 位于JRE的jre/lib目录中。它是所有其他类加载器的祖先，是JVM中唯一不是java.lang.ClassLoader的类加载器。
         *
         * 扩展类加载器（Extension Class Loader,平台类加载器）：负责加载JRE扩展目录jre/lib/ext中的JAR文件。
         * 它是由启动类加载器加载的，并且是应用类加载器的父加载器。
         *
         * 应用类加载器（Application Class Loader）：也称为系统类加载器，负责加载应用程序classpath下的类，
         * 即用户自定义的类。它是扩展类加载器的子加载器。
         *
         * 自定义类加载器（Custom Class Loader）：除了上述三种系统提供的类加载器外，
         * Java还允许开发者通过继承java.lang.ClassLoader类，自定义自己的类加载器。
         * 自定义类加载器可以用于加载特定目录下的类文件，实现特定的类加载策略，例如网络加载、加密加载等。
         *
         *
         * JVM的类加载机制:
         *  全盘负责：就是当一个类加载器负责加载某个Class时，该Class所依赖的和引用的其他Class也将由该类加载
         *  器负责载入，除非显示使用另外一个类加载器来载入
         *  父类委托：就是当一个类加载器负责加载某个Class时，先让父类加载器试图加载该Class，只有在父类加载器
         *  无法加载该类时才尝试从自己的类路径中加载该类
         *  缓存机制：保证所有加载过的Class都会被缓存，当程序需要使用某个Class对象时，类加载器先从缓存区中搜
         *  索该Class，只有当缓存区中不存在该Class对象时，系统才会读取该类对应的二进制数据，
         *  并将其转换成Class对象，存储到缓存区
         *
         * */
        //static ClassLoader getSystemClassLoader()：返回用于委派的系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        //动态类加载：ClassLoader使得Java程序可以在运行时动态加载和链接类，
        // 这种特性被广泛用于Java的插件、热部署、反射和动态代理等场景。
        System.out.println(systemClassLoader);
        Class<ClassLoader> classLoaderClass = ClassLoader.class;
        System.out.println(classLoaderClass);


        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);
        Class<? extends ClassLoader> aClass = parent.getClass();
        System.out.println(aClass);

        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);


    }
}
