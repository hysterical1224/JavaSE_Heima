package jihe14_15;

public class ziranpaixu implements Comparable<ziranpaixu>{

    /*
    * 存储学生对象并遍历，创建TreeSet集合使用无参构造方法
    * 要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
        实现步骤
        用TreeSet集合存储自定义对象，无参构造方法使用的是自然排序对元素进行排序的
        自然排序，就是让元素所属的类实现Comparable接口，重写compareTo(T o)方法
        重写方法时，一定要注意排序规则必须按照要求的主要条件和次要条件来写
    *
    * */
    String name;
    int age;

    public ziranpaixu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(ziranpaixu z) {
        int num = this.age - z.age;
        int num2 = num==0?this.name.compareTo(z.name):num;
        return num2;


    }
}
