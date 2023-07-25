package digui17;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    /**
     * 它是文件和目录路径名的抽象表示
     * 文件和目录是可以通过File封装成对象的
     * 对于File而言，其封装的并不是一个真正存在的文件，仅仅是一个路径名而已。
     * 它可以是存在的，也可以是不存在的。将来是要通过具体的操作把这个路径的内容转换为具体存在的
     *
     * */
    //File(String pathname) 通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例
    //File(String parent, String child) 从父路径名字符串和子路径名字符串创建新的 File实例
    //File(File parent, String child) 从父抽象路径名和子路径名字符串创建新的 File实例
    /**
     * 通过创建 File 实例，我们可以在 Java 程序中对文件和目录进行操作，如创建、删除、重命名、读取和写入等。
     * 它提供了一个抽象的表示方式，使得我们可以在程序中与文件系统进行交互，并对文件和目录进行管理。
     * */
    public static void main(String[] args) throws IOException {
        File f1 =new File("F:\\Java学习\\01-JavaSE基础\\day17-File&递归&字节流\\笔记");
        // 路径名字符串是指以字符串的形式表示文件或目录的路径。
        // 抽象路径名是指使用特定类（如Java中的 File 类）提供的对象来表示文件或目录的路径。
        System.out.println(f1);


        //File(String parent, String child)：从父路径名字符串和子路径名字符串创建新的
        //File实例。
        File f2 = new File("F:\\Java学习\\01-JavaSE基础\\day17-File&递归&字节流\\笔记","hello.txt");
        System.out.println(f2);


        //需求3：我要在E:\\itcast目录下创建一个多级目录JavaWEB\\HTML
        File f3 = new File("E:\\itcast\\JavaWEB\\HTML");
        //        System.out.println(f3.mkdir());
        System.out.println(f3.mkdirs());
        System.out.println("--------");

        //需求4：我要在E:\\itcast目录下创建一个文件javase.txt
        File f4 = new File("E:\\itcast\\javase.txt");
        //        System.out.println(f4.mkdir());
        System.out.println(f4.createNewFile());
        /**
         * f4.createNewFile() 将会在指定的路径 "path/to/file.txt" 中创建一个空文件。
         * 如果文件已经存在，或者路径中的目录不存在，或者没有足够的权限来创建文件，则 createNewFile() 方法将会抛出 IOException。
         *
         *
         *
         *使用 BufferedWriter：可以使用 BufferedWriter 类来创建文件并写入数据。当你使用 BufferedWriter 时，如果指定的文件不存在，它会自动创建该文件。
         **/




    }


}
