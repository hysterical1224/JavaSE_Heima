package com.company;

import com.company.StuTeach.Student;
//static的概念
//static关键字是静态的意思，可以修饰【成员方法】，【成员变量】
//static修饰的特点
//1. 被类的所有对象共享，这也是我们判断是否使用静态关键字的条件
//2. 可以通过类名调用当然，也可以通过对象名调用【推荐使用类名调用】

public class xiushifinal {
    //fianl修饰类：该类不能被继承（不能有子类，但是可以有父类）
    //final修饰方法：该方法不能被重写
    //final修饰变量：表明该变量是一个常量，不能再次赋值
//    fianl修饰基本数据类型变量
    //final 修饰指的是基本类型的数据值不能发生改变
    //final修饰引用数据类型变量
    //final 修饰指的是引用类型的地址值不能发生改变，但是地址里面的内容是可以发生改变的
    public static void main(String[] args) {
        final Student student = new Student("ss",12);
//        student = new Student("sa", 13);
//        地址不能发生变化

        student.setAge(24); // 正确

    }

}
