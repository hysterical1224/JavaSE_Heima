package com.company.StuTeach;

public class demo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("林青霞");
        t1.setAge(30);
        System.out.println(t1.getName() + "," + t1.getAge());
        t1.teach();


        Teacher t2 = new Teacher("风清扬", 33);
        System.out.println(t2.getName() + "," + t2.getAge());
        t2.teach();

        // 创建学生类对象测试
        Student s = new Student("张三",23);
        System.out.println(s.getName() + "," + s.getAge());
        s.study();


    }
}
