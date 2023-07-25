package duoxiancheng20;

public class maipiao {
    /**
     * 案例需求
     * 某电影院目前正在上映国产大片，共有100张票，而它有3个窗口卖票，请设计一个程序模拟该电影院卖票

     * 实现步骤
     * 定义一个类SellTicket实现Runnable接口，里面定义一个成员变量：private int tickets = 100;
     * 在SellTicket类中重写run()方法实现卖票，代码步骤如下
     * 判断票数大于0，就卖票，并告知是哪个窗口卖的
     * 卖了票之后，总票数要减1
     * 票没有了，也可能有人来问，所以这里用死循环让卖票的动作一直执行
     * 定义一个测试类SellTicketDemo，里面有main方法，代码步骤如下
     * 创建SellTicket类的对象
     * 创建三个Thread类的对象，把SellTicket对象作为构造方法的参数，并给出对应的窗口名称
     *
     * */
    public static void main(String[] args) {



        /**
         * SellTicket st = new SellTicket();
         * 这一行创建了一个名为st的SellTicket对象。SellTicket是一个自定义的类，可能包含了售票窗口的相关逻辑和状态。
         *
         * Thread t1 = new Thread(st, "窗口1");
         * 这一行创建了一个名为t1的Thread对象。Thread类是Java中用于实现多线程的类。它的构造方法接受两个参数：
         * 一个是实现了Runnable接口的对象，另一个是线程的名称。在这里，st对象实现了Runnable接口，
         * 因此它可以作为Thread的构造方法的参数。"窗口1"是给线程命名的字符串，用于标识这个线程代表的窗口。
         * 接下来，通过使用Thread类，创建了三个线程对象t1、t2和t3。在创建这些线程对象时，
         * st对象作为构造方法的参数传递进去，这意味着这三个线程将共享同一个SellTicket对象。
         *
         *
         * */
        SellTicket st = new SellTicket();
        Thread t1 = new Thread(st, "h1");
        Thread t2 = new Thread(st,"h2");
        Thread t3 = new Thread(st,"h3");
        t1.start();
        t2.start();
        t3.start();
        

    }
}
