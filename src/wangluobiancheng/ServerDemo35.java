package wangluobiancheng;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo35 {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);
        Socket socket = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new FileWriter("./xx.txt"));
        String line;
        while ((line= br.readLine())!=null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        bw.close();

    }
}
