package com.company;

import java.util.Scanner;

public class BianLi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        String s = scanner.nextLine();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='A'&&ch<='Z'){
                bigCount++;
            } else if (ch>='a'&&ch<='z') {
                smallCount++;
            } else if (ch>='0'&&ch<='9') {
                numberCount++;
            }
        }
        System.out.println("大写字母："+bigCount+"个");
        System.out.println("小写字母："+smallCount+"个");
        System.out.println("数字："+numberCount+"个");
    }
}
