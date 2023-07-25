package com.company.neibulei.jiekou_canshu;
/*
* 局部内部类定义位置
*局部内部类是在方法中定义的类
*局部内部类方式方式
*局部内部类，外界是无法直接使用，需要在方法内部创建对象并使用
*该类可以直接访问外部类的成员，也可以访问方法内的局部变量
*/




public class JuBuLei {
    private int num = 10;
    public void method(){
        int num2 = 20;
        class Inner{
            public void show(){
                System.out.println(num);
                System.out.println(num2);
            }
        }
        Inner i = new Inner();
        i.show();
    }



}
