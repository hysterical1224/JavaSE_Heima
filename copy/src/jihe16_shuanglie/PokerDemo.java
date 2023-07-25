package jihe16_shuanglie;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class PokerDemo {
    /**
     * 通过程序实现斗地主过程中的洗牌，发牌和看牌
     * 要求：对牌进行排序
     *
     * */

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        /**
         * //往牌盒里面装牌
         *
         *             ♦2,♦3,♦4...♦K,♦A
         *             ♣2,...
         *             ♥2,...
         *             ♠2,...
         *             小王，大王
         *
         *
         *
         *
         * */
        //花色
        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
                "Q", "K", "A"};
        for (String color:colors){
            for (String number:numbers)
                arrayList.add(color+number);
        }

        arrayList.add("大王");
        arrayList.add("小王");


        //进行洗牌
        Collections.shuffle(arrayList);

        //发牌
        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();

        ArrayList<String> pfenzhi = new ArrayList<>();
        for (int i=0; i<arrayList.size(); i++){
            String poker = arrayList.get(i);
            if (i>=arrayList.size()-3){
                pfenzhi.add(poker);
            } else if (i%3==0){
                p1.add(poker);
            } else if (i%3==1){
                p2.add(poker);
            } else if (i%3==2){
                p3.add(poker);
            }
        }
        //发牌结束,各个玩家查看自己的牌
        lookPoker("1",p1);
        lookPoker("2",p2);
        lookPoker("3",p3);
        lookPoker("三支",pfenzhi);








    }

    public static void lookPoker(String name, ArrayList<String> arrayList) {
        System.out.println(name+"的牌是：");
        for (String poker:arrayList){
            System.out.print(poker+"");
        }
        System.out.println();

    }
}
