package com.company.jingtai;
//非静态的成员方法:非静态能访问静态成员变量
//能访问静态的成员变量
//能访问非静态的成员变量
//能访问静态的成员方法
//能访问非静态的成员方法
//静态的成员方法
//能访问静态的成员变量
//能访问静态的成员方法
//总结成一句话就是：
//静态成员方法只能访问静态成员

public class demo {
    public static void main(String[] args) {
        StudentJingTai.university = "whu";
        StudentJingTai studentJingTai = new StudentJingTai();
        studentJingTai.name = "yahaha";
        studentJingTai.age =12;
        studentJingTai.show();
        StudentJingTai studentJingTai1 = new StudentJingTai();
        studentJingTai1.name = "ss";
        studentJingTai1.age = 13;
        studentJingTai1.show();
    }
}
