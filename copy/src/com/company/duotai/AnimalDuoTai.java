package com.company.duotai;
//什么是多态
//  同一个对象，在不同时刻表现出来的不同形态
//多态的前提:
//1.要有继承或实现关系
//2.要有方法的重写
//3.要有父类引用指向子类对象


public class AnimalDuoTai {
//成员访问特点
//成员变量
//  编译看父类，运行看父类
//成员方法
//  编译看父类，运行看子类
    public int age = 12;
    public void eat(){
        System.out.println("动物吃东西！");
    }


}
