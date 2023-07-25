package jihe16_shuanglie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGaiJing {

    public static void main(String[] args) {

        ////创建HashMap，键是编号，值是牌
        HashMap<Integer, String> hm = new HashMap<>();

        //存储的是编号
        ArrayList<Integer> arrayList = new ArrayList<>();

        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q",
                "K", "A", "2"};
        //numbers已经给出了顺序，与颜色进行合并，用index存储顺序，
        // index与String通过treemap进行绑定


        int index = 0;
        for (String number:numbers){
            for (String color:colors) {
                hm.put(index, color+number);
                arrayList.add(index);
                index++;
            }
        }
        hm.put(index,"小王");
        arrayList.add(index);
        index++;
        hm.put(index,"大王");
        arrayList.add(index);
        index++;


        //洗牌（洗的是编号）
        Collections.shuffle(arrayList);
        TreeSet<Integer> p1 = new TreeSet<>();
        TreeSet<Integer> p2 = new TreeSet<>();
        TreeSet<Integer> p3 = new TreeSet<>();
        TreeSet<Integer> fenzhi = new TreeSet<>();
        for (int i=0; i<arrayList.size(); i++){
            int x = arrayList.get(i);
            if(i>=arrayList.size()-3){
                fenzhi.add(x);
            } else if (i%3==0){
                p1.add(x);
            } else if (i%3==1){
                p2.add(x);
            } else if (i%3==2){
                p3.add(x);
            }
        }


        //存储的是顺序,需要传入顺序与牌的映射
        lookPoker("ss",p1,hm);
        lookPoker("sa",p2,hm);
        lookPoker("sd",p3,hm);
        lookPoker("底牌",fenzhi,hm);


    }


    public static void lookPoker(String name, TreeSet<Integer> treeSet,
                                 HashMap<Integer,String> hm) {
        System.out.println(name+"的牌是:");
        for (Integer key:treeSet){
            String poker = hm.get(key);
            System.out.print(poker+"");
        }
        System.out.println();



    }
}
