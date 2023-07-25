package com.company;

public class StringBu {
//    StringBuilder 是一个可变的字符串类，我们可以把它看成是一个容器，这里的可变指的是 StringBuilder 对象中的
    //内容是可变的
//    String类：内容是不可变的
    //StringBuilder类：内容是可变的

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println("sb1:"+sb);
        System.out.println("sb:"+sb.length());

        StringBuilder stringBuilder = new StringBuilder("hello?");
        System.out.println("sb2:"+stringBuilder);
        System.out.println("sb3:"+stringBuilder.length());
//        public StringBuilder() 创建一个空白可变字符串对象，不含有任何内容
        //public StringBuilder(String str) 根据字符串的内容，来创建可变字符串对象
        stringBuilder.append("java").append(120).append(12.4).append(12.1f);
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);

//        StringBuilder转换为String
        //public String toString()：通过 toString() 就可以实现把 StringBuilder 转换为 String
        //String转换为StringBuilder
        //public StringBuilder(String s)：通过构造方法就可以实现把 String 转换为 StringBuilder

        /*public String toString()：通过 toString() 就可以实现把 StringBuilder 转换为
                String
        String s = sb.toString();
        System.out.println(s);
        */

        //String 转换为 StringBuilder
        String s = "hello";

        //StringBuilder sb = s; //这个是错误的做法

        //public StringBuilder(String s)：通过构造方法就可以实现把 String 转换为StringBuilder

    }
}
