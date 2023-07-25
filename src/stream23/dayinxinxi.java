package stream23;

import java.util.function.Consumer;

public class dayinxinxi {

    public static void main(String[] args) {
        String[] strArrays = {"林青霞,30", "张曼玉,35", "王祖贤,33"};
        printInfo(strArrays, (s)->System.out.println("姓名"+s.split(",")[0]),s-> System.out.println("年龄"+Integer.parseInt(s.split(",")[1])));

    }

    private static void printInfo(String[] strArray, Consumer<String> con1,Consumer<String>con2){
        for(String str:strArray) {
            con1.andThen(con2).accept(str);
        }
    }
}
