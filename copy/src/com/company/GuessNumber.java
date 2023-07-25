package com.company;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
//    A. 如果猜的数字比真实数字大，提示你猜的数据大了
    //B. 如果猜的数字比真实数字小，提示你猜的数据小了
    //C. 如果猜的数字与真实数字相等，提示恭喜你猜中了
    Random random= new Random();
    int number = random.nextInt();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random= new Random();
        int number = random.nextInt(100)+1;
        System.out.println(number);
        while (true) {
            int sr = scanner.nextInt();
            if(sr>number) {
                System.out.println("大了！");

            } else if (sr <number){
                System.out.println("小了！");
            } else {
                System.out.println("猜对了！");
                break;
            }
        }

    }



}
