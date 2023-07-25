package com.company.Players;

public abstract class Player {
    String name;
    int age;
    public  Player(){}

    public Player(String name, int age){
        this.name = name;
        this.age = age;
    }
    public abstract void eat();


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
