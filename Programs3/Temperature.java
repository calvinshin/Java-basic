import java.util.Scanner;

class Temperature {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a Fahrenheit temperature:");
        double fahr = keyboard.nextDouble();
        TempClass temp = new TempClass(fahr);
        System.out.println("The temperature in Fahrenheit is " + temp.getFahrenheit());
        System.out.println("The temperature in Celsius is " + temp.getCelsius());
        System.out.println("The temperature in Kelvin is " + temp.getKelvin());
    }
}



class TempClass {
    private double ftemp;
    public TempClass(double temperature) {
        ftemp = temperature;
    }
    public void setFahrenheit(double temperature) {
        ftemp = temperature;
    }
    public double getFahrenheit() {
        return ftemp;
    }
    public double getCelsius() {
        double ctemp = (5.0/9.0)*(ftemp - 32);
        return ctemp;
    }
    public double getKelvin() {
        double ktemp = (5.0/9.0*(ftemp - 32)) + 273;
        return ktemp;
    }
}