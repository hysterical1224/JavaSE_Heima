package wangluobiancheng;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ClientDemo {

    public static void main(String[] args) throws IOException {
        /**
         * TCP是基于字节流的传输方式，因此使用 OutputStream 可以将数据以字节流的形式写入到TCP连接中，
         * 确保数据的可靠传输和有序接收。而 DatagramPacket 是用于UDP协议的数据报传输，
         * 它以数据报的形式进行传输，不保证数据的可靠性和顺序性。
         *
         *
         * 对于TCP套接字（Socket）来说，使用 s.getOutputStream() 可以获取一个输出流对象，
         * 它表示与远程主机建立的连接中的输出流。通过这个输出流对象，
         * 可以将数据以字节流的形式写入到TCP连接中，实现数据的发送。
         *
         * 对于UDP套接字（DatagramSocket）来说，UDP是一种无连接的协议，没有像TCP那样的连接状态。
         * 在UDP中，使用 s.send(DatagramPacket) 方法来发送数据报（DatagramPacket）到指定的目标地址和端口。
         * 在发送之前，需要将数据封装到一个 DatagramPacket 对象中，然后通过 send() 方法将其发送出去。
         *
         *
         * getOutputStream() 方法获取了与Socket对象关联的输出流，
         * 并使用 write() 方法将字符串 "Hello, TCP!" 转换为字节数组并写入输出流中，以发送给连接的对方。
         * */


        Socket s = new Socket("192.168.2.20",10000);
        OutputStream outputStream = s.getOutputStream();
        //通过 getOutputStream() 方法获取了与Socket对象关联的输出流，
        //并使用 write() 方法将字符串 "Hello, TCP!" 转换为字节数组并写入输出流中，以发送给连接的对方。
        outputStream.write("hello,TCP!".getBytes(StandardCharsets.UTF_8));

        s.close();







    }

}
