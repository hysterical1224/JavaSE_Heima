package wangluobiancheng;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo38 {

    public static void main(String[] args) throws IOException {

        //创建服务器Socket对象
        ServerSocket ss = new ServerSocket(10000);

        while (true) {
            //监听客户端连接，返回一个对应的Socket对象
            Socket s = ss.accept();
            //为每一个客户端开启一个线程
            new Thread(new ServerThread38(s)).start();
        }

    }
}
