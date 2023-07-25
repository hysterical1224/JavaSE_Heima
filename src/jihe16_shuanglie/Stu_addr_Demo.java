package jihe16_shuanglie;

import java.util.HashMap;
import java.util.Set;

public class Stu_addr_Demo {


    public static void main(String[] args) {
        HashMap<Stu_addr, String> hm = new HashMap<>();
        hm.put(new Stu_addr("ss",12),"Beijing");
        hm.put(new Stu_addr("sa",13), "Wuhan");
        hm.put(new Stu_addr("sb",16), "Wuhan");
        hm.put(new Stu_addr("sc",14), "Wuhan");
        hm.put(new Stu_addr("sv",11), "Wuhan");
        Set<Stu_addr> stu_addrSet = hm.keySet();
        for (Stu_addr stu:stu_addrSet) {
            String value = hm.get(stu);
            System.out.println(stu.getName()+","+stu.getAge());
        }
    }
}
