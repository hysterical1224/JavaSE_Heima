package wangluobiancheng;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

public class udptongxin {
    /**
     * UDP发送数据：数据来自于键盘录入，直到输入的数据是886，发送数据结束
     * UDP接收数据：因为接收端不知道发送端什么时候停止发送，故采用死循环接收
     * */

    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10000);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine())!=null){
            if("886".equals(line)){
                break;
            }

            byte[] bys = line.getBytes(StandardCharsets.UTF_8);
            DatagramPacket dp = new DatagramPacket(bys, bys.length,
                    InetAddress.getByName("192.168.1.66"), 12345);

            ds.send(dp);

        }
        ds.close();
    }
}
