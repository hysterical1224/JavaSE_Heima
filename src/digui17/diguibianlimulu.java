package digui17;

import java.io.File;

public class diguibianlimulu {


    public static void main(String[] args) {
        File srcFile = new File("F:\\practice");

        getAllFilePath(srcFile);
    }

    public static void getAllFilePath(File f) {
        File[] fileArray = f.listFiles();
        //获取给定的File目录下所有的文件或者目录的File数组

        if (fileArray !=null) {
            for (File file:fileArray){
                //遍历该File数组，得到每一个File对象
                if (file.isDirectory()){
                    //判断File对象是否是目录
                    getAllFilePath(file);
                } else {
                    System.out.println(file.getAbsolutePath());
                }

            }

        }


    }
}
