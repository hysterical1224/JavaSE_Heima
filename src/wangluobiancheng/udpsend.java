package wangluobiancheng;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class udpsend {
    /**
     * 发送数据的步骤
     * 创建发送端的Socket对象(DatagramSocket)
     * 创建数据，并把数据打包
     * 调用DatagramSocket对象的方法发送数据
     * 关闭发送端
     *
     *
     * DatagramSocket() 创建数据报套接字并将其绑定到本机地址上的任
     * 何可用端口
     * DatagramPacket(byte[] buf,int len,InetAddress
     * add,int port)
     *  创建数据包,发送长度为len的数据包到指定主机
     * 的指定端口
     * 构造方法
     * 方法名 说明
     * void send(DatagramPacket p) 发送数据报包
     * void close() 关闭数据报套接字
     * void receive(DatagramPacket p) 从此套接字接受数据报包
     *
     *
     *UDP套接字（UDP Socket）是基于UDP协议的网络通信的一种编程接口，
     * 用于在计算机网络中进行无连接的数据传输。
     *套接字是一个抽象的概念，它提供了一组API（Application Programming Interface，
     * 应用程序编程接口）来实现网络通信。套接字可以理解为网络通信的端点，用于发送和接收数据。
     * 在UDP协议中，套接字提供了基于UDP的通信接口。
     * 套接字提供了基于UDP的通信接口。
     * */
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(20000);
        //创建数据，并把数据打包
        //DatagramPacket(byte[] buf, int length, InetAddress address, int port)
        //构造一个数据包，发送长度为 length的数据包到指定主机上的指定端口号。

        byte[] bytes = "hello,udp!".getBytes(StandardCharsets.UTF_8);
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length, InetAddress.getByName("192.168.1.66"),10086);
        //在发送端:
        // 如果 length 参数大于缓冲区中实际数据的长度，那么只会发送缓冲区中从索引 0 到 length-1 的数据。
        // 如果 length 参数小于缓冲区的大小，那么发送操作只会发送指定长度的数据，避免发送不必要的字节。
        //
        //在接收端:
        // 通过 length 参数告知系统接收缓冲区的大小，这样系统会确保接收到的数据不会超过指定长度。
        // 如果接收到的数据超过了 length 参数指定的大小，超出部分的数据将被截断或丢弃。
        ds.send(dp);
        ds.close();
    }

}
