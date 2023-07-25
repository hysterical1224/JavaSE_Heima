package com.company.studentManage;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {
//    创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看指定学号学生");
            System.out.println("5 查看所有学生");
            System.out.println("6 退出");
            System.out.println("请输入你的选择：");
            System.out.println("输入命令：");
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            switch (line) {
                case ("1"): {
                    //增
                    addStudent(students);
                    break;
                } case ("2"):{
                    //删
                    deleteStudent(students);
                    break;
                } case ("3"):{
                    //改
                    updateStudent(students);
                    break;
                } case ("4"):{
                    //查
                    lookforStudent(students);
                    break;
                } case ("5"): {
                    lookforAllStudent(students);
                    break;
                } case ("6"): {
                    System.exit(0);
                }
            }
        }

    }
    public static boolean isUsed(@NotNull ArrayList<Student> students, String str) {
        for (int i=0;i<students.size();i++){
            if(str.equals(students.get(i))){
                return true;
            }
        }
        return false;
    }
    public static void addStudent(ArrayList<Student> students){
        Scanner scanner = new Scanner(System.in);
        String sid = "";
        while (true){

            System.out.println("输入学生信息，学号：");
            sid = scanner.nextLine();
            if (isUsed(students, sid)){
                System.out.println("输入学生已存在");

            } else {
                break;
            }
        }

        System.out.println("输入学生信息，名字：");
        String name = scanner.nextLine();
        System.out.println("输入学生信息，年龄：");
        int age = scanner.nextInt();
        scanner.nextLine(); // 清除换行符
        System.out.println("输入学生信息，地址：");
        String address = scanner.nextLine();
//        当 scanner.nextInt() 与 scanner.nextLine() 在同一个程序中同时使用时，
//        可能会导致问题是因为 nextInt() 方法只会读取一个整数，但会在输入缓冲区中留下换行符（\n）。
//        当你接下来使用 nextLine() 方法时，它会读取输入缓冲区中的剩余内容，包括之前的换行符，而不会等待你输入新的内容。
        Student student = new Student();
        student.setSid(sid);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);
        students.add(student);
        System.out.println("添加学生成功");



    }
    public static boolean deleteStudent(ArrayList<Student> students){
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入要删除学生的学号：");
        String s = scanner.nextLine();
        for (int i=0;i<students.size();i++){
             if(s.equals(students.get(i).getSid())){
                 System.out.println("删除"+students.get(i).getSid()+"成功！");
                 students.remove(i);
                 return true;
             }
         }
        return false;
    }
    public static boolean updateStudent(ArrayList<Student> students){
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入需要更新的id：");
        String s = scanner.nextLine();

        for (int i=0;i<students.size();i++){
            if (s.equals(students.get(i).getSid())){
                Student student = students.get(i);
                System.out.println("修改名字：");
                String name = scanner.nextLine();
                student.setName(name);
                System.out.println("修改年龄：");
                int age = scanner.nextInt();
                scanner.nextLine();
                // 清除换行符
                student.setAge(age);
                System.out.println("修改地址：");
                String address = scanner.nextLine();
                student.setAddress(address);
                for (int j=0;j<students.size();j++){
                    System.out.println(students.get(j).toString());

                }
                return true;
            }
        }

        System.out.println(s+"不存在！修改失败");
        return false;
    }
    public static boolean lookforStudent(ArrayList<Student> students){
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入要查看的学号：");
        String name = scanner.nextLine();
        for(int i=0; i<students.size(); i++){
            if(name.equals(students.get(i).getSid())) {
                System.out.println(students.get(i).toString());
                return true;
            }
        }
        System.out.println("没有该学号！");
        return false;

    }
    public static void lookforAllStudent(ArrayList<Student> students){
        for (int i=0;i<students.size();i++) {
            System.out.println(students.get(i).toString());
        }
    }
}
