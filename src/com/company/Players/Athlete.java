package com.company.Players;

public abstract class Athlete extends Player{

    public Athlete(){

    }

    public Athlete(String name, int age){
        super(name,age);
    }

    public abstract void study();
}
