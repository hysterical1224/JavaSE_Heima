package digui17;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class zijiehuanchongliu {
    /**
     * 字节缓冲流介绍
     * lBufferOutputStream：该类实现缓冲输出流。 通过设置这样的输出流，应用程序可以向底层输出流写
     * 入字节，而不必为写入的每个字节导致底层系统的调用
     * lBufferedInputStream：创建BufferedInputStream将创建一个内部缓冲区数组。 当从流中读取或跳过
     * 字节时，内部缓冲区将根据需要从所包含的输入流中重新填充，一次很多字节
     *
     *
     *BufferedOutputStream(OutputStream out) 创建字节缓冲输出流对象
     * BufferedInputStream(InputStream in) 创建字节缓冲输入流对象
     *
     *
     * */
    public static void main(String[] args) {

        BufferedOutputStream bos = null;
        try {
            bos= new BufferedOutputStream(new FileOutputStream("./bos.txt"));
            bos.write("hello\r\n".getBytes(StandardCharsets.UTF_8));
            bos.write("world\r\n".getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bos!=null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        BufferedInputStream bis = null;
        try {
            bis = new BufferedInputStream(new FileInputStream("./fos.txt"));
            byte[] bytes = new byte[1024];
            int len;
            while ((len=bis.read(bytes))!=-1){
                System.out.println(new String(bytes, 0, len));
            }



        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }





    }




}
