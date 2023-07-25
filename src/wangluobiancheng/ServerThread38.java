package wangluobiancheng;

import java.io.*;
import java.net.Socket;

public class ServerThread38 implements Runnable{
    private Socket s;

     public ServerThread38(Socket s){
        this.s = s;
    }

    @Override
    public void run() {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            int count=0;
            File file = new File("myNet\\Copy["+count+"].java");
            while (file.exists()){
                count++;
                file = new File("myNet\\Copy["+count+"].java");
                BufferedWriter bw = new BufferedWriter(new FileWriter(file));

                String line;
                while ((line=br.readLine())!=null) {
                    bw.write(line);
                    bw.newLine();
                    bw.flush();
                }

                //给出反馈
                BufferedWriter bwServer = new BufferedWriter(new
                        OutputStreamWriter(s.getOutputStream()));
                bwServer.write("文件上传成功");
                bwServer.newLine();
                bwServer.flush();

                //释放资源
                s.close();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
