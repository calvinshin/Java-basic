import java.util.Scanner;

public class GuessingProgram {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int lowerLimit = 1;
        int upperLimit = 100;
        NumberGuesser guesser = new NumberGuesser(lowerLimit, upperLimit);
        boolean playAgain;
        char response;

        newGame();
    }

    public static void newGame() {
        playAgain = true;
        System.out.println("Think of a number beween " + lowerLimit + " and " + upperLimit + ". ");

        while(playAgain == true) {
            System.out.print("Is the number " + guesser.getCurrentGuess() + "? (h/l/c): ");
            response = getUserResponseToGuess();


            playAgain = false;
        }
//        switch(response) {
//            case 'h':
//                lowerLimit = averageValue;
//                numberOfGuesses += 1;
//                break;
//            case 'l':
//                upperLimit = averageValue;
//                numberOfGuesses += 1;
//                break;
//            case 'c':
//                System.out.println("Great! That took " + numberOfGuesses + " guesses.");
//                gameActive = false;
//                break;
//        }
    }

    public static char getUserResponseToGuess() {
//        converts the value entered into a lowercase value.
        char response = Character.toLowerCase(input.next().charAt(0));
        while(!(response == 'h' || response == 'l' || response == 'c')) {
            System.out.println("That is not a valid entry. Please type h, l, or c.");
            response = Character.toLowerCase(input.next().charAt(0));
        }
        return response;
    }
}