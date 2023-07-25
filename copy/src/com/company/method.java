package com.company;

public class method {
    public static void main(String[] args) {
//        成员变量和局部变量的区别【理解】
        //类中位置不同：成员变量（类中方法外）局部变量（方法内部或方法声明上）
        //内存中位置不同：成员变量（堆内存）局部变量（栈内存）
        //生命周期不同：成员变量（随着对象的存在而存在，随着对象的消失而消失）局部变量（随着方法的调用而
        //存在，醉着方法的调用完毕而消失）
        //初始化值不同：成员变量（有默认初始化值）局部变量（没有默认初始化值，必须先定义，赋值才能使用）
//        this修饰的变量用于指代成员变量，其主要作用是（区分局部变量和成员变量的重名问题）
//        方法的形参如果与成员变量同名，不带this修饰的变量指的是形参，而不是成员变量
        //方法的形参没有与成员变量同名，不带this修饰的变量指的是成员变量
        mm();
        int[] arr = {10, 20, 30};
        System.out.println("调用change方法前：" + arr[1]);
        change(arr);
        System.out.println("调用change方法后：" + arr[1]);
    }

    public static void change(int[] arr) {
        arr[1] = 200;
    }


    //    方法不能嵌套定义
    public static void mm(){
        System.out.println("hhhh");
    }
}
