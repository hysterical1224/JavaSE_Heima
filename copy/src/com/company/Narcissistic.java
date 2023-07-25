package com.company;

import java.util.Scanner;

public class Narcissistic {
//    水仙花数，指的是一个三位数，个位、十位、百位的数字立方和等于原数
    public static void main(String[] args) {
        for(int i=100; i<999;i++){
            int g = i%100;
            int s = i/10%10;
            int b = i/10/10%10;
            if(g*g*g+s*s*s+b*b*b==i){
                System.out.println(i+"是水仙花数！");
            }
        }
    }
}
