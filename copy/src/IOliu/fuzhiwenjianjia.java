package IOliu19;

import java.io.*;

public class fuzhiwenjianjia {
    /**
     * 1. 创建数据源目录File对象
     * 2. 获取数据源目录File对象的名称
     * 3. 创建目的地目录File对象，路径由(模块名+第2步获取的名称)组成
     * 4. 判断第3步创建的File是否存在，如果不存在，就创建
     * 5. 获取数据源目录下所有文件的File数组
     * 6. 遍历File数组，得到每一个File对象，该File对象，其实就是数据源文件
     * 7. 获取数据源文件File对象的名称
     * 8. 创建目的地文件File对象，路径由(目的地目录+第7步获取的名称)组成
     * 9. 复制文件
     *   由于不清楚数据源目录下的文件都是什么类型的，所以采用字节流复制文件
     *   采用参数为File的构造方法
     * */
    public static void main(String[] args) {
        File f = new File("F:\\practice");
        String srcFolderName = f.getName();
        System.out.println(srcFolderName);

        //创建移动到的File根对象，路径名是模块名+itcast组成(myCharStream\\itcast)
        File destFolder = new File("F:\\practice\\myCharStream",srcFolderName);
        if (!destFolder.exists()){
            destFolder.mkdirs();
        }
        blDirectory(f,destFolder);


    }

    public static void blDirectory(File file, File destfile) {
        File[] listFiles = file.listFiles();
        if (listFiles !=null){

            for (File srcFile: listFiles){

                if (srcFile.isDirectory()){
                    File dest = new File(destfile,srcFile.getName());
                    if (!dest.exists()){
                        dest.mkdirs();
                    }
                    blDirectory(srcFile,dest);
                } else {
                    File dest = new File(destfile,srcFile.getName());
                    //将file写入到destfile
                    copyFile(srcFile, dest);
                }
            }
        }

    }

    public static void copyFile(File file, File destfile) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(destfile));
            br = new BufferedReader(new FileReader(file));
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
