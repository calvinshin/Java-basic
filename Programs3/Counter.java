public class Counter {
    private int counter;
    public Counter(int number) {
        counter = number;
    }
    public void increment() {
        counter += 1;
    }
    public void decrement() {
        counter -= 1;
    }
    public int getValue() {
        return counter;
    }
}