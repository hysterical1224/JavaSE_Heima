package jihe16_shuanglie;

import java.util.Objects;

public class Stu_addr {
    /**
     * 创建一个HashMap集合，键是学生对象(Student)，值是居住地 (String)。存储多个元素，并遍历。
     * 要求保证键的唯一性：如果学生对象的成员变量值相同，我们就认为是同一个对象
     *
     *
     *
     *
     * */
    String name;
    int age;

    public Stu_addr(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Stu_addr() {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stu_addr)) return false;
        Stu_addr stu_addr = (Stu_addr) o;
        return age == stu_addr.age && Objects.equals(name, stu_addr.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
