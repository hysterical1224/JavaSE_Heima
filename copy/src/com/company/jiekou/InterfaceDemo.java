package com.company.jiekou;

public class InterfaceDemo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
//        i.num = 30;
//      只能是常量  public static final
        System.out.println(Inter.num);


    }
}
