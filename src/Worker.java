import java.util.concurrent.BlockingQueue;

public class Worker extends Thread {

    private String name;
    private int skillLevel;
    private Work work;
    private BlockingQueue<Work> queue;

    public Worker(String name, int skillLevel, Work work, BlockingQueue<Work> queue) {
        this.name = name;
        this.skillLevel = skillLevel;
        this.work = work;
        this.queue = queue;
    }


    @Override
    public void run() {
        work();
    }

    public void work() {
        int timeRequired = work.getHardness() / skillLevel;
        for (int i = 0; i < timeRequired; i++) {
            try {
                System.out.println("Worker " + this.getWorkerName() + " is working for " + i + " seconds");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Worker " + this.getWorkerName() + " done his job " + work.toString());
        try {
            queue.put(work);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getWorkerName() {
        return name;
    }

    public void setWorkerName(String name) {
        this.name = name;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }
}
