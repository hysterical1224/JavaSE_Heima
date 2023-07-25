package IOliu19;

import com.company.GuessNumber;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class cishu {
    /**
     * 案例需求
     * 实现猜数字小游戏只能试玩3次，如果还想玩，提示：游戏试玩已结束，想玩请充值(www.itcast.cn)
     * 分析步骤
     * 1. 写一个游戏类，里面有一个猜数字的小游戏
     * 2. 写一个测试类，测试类中有main()方法，main()方法中写如下代码：
     * 从文件中读取数据到Properties集合，用load()方法实现
     * 文件已经存在：game.txt
     * 里面有一个数据值：count=0
     * 通过Properties集合获取到玩游戏的次数
     * 判断次数是否到到3次了
     * 如果到了，给出提示：游戏试玩已结束，想玩请充值(www.itcast.cn)
     * 如果不到3次：
     * 次数+1，重新写回文件，用Properties的store()方法实现玩游戏
     *
     *
     * */
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        BufferedReader br = new BufferedReader(new FileReader("./game.txt"));
        prop.load(br);
        String count = prop.getProperty("count");
        System.out.println(count);
        int number = Integer.parseInt(count);
        if (number>=3){
            System.out.println("试玩结束，请充值！");
        } else {
            GuessNumber.start();

            //次数+1，重新写回文件，用Properties的store()方法实现
            number++;
            prop.setProperty("count",String.valueOf(number));
            FileWriter fw = new FileWriter("./game.txt");
            prop.store(fw,null);
            fw.close();
        }



    }




}
