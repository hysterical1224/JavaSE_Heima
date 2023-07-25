package com.company.duotai;

public class AnimalDemo {
    public static void main(String[] args) {
        //好处
        //  提高程序的扩展性。定义方法时候，使用父类型作为参数，在使用的时候，使用具体的子类型参与操作
        //弊端
        //  不能使用子类的特有成员

        //向上转型
        //  父类引用指向子类对象就是向上转型
        //向下转型
        //  格式：子类型 对象名 = (子类型)父类引用
        AnimalDuoTai animalDuoTai = new CatDuoTai();
        animalDuoTai.eat();

    }
}
