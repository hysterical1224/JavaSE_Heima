package com.company.StuTeach;

public class Person {
    String name;
    int age;
    public Person(){

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }



    public void action(){
        System.out.println("学生做啥事情！");
    }

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
