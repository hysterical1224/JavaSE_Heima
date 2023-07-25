package duoxiancheng20;

public class xiancheng {
    /**
     * 进程：是正在运行的程序
     * 是系统进行资源分配和调用的独立单位
     * 每一个进程都有它自己的内存空间和系统资源
     * 线程：是进程中的单个顺序控制流，是一条执行路径
     * 单线程：一个进程如果只有一条执行路径，则称为单线程程序
     * 多线程：一个进程如果有多条执行路径，则称为多线程程序
     * */


    //调用 run() 方法是在当前线程上以普通方法的方式执行代码逻辑，没有创建新的线程。
    //调用 start() 方法是启动一个新的线程，并自动调用线程对象的 run() 方法，让线程在新的线程上执行。
    //在使用多线程编程时，通常应该调用 start() 方法来启动线程，以创建新的线程并实现并发执行的效果。
    // 直接调用 run() 方法只是普通的方法调用，不会创建新的线程，无法实现并发执行的效果。

    /**
     * 同步（Synchronization）：
     *
     * 同步是指多个线程按照一定的顺序或规则执行，以避免竞态条件和数据不一致的问题。
     * 同步机制可以通过锁（如 synchronized 关键字、Lock 接口）来实现，确保在同一时间只有一个线程访问共享资源，保持数据的一致性。
     * 同步机制会造成线程的阻塞和等待，可能影响程序的性能和响应性。
     * 并发（Concurrency）：
     *
     * 并发是指多个线程可以同时执行，共享计算机的处理资源和时间片。
     * 并发编程旨在提高程序的性能和响应性，通过同时执行多个任务来充分利用计算机的处理能力。
     * 并发编程需要考虑线程间的同步和协调，避免竞态条件、死锁等问题，确保共享资源的安全访问。
     *
     * */
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread thread1 = new MyThread("线程1");
        Thread thread2 = new MyThread("线程2");
        thread1.run();
        thread2.run();
        System.out.println(thread1.getName());
        /**
         * final int getPriority() 返回此线程的优先级
         * final void setPriority(int newPriority)
         *  更改此线程的优先级 线程默认优先级是5；线程优先级的范围
         * 是：1-10
         * */
        System.out.println(thread1.getPriority());
        thread2.setPriority(8);
        System.out.println(thread1.getPriority());
        System.out.println(thread1.getId());
        System.out.println(thread2.getId());
        System.out.println(Thread.currentThread().getName());


    }



}
