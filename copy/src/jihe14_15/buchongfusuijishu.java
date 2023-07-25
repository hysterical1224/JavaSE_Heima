package jihe14_15;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class buchongfusuijishu {
    /**
     * 编写一个程序，获取10个1-20之间的随机数，要求随机数不能重复，并在控制台输出
     *
     *
     *
     *
     * */
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        Random r = new Random();

        while (set.size()<10){
            int num = r.nextInt(20) + 1;
            set.add(num);
        }

        for(Integer i:set){
            System.out.println(i);
        }

    }


}
