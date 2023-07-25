package duoxiancheng20;

public class Box {
    /**
     * 定义一个成员变量，表示第x瓶奶，提供存储牛奶和获取牛奶的操作
     *
     * */
    private int milk;
    //定义一个成员变量，表示第x瓶奶,false表示没有牛奶，true表示有牛奶
    private boolean state = false;

    public synchronized void put(int milk){
        //如果有牛奶，等待消费
        if (state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //如果没有牛奶，就生产牛奶
        this.milk = milk;
        System.out.println("送奶工将第" + this.milk + "瓶奶放入奶箱");

        //生产完毕之后，修改奶箱状态
        state = true;

        //唤醒生产牛奶的线程
        notify();
    }

    public synchronized void get(){
        //如果没有牛奶，等待生产
        if (!state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果有牛奶，就消费牛奶
        System.out.println("用户拿到第" + this.milk + "瓶奶");
        state = false;

        //唤醒其他取牛奶的线程
        notifyAll();
        /**
         * notifyAll()方法来实现线程的同步和协作，
         * 确保在正确的时间进行生产和消费，避免了数据竞争和一致性问题。
         **/
    }

}


