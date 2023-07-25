package com.company.jiekou;

//接口用关键字interface修饰
//
//类实现接口用implements表示
//public interface 接口名 {}
//    接口不能实例化
//  接口如何实例化呢？参照多态的方式，通过实现类对象实例化，这叫接口多态。
//  多态的形式：具体类多态，抽象类多态，接口多态。
//接口的子类
//  要么重写接口中的所有抽象方法
//  要么子类也是抽象类


public interface Inter {

/*
成员变量
  只能是常量   默认修饰符：public static final
构造方法
  没有，因为接口主要是扩展功能的，而没有具体存在
成员方法
  只能是抽象方法
 */
    public int num = 20;
    public static final int num1 = 10;
    int num2 = 30;
//    public Inter(){}
//没有，因为接口主要是扩展功能的，而没有具体存在
//    public void show(){}

    public abstract void method();
    void show();


}
