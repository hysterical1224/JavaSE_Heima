package digui17;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class IOmiaoshu {
    /**
     * 流：是一种抽象概念，是对数据传输的总称。也就是说数据在设备间的传输称为流，流的本质是数据传输
     * IO流就是用来处理设备间数据传输问题的。常见的应用：文件复制；文件上传；文件下载
     */
    public static void main(String[] args) {
        /**
         * 如果操作的是纯文本文件，优先使用字符流
         * 如果操作的是图片、视频、音频等二进制文件。优先使用字节流
         * 如果不确定文件类型，优先使用字节流。字节流是万能的流
         **/

        //InputStream：这个抽象类是表示字节输入流的所有类的超类
        //OutputStream：这个抽象类是表示字节输出流的所有类的超类
        //子类名特点：子类名称都是以其父类名作为子类名的后缀
        /**
         * FileOutputStream(String name)：创建文件输出流以指定的名称写入文件
         * 使用字节输出流写数据的步骤
         * 创建字节输出流对象(调用系统功能创建了文件，创建字节输出流对象，让字节输出流对象指向文件)
         * 调用字节输出流对象的写数据方法
         * 释放资源(关闭此文件输出流并释放与此流相关联的任何系统资源)
         *
         * */
        FileOutputStream fos = null;
        byte[] bys = "abcde".getBytes(StandardCharsets.UTF_8);
        try {
            fos = new FileOutputStream(".\\fos.txt");
            fos.write(97);
            fos.write(bys,1,3);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    // 处理文件关闭异常
                    e.printStackTrace();
                }
            }
            /**
             做了三件事情：
             A:调用系统功能创建了文件
             B:创建了字节输出流对象
             C:让字节输出流对象指向创建好的文件
             */
        }



        /**
         * 字节流写数据如何实现换行
         * fos.write("hello".getBytes());
         *             fos.write("\r\n".getBytes());
         *
         *
         * */
    }
}
