package digui17;

public class jiecheng {
    /**
     * 用递归求5的阶乘，并把结果在控制台输出
     *
     * */
    public static void main(String[] args) {

        System.out.println(f(5));
    }

    public static int f(int n) {
        if (n==1){
            return 1;
        }

        return n*f(n-1);
    }

}
