import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class MainActivity {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello, app is working");

        BlockingQueue<Work> doneWorkQueue = new LinkedBlockingDeque<>();

        Work easyWork = new Work(6);
        Work hardWork = new Work(20);

        Worker bill = new Worker("Bill", 2, easyWork, doneWorkQueue);
        Worker jill = new Worker("Jill", 4, hardWork, doneWorkQueue);

        bill.start();
        jill.start();

        jill.join();
        bill.join();

        System.out.println(doneWorkQueue);
    }
}
