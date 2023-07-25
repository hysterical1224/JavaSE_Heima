package jihe14_15;

public class kebiancanshu {
    /**
     * 可变参数又称参数个数可变，用作方法的形参出现，那么方法参数个数就是可变的了
     * 可变参数定义格式:    修饰符 返回值类型 方法名(数据类型… 变量名) {  }
     * 可变参数的注意事项
     * 这里的变量其实是一个数组
     * 如果一个方法有多个参数，包含可变参数，可变参数要放在最后
     *
     *
     *
     * */
    public static void main(String[] args) {
        System.out.println(sum(10,29));
        System.out.println(sum(10,20,30));
    }

    public static int sum(int... a) {
        int sum = 0;
        for (int i:a){
            sum+=i;
        }
        return sum;

    }


}
