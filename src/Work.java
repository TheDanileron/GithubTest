public class Work {
    private int hardness;

    public Work(int hardness) {
        this.hardness = hardness;
    }

    public int getHardness() {
        return hardness;
    }

    public void setHardness(int hardness) {
        this.hardness = hardness;
    }

    @Override
    public String toString() {
        return "Work: " + this.hashCode() + "; Hardness : " + hardness;
    }
}
