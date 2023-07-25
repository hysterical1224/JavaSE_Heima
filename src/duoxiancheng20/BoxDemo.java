package duoxiancheng20;

public class BoxDemo {
    public static void main(String[] args) {
        Box b = new Box();

        //
        Producer p = new Producer(b);
        Customer c = new Customer(b);

        Thread t1 = new Thread(p,"生产者");
        Thread t2 = new Thread(c,"消费者");
        t1.start();
        t2.start();

    }

}
