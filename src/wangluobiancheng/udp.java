package wangluobiancheng;

public class udp {
    /**
     * Java中的UDP通信
     * UDP协议是一种不可靠的网络协议，它在通信的两端各建立一个Socket对象，但是这两个Socket只是发
     * 送，接收数据的对象，因此对于基于UDP协议的通信双方而言，没有所谓的客户端和服务器的概念
     * Java提供了DatagramSocket类作为基于UDP协议的Socket
     *
     * DatagramSocket() 创建数据报套接字并将其绑定到本机地址上的任
     * 何可用端口
     * DatagramPacket(byte[] buf,int len,InetAddress add,int port)
     * 创建数据包,发送长度为len的数据包到指定主机
     * 的指定端口
     *
     * void send(DatagramPacket p) 发送数据报包
     * void close() 关闭数据报套接字
     * void receive(DatagramPacket p) 从此套接字接受数据报包
     * */



}
