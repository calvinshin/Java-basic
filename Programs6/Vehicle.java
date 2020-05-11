public abstract class Vehicle {
    private double maxSpeed;
    protected double currentSpeed;
    public Vehicle(double max) {
        maxSpeed = max;
    }
    public abstract void accelerate();
    public double getCurrentSpeed() {
        return currentSpeed;
    }
    public double getMaxSpeed() {
        return maxSpeed;
    }
    public void pedalToTheMedal() {
        while(currentSpeed < maxSpeed) {
            accelerate();
        }
    }
}