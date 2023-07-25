package wangluobiancheng;

import sun.net.InetAddressCachePolicy;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class wangluobiancheng {
    /**
     * 计算机网络
     * 是指将地理位置不同的具有独立功能的多台计算机及其外部设备，通过通信线路连接起来，
     * 在网络操作系统，网络管理软件及网络通信协议的管理和协调下，实现资源共享和信息传递的计算机系统网络编程
     * 在网络通信协议下，实现网络互连的不同计算机上运行的程序间可以进行数据交换
     *
     * 网络编程三要素：
     *
     * IP地址:
     * 要想让网络中的计算机能够互相通信，必须为每台计算机指定一个标识号，
     * 通过这个标识号来指定要接收数据的计算机和识别发送的计算机，而IP地址就是这个标识号。也就是设备的标识;
     * 端口:
     * 网络的通信，本质上是两个应用程序的通信。每台计算机都有很多的应用程序，
     * 那么在网络通信时，如何区分这些应用程序呢？如果说IP地址可以唯一标识网络中的设备，
     * 那么端口号就可以唯一标识设备中的应用程序了。也就是应用程序的标识;
     * 协议:
     * 通过计算机网络可以使多台计算机实现连接，位于同一个网络中的计算机在进行连接和通信时需要遵守一定
     * 的规则，这就好比在道路中行驶的汽车一定要遵守交通规则一样。在计算机网络中，这些连接和通信的规则
     * 被称为网络通信协议，它对数据的传输格式、传输速率、传输步骤等做了统一规定，通信双方必须同时遵守
     * 才能完成数据交换。常见的协议有UDP协议和TCP协议。
     *
     *
     *InetAddress：此类表示Internet协议（IP）地址
     * 方法名 说明
     * static InetAddress getByName(String
     * host)
     *  确定主机名称的IP地址。主机名称可以是机器名称，也可以
     * 是IP地址
     * String getHostName() 获取此IP地址的主机名
     * String getHostAddress() 返回文本显示中的IP地址字符串
     **/

    public static void main(String[] args) throws UnknownHostException {
        //InetAddress 是 Java 提供的用于表示 IP 地址的类，它可以表示 IPv4 或 IPv6 地址。
        // getByName() 是 InetAddress 类的一个静态方法，用于根据给定的主机名获取对应的 IP 地址。
        InetAddress inetAddress= InetAddress.getByName("Baidu.com");

        String name = inetAddress.getHostName();
        //public String getHostName()：获取此IP地址的主机名

        String ip = inetAddress.getHostAddress();

        System.out.println("主机名："+name);
        System.out.println("IP地址："+ip);

    }


}
