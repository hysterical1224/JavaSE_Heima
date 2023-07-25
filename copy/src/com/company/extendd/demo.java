package com.company.extendd;
//包的概念
//包就是文件夹，用来管理类文件的
//2、包的定义格式
//package 包名; (多级包用.分开)
//例如：package com.heima.demo;
//3、带包编译&带包运行
//带包编译：javac –d . 类名.java
//例如：javac  -d  . com.heima.demo.HelloWorld.java
//带包运行：java 包名+类名
//例如：java com.heima.demo.HelloWorld

public class demo {
    public static void main(String[] args) {
        Fu f = new Fu();
        f.show();
//        在子类方法中访问一个变量，采用的是就近原则。
        //1. 子类局部范围找
        //2. 子类成员范围找
        //3. 父类成员范围找
        //4. 如果都没有就报错(不考虑父亲的父亲…)
        Zi z = new Zi();
        z.method();
        z.show();
    }
}
