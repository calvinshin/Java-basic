//The distance a vehicle travels can be calculated as follows:
////        Distance = Speed * Time
////        For example, if a train travels 40 miles-per-hour for three hours, the distance traveled is 120 miles. Write a program that asks for the speed of a vehicle (in miles-per-hour) and the number of hours it has traveled. Both values are assumed to be integers. It should use a
////        loop to display the distance a vehicle has traveled for each hour of a time period specified by the user. For example, if a vehicle is traveling at 40 mph for a three-hour time period, it should display a report similar to the one that follows:
////
////        Hours Distance Traveled
////        ---------------------------
////        1 40
////        2 80
////        3 120
////
////        Do not accept a negative number for speed and do not accept any value less than 1 for time traveled.
////
////        Sample Run
////        java DistanceTravelled
////
////        Enter vehicle speed (in mph): 60↵
////        Enter time travelled (in hrs): 2↵
////        Hour→Distance Travelled↵
////        --------------------------↵
////        1→→60↵
////        2→→120↵
import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        int hoursInput;
        int mphInput;
        int distance = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter vehicle speed (in mph): ");
        mphInput = input.nextInt();
        while(mphInput < 0) {
            mphInput = input.nextInt();
        }
        System.out.print("Enter time travelled (in hrs): ");
        hoursInput = input.nextInt();
        while(hoursInput < 0) {
            hoursInput = input.nextInt();
        }
        System.out.print("\nHours Distance Traveled");
        System.out.println("--------------------------");
        for(int hour = 1; hour <= hoursInput; hour++) {
            distance += mphInput;
            System.out.println(hour + " " + distance);
        }
    }
}