package com.company;

import java.util.Scanner;

public class Three_Monks {

    //    三个和尚的最高的那个人
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //第一个和尚
        int monk1 = sc.nextInt();
        int monk2 = sc.nextInt();
        int monk3 = sc.nextInt();
        int tmp = (monk1 > monk2) ? monk1 : monk2;
        int result = (tmp > monk3) ? tmp : monk3;
        System.out.println("三个人中最高的那个是："+result);






    }
}


