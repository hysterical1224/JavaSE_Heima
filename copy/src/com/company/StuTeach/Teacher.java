package com.company.StuTeach;

public class Teacher extends Person{

    public Teacher(){
        super();
    }

    public Teacher(String name, int age){
        super(name, age);
    }


    public void teach(){
        System.out.println("teach方法中，老师在教书！");
    }
}
