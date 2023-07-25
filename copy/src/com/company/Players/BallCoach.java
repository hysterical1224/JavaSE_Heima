package com.company.Players;

public class BallCoach extends Coach{

    public BallCoach(){}

    public BallCoach(String name, int age){
        super(name,age);
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃羊肉，喝羊奶");

    }

    @Override
    public void teach() {
        System.out.println("篮球教练教如何运球和投篮");
    }
}
