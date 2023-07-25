package com.company;

public class Zmlmf {
    //世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，假如我有一张足够大的纸，它的厚度是0.1毫
    //米。请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
    public static void main(String[] args) {
        double paper = 0.1;
        int zd = 0;
        while (paper < 8844430) {
            paper = paper * 2;
            zd++;
        }
        System.out.println("折叠了" + zd + "次");
    }
}
