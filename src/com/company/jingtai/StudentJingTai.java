package com.company.jingtai;

public class StudentJingTai {
    //    static的概念
    //static关键字是静态的意思，可以修饰【成员方法】，【成员变量】
    //static修饰的特点
    //1. 被类的所有对象共享，这也是我们判断是否使用静态关键字的条件
    //2. 可以通过类名调用当然，也可以通过对象名调用【推荐使用类名调用】
    public String name;
    public int age;
    public static String university = "whpu";
    //    共享数据！所以设计为静态！
    public StudentJingTai(){}
    public StudentJingTai(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println("姓名："+name+" 年龄："+age+" 学校："+university);
    }


}
