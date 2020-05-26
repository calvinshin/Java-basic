public class Car {
    protected double speed;
    protected Location loc;

    public Car() {
        speed = 0;
        Location loc = new Location(0.0, 0.0);
    }

    public Car(double doub, Location loca) {
        speed = doub;
        Location loc = new Location(loca);
    }

    public Car(Car c) {
        this(c.speed, c.loc);
    }

    public double getSpeed() {
        return speed;
    }

    public Location getLocation() {
        return loc;
    }

    public void stop() {
        speed = 0;
    }
}