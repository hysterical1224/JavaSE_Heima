package IOliu19;

import digui17.Student;

import java.io.*;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class xueshengwenjian {
    /**
     * 键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩)。要求按照成绩总分从高到低写入文本文件
     * 格式：姓名,语文成绩,数学成绩,英语成绩 举例：林青霞,98,99,100
     * <p>
     * 1. 定义学生类
     * 2. 创建TreeSet集合，通过比较器排序进行排序
     * 3. 键盘录入学生数据
     * 4. 创建学生对象，把键盘录入的数据对应赋值给学生对象的成员变量
     * 5. 把学生对象添加到TreeSet集合
     * 6. 创建字符缓冲输出流对象
     * 7. 遍历集合，得到每一个学生对象
     * 8. 把学生对象的数据拼接成指定格式的字符串
     * 9. 调用字符缓冲输出流对象的方法写数据
     * 10. 释放资源
     */


    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                float num = o1.sum() - o2.sum();
                float num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
                float num3 = num2 == 0 ? o1.getChinese() - o2.getChinese() : num2;
                float num4 = num3 == 0 ? o1.getMath() - o2.getMath() : num3;
                float num5 = num4 == 0 ? o1.getEnglish() - o2.getEnglish() : num4;
                return (int) num5;
            }
        });
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("请录入第" + (i + 1) + "个学生信息：");
            System.out.println("姓名：");
            String name = sc.nextLine();

            System.out.println("语文成绩：");
            int chinese = sc.nextInt();
            System.out.println("数学成绩：");
            int math = sc.nextInt();
            System.out.println("英语成绩：");
            int english = sc.nextInt();
            sc.nextLine();


            //创建学生对象，把键盘录入的数据对应赋值给学生对象的成员变量
            Student s = new Student();
            s.setName(name);
            s.setChinese(chinese);
            s.setMath(math);
            s.setEnglish(english);

            //把学生对象添加到TreeSet集合
            ts.add(s);
        }

        BufferedWriter bw =null;
        try {
            bw = new BufferedWriter(new FileWriter(".\\bfw.txt"));
            for (Student s:ts){
                //把学生对象的数据拼接成指定格式的字符串
                //格式：姓名,语文成绩,数学成绩,英语成绩
                StringBuilder sb = new StringBuilder();

                sb.append(s.getName()).append(",").append(s.getChinese()).append(",").append(s
                        .getMath()).append(",").append(s.getEnglish()).append(",").append(s.sum());

                bw.write(sb.toString());
                bw.newLine();
                bw.flush();

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //需要高效写入字符数据
        //需要进行行级别的写入
        //需要处理文本文件或字符数据




}
}
