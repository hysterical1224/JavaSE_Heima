package IOliu19;

import java.io.Serializable;

public class xuliehua implements Serializable {
    /**
     * 对象序列化介绍
     * 对象序列化：就是将对象保存到磁盘中，或者在网络中传输对象
     * 这种机制就是使用一个字节序列表示一个对象，该字节序列包含：对象的类型、对象的数据和对象中存
     * 储的属性等信息
     * 字节序列写到文件之后，相当于文件中持久保存了一个对象的信息
     * 反之，该字节序列还可以从文件中读取回来，重构对象，对它进行反序列化
     * 对象序列化流： ObjectOutputStream
     * 将Java对象的原始数据类型和图形写入OutputStream。 可以使用ObjectInputStream读取（重构）对
     * 象。 可以通过使用流的文件来实现对象的持久存储。 如果流是网络套接字流，则可以在另一个主机上或
     * 另一个进程中重构对象
     *
     * */
    private String name;
    private int age;

    public xuliehua() {
    }

    public xuliehua(String name, int age) {
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
    public String toString() {
        return "xuliehua{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
