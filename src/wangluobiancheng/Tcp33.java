package wangluobiancheng;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Tcp33 {
    /**
     * 客户端创建对象，使用输出流输出数据
     * 服务端创建对象，使用输入流接受数据
     * 服务端使用输出流给出反馈数据
     * 客户端使用输入流接受反馈数据
     * */
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);
        Socket s = ss.accept();

        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);

        String data = new String(bys, 0, len);
        System.out.println("服务器："+data);

        OutputStream os = s.getOutputStream();
        os.write("数据已收到".getBytes(StandardCharsets.UTF_8));
        //释放资源
        ss.close();
    }

}
