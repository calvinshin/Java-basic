public class CalculatorWithMemory extends Calculator {
    double memory = 0;
    public void save() {
        memory = accumulator;
    }
    public void recall() {
        accumulator = memory;
    }
    public void clearMemory() {
        memory = -memory;
    }
    public double getMemory() {
        return memory;
    }
}
