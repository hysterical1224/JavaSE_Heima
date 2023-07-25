package lambda22;

//函数式接口作为方法的参数
public class lambda11 {
    /**
     * 函数式编程思想概述
     * 函数式思想则尽量忽略面向对象的复杂语法：“强调做什么，而不是以什么形式去做”
     * 而我们要学习的Lambda表达式就是函数式思想的体现
     * */

    public static void main(String[] args) {
        new Thread( () -> {
            System.out.println("多线程程序启动了");
        } ).start();

        /**
         * (形式参数) -> {代码块}
         * 形式参数：如果有多个参数，参数之间用逗号隔开；如果没有参数，留空即可
         * ->：由英文中画线和大于符号组成，固定写法。代表指向动作
         * 代码块：是我们具体要做的事情，也就是以前我们写的方法体内容
         * 组成Lambda表达式的三要素：
         * 形式参数，箭头，代码块
         *
         * */
        //lambda表达式
        startThread(()-> System.out.println(Thread.currentThread().getName() + "线程启动了"));



        //匿名内部类
        startThread(new Runnable(){

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "线程启动了");
            }
        });
    }
    private static void startThread(Runnable r){
        new Thread(r).start();
    }



}
