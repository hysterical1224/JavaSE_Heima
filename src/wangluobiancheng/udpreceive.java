package wangluobiancheng;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class udpreceive {
    /**
     * 创建接收端的Socket对象(DatagramSocket)
     * 创建一个数据包，用于接收数据
     * 调用DatagramSocket对象的方法接收数据
     * 解析数据包，并把数据在控制台显示
     * 关闭接收端
     *
     * 方法名 说明
     * DatagramPacket(byte[] buf, int len) 创建一个DatagramPacket用于接收长度为len的数据包
     * 构造方法
     * 方法名 说明
     * byte[] getData() 返回数据缓冲区
     * int getLength() 返回要发送的数据的长度或接收的数据的长度
     * */
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10000);


        while (true) {
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
            ds.receive(dp);
            ds.close();

            System.out.println("数据是：" + new String(dp.getData(), 0,
                    dp.getLength()));
        }



    }



}
