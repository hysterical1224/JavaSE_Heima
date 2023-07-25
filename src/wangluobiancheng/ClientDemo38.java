package wangluobiancheng;

import java.io.*;
import java.net.Socket;

public class ClientDemo38 {
    /**
     * 案例需求
     * 客户端：数据来自于文本文件，接收服务器反馈
     * 服务器：接收到的数据写入文本文件，给出反馈，代码用线程进行封装，为每一个客户端开启一个线程

     * 案例分析
     * 创建客户端对象，创建输入流对象指向文件，每读入一行数据就给服务器输出一行数据，输出结束后使
     * 用shutdownOutput()方法告知服务端传输结束
     * 创建多线程类，在run()方法中读取客户端发送的数据，为了防止文件重名，使用计数器给文件名编号，
     * 接受结束后使用输出流给客户端发送反馈信息。
     * 创建服务端对象，每监听到一个客户端则开启一个新的线程接受数据。
     * 客户端接受服务端的回馈信息
     * */
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.1.66",10000);

        BufferedReader br = new BufferedReader(new FileReader("myNet\\InetAddressDemo.java"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line= br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.shutdownOutput();

        //接收反馈
        BufferedReader brClient = new BufferedReader(new
                InputStreamReader(s.getInputStream()));
        String data = brClient.readLine(); //等待读取数据
        System.out.println("服务器的反馈：" + data);

        //释放资源
        br.close();
        s.close();
    }
}
