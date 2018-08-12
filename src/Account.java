public class Account {
    private Worker worker;
    private int balance;

    public Account() {
    }

    public void deposit(int sum) {
        balance += sum;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    @Override
    public String toString() {
        return "Account{" +
                "worker=" + worker +
                ", balance=" + balance +
                '}';
    }
}
