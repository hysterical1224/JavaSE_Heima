package wangluobiancheng;

import java.io.*;
import java.net.Socket;

public class ClientDemo35 {
    public static void main(String[] args) throws IOException {
        /**
         * 客户端：数据来自于键盘录入，直到输入的数据是886,发送数据结束
         * 服务端：接受到的数据写入文本文件中
         *
         * */
        Socket socket = new Socket("192.168.1.66",10000);
        /**
         * 客户端可以使用输出流向服务器发送数据，服务器可以使用输入流从客户端接收数据。
         * 同样，服务器可以使用输出流向客户端发送数据，客户端可以使用输入流从服务器接收数据。
         * */
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String line;
        while ((line= br.readLine())!=null) {
            if ("886".equals(line)){
                break;
            }
            bw.write(line);
            bw.newLine();

        }
        bw.close();


    }
}
