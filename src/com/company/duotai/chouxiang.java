package com.company.duotai;
//抽象类的定义
//public abstract class 类名 {}
//
//    //抽象方法的定义
//    public abstract void eat();

//抽象类中不一定有抽象方法，有抽象方法的类一定是抽象类

//抽象类不能实例化
//  抽象类如何实例化呢？参照多态的方式，通过子类对象实例化，这叫抽象类多态
//抽象类的子类
//  要么重写抽象类中的所有抽象方法
//  要么是抽象类

public abstract class chouxiang {
    private int age = 20;
    private  final  String city = "beijing";
//    一旦你将引用声明作 final，你将不能改变这个引用了，编译器会检查代码，如果试图将变量再次初始化的话，编译器会报编译错误。

    public chouxiang(){}

    public chouxiang(int age){
        this.age = age;
    }

    public void show(){
        age = 40;
        System.out.println(age);
//        city = "shanghai";
        System.out.println(city);
    }

    public abstract void eat();
}
