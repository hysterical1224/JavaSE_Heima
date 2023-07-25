package IOliu19;

import java.io.*;

public class yjh {
    public static void main(String[] args) {
        File file = new File("F:\\practice");
        File[] files = file.listFiles();
        File copyfile = new File("F:\\practice\\copy");
        copyfiles(files,copyfile);
    }

    private static void copyfiles(File[] files, File copyfile) {
        if(files!=null){
            for (File f:files){
                if(f.isDirectory()){
                    File[] files1 = f.listFiles();
                    File file = new File(copyfile, f.getName());
                    if(file.mkdirs()) {
                        System.out.println("文件夹创建成功！");
                    } else {
                        System.out.println("文件夹创建失败！");
                    }

                    copyfiles(files1, file);
                    //System.out.println(files1.length);
                }
                else {
                    copyfile(f,copyfile);
                }
            }
        }
    }


    private static void copyfile(File f, File copyfile) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(copyfile+"\\"+f.getName()));
            br = new BufferedReader(new FileReader(f));
            String line;
            while ((line= br.readLine())!=null){
                bw.write(line);
                bw.newLine();
            }
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
