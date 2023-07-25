package com.company.extendd;

public class Fu {
//     子类会继承父类中的数据，可能还会使用父类的数据。所以，子类初始化之前，一定要先完成父类数据的初始化，
//原因在于，每一个子类构造方法的第一条语句默认都是：super()
//    对象在堆内存中，会单独存在一块super区域，用来存放父类的数据
    int num = 10;

    public void show(){
        System.out.println("Fu的show方法被调用！");
        System.out.println(num);
    }
}


