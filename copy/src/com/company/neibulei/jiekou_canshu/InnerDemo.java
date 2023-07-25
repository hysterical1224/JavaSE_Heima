package com.company.neibulei.jiekou_canshu;

/*
* 成员内部类的定义位置
在类中方法，跟成员变量是一个位置
外界创建成员内部类格式
格式：外部类名.内部类名 对象名 = 外部类对象.内部类对象;
举例：Outer.Inner oi = new Outer().new Inner();
成员内部类的推荐使用方案
将一个类，设计为内部类的目的，大多数都是不想让外界去访问，所以内部类的定义应该私有化，私有
化之后，再提供一个可以让外界调用的方法，方法内部创建内部类对象并调用。
*
* */

public class InnerDemo {
    public static void main(String[] args) {
//        Outer.Inner oi = new Outer().new Inner();
        Outer o = new Outer();
        o.method();

    }
}
