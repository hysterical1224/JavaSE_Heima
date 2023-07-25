package com.company;

import java.util.Scanner;

public class reverseList {
//    定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果
//例如，键盘录入 abc，输出结果 cba
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String reverse = reverse(s);
        System.out.println(reverse);

    }
    public static String reverse(String s){
        String revers = "";
        for(int i=s.length()-1;i>=0;i--){
            revers += s.charAt(i);
        }
        return revers;
    }



}
