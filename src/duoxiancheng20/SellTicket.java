package duoxiancheng20;

public class SellTicket implements Runnable{
    /**
     *      * 定义一个类SellTicket实现Runnable接口，里面定义一个成员变量：private int tickets = 100;
     *      * 在SellTicket类中重写run()方法实现卖票，代码步骤如下
     *      * 判断票数大于0，就卖票，并告知是哪个窗口卖的
     *      * 卖了票之后，总票数要减1
     *      * 票没有了，也可能有人来问，所以这里用死循环让卖票的动作一直执行
     *      * 定义一个测试类SellTicketDemo，里面有main方法，代码步骤如下
     *      * 创建SellTicket类的对象
     *      * 创建三个Thread类的对象，把SellTicket对象作为构造方法的参数，并给出对应的窗口名称
     *
     *
     * */
    private int tickets = 100;
    private Object obj = new Object();


    @Override
    public void run() {
        /**
         * synchronized (obj) {} 是Java中用于实现同步的关键字和代码块。
         *
         * 在这个语法结构中，obj 是一个对象引用，它用作同步锁。当一个线程进入synchronized (obj)代码块时，它会尝试获取obj对象的锁。
         *
         * 如果锁没有被其他线程持有，那么该线程会获得锁，并执行synchronized代码块中的代码。在执行完代码块后，线程会释放锁，使其他等待该锁的线程有机会获得它并执行相应的代码。
         *
         * 关键字synchronized和同步代码块的作用是确保在多线程环境下共享资源的安全访问。当多个线程尝试同时访问共享资源时，同步块可以防止竞态条件和数据不一致的问题。
         *
         *
         * */


        while (true) {
            synchronized (obj) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    sell();
                }
            }
        }
    }
    public void sell(){
        System.out.println(Thread.currentThread().getName() + "正在出售第" +
                tickets + "张票");
        tickets--;
    }

}
