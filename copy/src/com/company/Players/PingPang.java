package com.company.Players;

public class PingPang extends Athlete implements LearnEnglish{

    public PingPang(){}
    public PingPang(String name, int age){
        super(name,age);
    }

    @Override
    public void studyEnglish() {
        System.out.println("乒乓学生学英语！");
    }


    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃大白菜，喝小米粥");

    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习如何发球和接球");

    }
}
