package com.company.StuTeach;

public class Student extends Person{

    public Student(){
        super();
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        System.out.println("学生去学习");
    }

    public void study(){
        System.out.println("学习中！");
    }
}
