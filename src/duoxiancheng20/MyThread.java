package duoxiancheng20;

import org.jetbrains.annotations.NotNull;

public class MyThread extends Thread {

//    void setName(String name) 将此线程的名称更改为等于参数name
//    String getName() 返回此线程的名称
//    Thread currentThread() 返回对当前正在执行的线程对象的引用


    public MyThread() {
    }

    public MyThread(@NotNull String name) {
        super(name);
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());;

    }


}
