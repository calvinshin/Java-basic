import java.util.Scanner;

public class Asterisks {
    public static void main(String[] args) {
        int count = 0;
        char GoAgain = 'y';
        Scanner input = new Scanner(System.in);

        while(GoAgain != 'n') {
            System.out.print("How many asterisks?");
            count = input.nextInt();

            for(int i = 0; i < count; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print("Would you like to do this again");
            GoAgain = input.next().charAt(0);
        }
    }
}