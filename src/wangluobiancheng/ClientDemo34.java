package wangluobiancheng;

import java.io.*;
import java.net.Socket;

public class ClientDemo34 {
    public static void main(String[] args) throws IOException {
        /**
         * 客户端：数据来自于键盘录入, 直到输入的数据是886，发送数据结束
         * 服务端：接收到数据在控制台输出
         * 案例分析
         * 客户端创建对象，使用键盘录入循环接受数据，接受一行发送一行，直到键盘录入886为止
         * 服务端创建对象，使用输入流按行循环接受数据，直到接受到null为止
         * */
        Socket socket = new Socket("192.168.1.66",10000);

        //数据来自于键盘录入，直到输入的数据是886，发送数据结束
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //封装输出流对象
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String line;
        while ((line=br.readLine())!=null) {
            if ("886".equals(line)) {
                break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        socket.close();

    }

}
