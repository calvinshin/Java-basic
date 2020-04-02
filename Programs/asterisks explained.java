import java.util.Scanner;
// Imports the scanner utility which allows for input from CLI
public class Asterisks {
//    Declaration of the class Asterisks (which... needs to be public)?
    public static void main(String[] args)
//    public static void main(String[] args) was also on the MyFirstProgram even without any strings/args
    {
//      Declaration of variables count, goAgain, and ScannerInput
        int count;
        char goAgain = 'y';
        Scanner input = new Scanner(System.in);
//      While loop, allows for continuous exectuion of the function as long as the previous execution is completed
        while (goAgain != 'n')
        {
            System.out.print("How many asterisks?: ");
//           Print of the question
            count = input.nextInt();
//            changes value of variable count to input.nextInt() which tries to look at the next argument and set it as an int
            for (int i = 0; i < count; i++)
            {
                System.out.print("*");
//                for loop for system print
            }
            System.out.println();
//            line break
            System.out.print("Go again? (y/n): ");
//            asks a question through print,
            goAgain = input.next().charAt(0);
//            takes the next argument and splices at character 0 to see if it is n or not.
        }
    }
}


