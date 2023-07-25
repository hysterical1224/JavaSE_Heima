package duoxiancheng20;

public class xianchengyouxianji {
    /**
     * 线程调度
     * 两种调度方式
     * 分时调度模型：所有线程轮流使用 CPU 的使用权，平均分配每个线程占用 CPU 的时间片
     * 抢占式调度模型：优先让优先级高的线程使用 CPU，如果线程的优先级相同，那么会随机选择一
     * 个，优先级高的线程获取的 CPU 时间片相对多一些
     * Java使用的是抢占式调度模型
     * 随机性
     * 假如计算机只有一个 CPU，那么 CPU 在某一个时刻只能执行一条指令，线程只有得到CPU时间片，也
     * 就是使用权，才可以执行指令。所以说多线程程序的执行是有随机性，因为谁抢到CPU的使用权是不一
     * 定的
     * */
    //static void sleep(long
    //millis) 使当前正在执行的线程停留（暂停执行）指定的毫秒数
    //void join() 等待这个线程死亡
    //void setDaemon(boolean on)
    // 将此线程标记为守护线程，当运行的线程都是守护线程时，Java虚拟机
    //将退出
    /**
     * 守护线程的目的有以下几个方面：
     *
     * 为其他线程提供服务：守护线程通常被用来执行一些后台任务或服务，为其他线程提供支持。例如，在一个服务器应用程序中，守护线程可以用来接收网络请求、处理定时任务等。
     *
     * 不阻止程序的终止：当所有的非守护线程都执行完毕时，程序会终止，而不管守护线程是否完成。守护线程的存在不会阻止 JVM 的退出。这对于一些需要在后台执行的任务非常有用，如日志记录、自动保存等。
     *
     * */
    public static void main(String[] args) {
        MyThread td1 = new MyThread();
        MyThread td2 = new MyThread();

        td1.setName("关羽");
        td2.setName("张飞");

        //设置主线程为刘备
        Thread.currentThread().setName("刘备");

        //设置守护线程
        td1.setDaemon(true);
        td2.setDaemon(true);

        td1.start();
        td2.start();

        for(int i=0; i<10; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
        /**
         * 实现 Runnable 接口：
         * 当实现 Runnable 接口创建线程时，需要实现 run() 方法，将线程要执行的任务逻辑放在其中。
         * 优点：实现 Runnable 接口创建的线程类可以更灵活地扩展其他类，避免了单继承的限制。
         * 缺点：不能直接调用线程类的方法，如 getName()、getId()，需要通过传递线程对象来访问。
         *
         *
         * 继承 Thread 类：
         * 当继承 Thread 类创建线程时，需要重写 run() 方法，将线程要执行的任务逻辑放在其中。
         * 优点：继承 Thread 类创建的线程类具有线程类的特性，可以直接调用线程类的方法，如 getName()、getId() 等。
         * 缺点：由于 Java 是单继承的，如果已经继承了其他类，则无法再继承 Thread 类创建线程。
         *
         *
         * 比继承Thread类，实现Runnable接口的好处
         * 避免了Java单继承的局限性
         * 适合多个相同程序的代码去处理同一个资源的情况，把线程和程序的代码、数据有效分离，较好的体现
         * 了面向对象的设计思想
         * */
    }






}
