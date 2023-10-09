public class Statikus {
    public static int maci;
    private int laci;

    public Statikus(int laci) {
        this.laci = laci;
    }

    public int getLaci() {
        return laci;
    }

    public void setLaci(int laci) {
        this.laci = laci;
    }

    @Override
    public String toString() {
        return "Statikus{" +
                "laci=" + laci +
                '}';
    }
}
