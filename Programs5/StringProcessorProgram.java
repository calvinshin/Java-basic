import java.util.Scanner;

public class StringProcessorProgram{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        boolean again = true;

        while(again) {
            System.out.print("Enter a line of text: ");
            String newString = keyboard.nextLine();
            StringProcessor test2 = new StringProcessor(newString);

//          StringProcessor test2 = new StringProcessor("Test     this entire string, you got This Okay?    One time and two b3g1nn1ngs    ");
//          System.out.println(input);
            System.out.println("words: " + test2.wordCount());
            System.out.println("uppercase: " + test2.uppercaseCount());
            System.out.println("digits: " + test2.digitCount());
            System.out.println("digit words: " + test2.digitWordCount());
            System.out.println("line with whitespace removed: " + test2.getNoSpaceString());
            System.out.println("line with vowels replaced: " + test2.getNoVowelString());
            System.out.println("line with digit words replaced: " + test2.getNoDigitWordString());

            System.out.print("do you want to enter another? (y/n)");
            String nextInput = keyboard.nextLine();
            char action = Character.toLowerCase(nextInput.charAt(0));
            while(!(action == 'y' || action == 'n')) {
                System.out.print("invalid input; enter y or n");
                nextInput = keyboard.nextLine();
                action = Character.toLowerCase(nextInput.charAt(0));
            }
            if(action == 'n') {
                again = false;
            }
        }
    }
}