package wangluobiancheng;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

    /**
     * 方法名 说明
     * ServletSocket(int port) 创建绑定到指定端口的服务器套接字
     * 方法名 说明
     * Socket accept() 监听要连接到此的套接字并接受它
     *
     *
     * */

    public static void main(String[] args) throws IOException {
        //创建服务器端的Socket对象(ServerSocket)
        //ServerSocket(int port) 创建绑定到指定端口的服务器套接字
        /**
         * ServerSocket 对象来监听指定的端口，以等待客户端的连接请求。
         * 通过调用 new ServerSocket(port) 构造函数可以创建一个新的 ServerSocket 对象，并将其绑定到指定的端口上。
         * */
        ServerSocket ss = new ServerSocket(10000);
        /**
         * 等待连接请求：服务器需要等待客户端的连接请求，以便接受客户端的连接。通过调用 accept() 方法，服务器可以阻塞在这一步，直到有客户端连接进来。
         *
         * 建立独立的连接：每当有客户端连接进来，accept() 方法会返回一个新的 Socket 对象，
         * 用于与该客户端进行通信。这个新的 Socket 对象与客户端的套接字建立了一个独立的连接，可以独立处理与该客户端的数据交互。
         *
         * 多线程处理连接：通常，服务器需要能够同时处理多个客户端连接。通过在 accept() 方法处使用多线程，
         * 每当有新的连接到来时，可以创建一个新的线程来处理该连接，从而实现多客户端并发处理。
         **/

        Socket socket = ss.accept();
        InputStream is = socket.getInputStream();
        //获取输入流，读数据，并把数据显示在控制台

        byte[] bys = new byte[1024];
        int len  = is.read(bys);

        String data = new String(bys, 0, len);
        //得到的是byte，需要转化为String
        System.out.println("数据是：" + data);

        //释放资源
        socket.close();
        ss.close();





    }

}
