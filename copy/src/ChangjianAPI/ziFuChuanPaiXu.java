package ChangjianAPI;

import java.util.ArrayList;
import java.util.Arrays;

public class ziFuChuanPaiXu {
    //    有一个字符串：“91 27 46 38 50”，请写程序实现最终输出结果是：“27 38 46 50 91”
    public static void main(String[] args) {
        String s = "91 27 46 38 50";

//        StringBuilder stringBuilder = new StringBuilder(s);

        String[] s1 = s.split(" ");
        int[] number = new int[s1.length];
        for(int i=0;i< s1.length;i++){
            System.out.println(s1[i]);
            number[i] = Integer.parseInt(s1[i]);
            System.out.println(number[i]);

        }
        Arrays.sort(number);
        StringBuilder stringBuilder = new StringBuilder(Arrays.toString(number));
        System.out.println(stringBuilder);


    }

}
