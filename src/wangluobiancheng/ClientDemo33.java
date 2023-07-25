package wangluobiancheng;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ClientDemo33 {

    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.1.66", 10000);
        //向服务器发送数据
        OutputStream os = s.getOutputStream();
        os.write("hello?".getBytes(StandardCharsets.UTF_8));

        //读取服务器返回的数据
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);

        String data = new String(bys,0, len);
        System.out.println("客户端:"+data);

        s.close();







    }
}
