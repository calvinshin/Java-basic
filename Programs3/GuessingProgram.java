import java.util.Scanner;

public class GuessingProgram {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int lowerLimit = 1;
        int upperLimit = 100;
        NumberGuesser guesser = new NumberGuesser(lowerLimit, upperLimit);
        newGame(guesser);
    }

    public static void newGame(NumberGuesser game) {
        boolean playAgain = true;
        char response;
        int numberOfGuesses = 1;
        System.out.println("Think of a number beween " + game.getGameLowerLimit() + " and " + game.getGameUpperLimit() + ". ");

        while(playAgain == true) {
            System.out.print("Is the number " + game.getCurrentGuess() + "? Select (h)igher, (l)ower, c(orrect): ");
            response = guessValidation();
            switch(response) {
                case 'h':
                    game.higher();
                    numberOfGuesses += 1;
                    break;
                case 'l':
                    game.lower();
                    numberOfGuesses += 1;
                    break;
                case 'c':
                    System.out.println("Great! That took " + numberOfGuesses + " guesses.");
                    System.out.print("Do you want to play again? Select (y)es or (n)o: ");
                    char replay = playAgainValidation();
                    if(replay == 'y') {
                        game.reset();
                        System.out.println("Think of a number beween " + game.getGameLowerLimit() + " and " + game.getGameUpperLimit() + ". ");
                        numberOfGuesses = 1;
                        break;
                    }
                    else {
                        playAgain = false;
                        System.out.println("Thanks for playing!");
                        break;
                    }
            }
        }


    }

    public static char guessValidation() {
//        converts the value entered into a lowercase value.
        char response = Character.toLowerCase(input.next().charAt(0));
        while(!(response == 'h' || response == 'l' || response == 'c')) {
            System.out.print("That is not a valid entry. Please type h, l, or c: ");
            response = Character.toLowerCase(input.next().charAt(0));
        }
        return response;
    }
    public static char playAgainValidation() {
        char response = Character.toLowerCase(input.next().charAt(0));
        while(!(response == 'y' || response == 'n')) {
            System.out.print("That is not a valid entry. Please type y or n: ");
            response = Character.toLowerCase(input.next().charAt(0));
        }
        return response;
    }
}