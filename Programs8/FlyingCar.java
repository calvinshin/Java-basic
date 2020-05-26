public class FlyingCar extends Car {
    private double altitude;

    public FlyingCar(double spd, Location location, double alt) {
        super(spd, location);
        altitude = alt;
    }

    public FlyingCar(FlyingCar fc) {
        super(fc.speed, fc.loc);
        altitude = fc.altitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public void land() {
        speed = 0;
        altitude = 0;
    }

    public boolean isHigherAndFaster(FlyingCar c) {
        return (this.speed > c.speed && this.altitude > c.altitude);
    }
}