package com.company.Players;

public abstract class Coach extends Player{

    public Coach(){}

    public Coach(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract void teach();
}
