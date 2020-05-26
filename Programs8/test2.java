public class test2 {
    public static void main(String[] args) {
        FlyingCar cars[] = new FlyingCar[3];
        Location test = new Location(3.0, 3.0);
        cars[0] = new FlyingCar(0.0, test, 0.0);
        cars[1] = new FlyingCar(0.0, test, 0.0);
        cars[2] = new FlyingCar(0.0, test, 0.0);
        System.out.print(landUnsafeCars(cars, cars[0], 4.0));
    }
    public static int landUnsafeCars (FlyingCar[] carArray, FlyingCar paceCar,double hardDeck){
        int landed = 0;
        for (int i = 0; i < carArray.length; i++) {
            if (carArray[i].isHigherAndFaster(paceCar)) {
                carArray[i].land();
                landed += 1;
            }else if (carArray[i].getAltitude() < hardDeck) {
                carArray[i].land();
                landed += 1;
            }
        }
        return landed;
    }
}