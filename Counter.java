public class Counter {

    private int value;

    public Counter() {
    }

    public Counter(int number) {
        value = number;
    }

    public void increment() {
        value = value + 1;
    }

    public void reset() {
        value = 0;
    }

    public int display() {
        return value;
    }
}