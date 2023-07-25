package duoxiancheng20;

import java.util.TreeSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class locksuo implements Runnable{



    private int tickets =100;
    private Lock lock = new ReentrantLock();
    /**
     * 同步代码块和同步方法的锁对象问题，但是我们并没有直接看到在哪里加上了锁，在哪里释放了
     * 锁，为了更清晰的表达如何加锁和释放锁，JDK5以后提供了一个新的锁对象Lock
     * Lock是接口不能直接实例化，这里采用它的实现类ReentrantLock来实例化
     *
     *
     * 方法名 说明
     * ReentrantLock() 创建一个ReentrantLock的实例
     * ReentrantLock构造方法
     *
     * void lock() 获得锁
     * void unlock() 释放锁
     * */
    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                    tickets--;
                }
            } finally {
                lock.unlock();
            }

        }

    }

}
