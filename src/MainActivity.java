public class MainActivity {
    public static void main(String[] args) {
        System.out.println("Hello, app is working");

        Work easyWork = new Work(6);
        Work hardWork = new Work(20);

        Worker bill = new Worker("Bill", 2, easyWork);
        Worker jill = new Worker("Jill", 4, hardWork);

        bill.start();
        jill.start();
    }
}
