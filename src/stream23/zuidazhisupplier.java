package stream23;



import java.util.function.Supplier;

public class zuidazhisupplier {
    /**
     * 定义一个类(SupplierTest)，在类中提供两个方法
     * 一个方法是：int getMax(Supplier sup) 用于返回一个int数组中的最大值
     * 一个方法是主方法，在主方法中调用getMax方法
     * */
    public static void main(String[] args) {
        int[] arr = {19,50,28,37,46};
        int maxvalue = getMax(()->{
            int max = arr[0];
            for (int i=1; i<arr.length;i++){
                if (arr[i] > max) {
                    max =arr[i];
                }
            }
            return max;
                }

        );

    }

    public static int getMax(Supplier<Integer> supp) {
        /**
         * 在 getMax 方法内部，通过 sup.get() 调用 Supplier 的 get 方法，
         * 执行了传入的 Lambda 表达式。因为这个 Lambda 表达式不接受任何参数，
         * 所以在这里的 get 方法中并没有传入任何参数，直接返回整数类型的结果。
         *
         * */
        return supp.get();


    }
}
