package com.company.Players;

public class PPCoach extends Coach implements LearnEnglish{

    public PPCoach() {
    }

    public PPCoach(String name, int age) {
        super(name, age);
    }



    @Override
    public void studyEnglish() {
        System.out.println("乒乓教练学英语！");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃小白菜，喝大米粥");

    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教如何发球和接球");

    }
}
