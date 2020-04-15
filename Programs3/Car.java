class CarObject {
    private int yearModel;
    private String make;
    private int speed;
    public CarObject (int year, String carMake) {
        yearModel = year;
        make = carMake;
        speed = 0;
    }
    public int getYearModel() {
        return yearModel;
    }
    public void setYearModel(int number) {
        yearModel = number;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String text) {
        make = text;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int number) {
        speed = number;
    }
    public void accelerate() {
        speed += 5;
    }
    public void brake() {
        speed -= 5;
    }
}

public class Car{
    public static void main(String[] args) {
        CarObject temp = new CarObject(2000, "Toyota");
        for(int i = 1; i < 6; i++) {
            temp.accelerate();
            System.out.println(temp.getSpeed());
        }
        for(int i = 1; i < 6; i++) {
            temp.brake();
            System.out.println(temp.getSpeed());
        }
    }
}