package com.company.Players;

public class Basketball extends Athlete{

    public Basketball(){}

    public Basketball(String name, int age){
        super(name,age);
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃牛肉，喝牛奶");

    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习如何运球和投篮");

    }
}
