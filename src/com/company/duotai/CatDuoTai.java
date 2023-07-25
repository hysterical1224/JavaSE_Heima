package com.company.duotai;

public class CatDuoTai extends AnimalDuoTai{

    public int age = 20;
    public int weight = 10;

    @Override
    public void eat() {
        System.out.println("猫喜欢吃鱼！");
    }

    public void playGame(){
        System.out.println("狗捉迷藏！");
    }
}
