import java.util.Scanner;

public class BackwardString {
    public static void main(String[] args) {
        System.out.print("Enter a string:");
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        StringBuilder output = new StringBuilder("");
        for (int i = input.length() - 1; i > -1; i--) {
            output.append(input.charAt(i));
        }
        System.out.print(output);
    }
}