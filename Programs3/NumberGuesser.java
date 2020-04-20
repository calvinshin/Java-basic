import java.util.Scanner;

public class NumberGuesser{
    private int lowerLimit;
    private int upperLimit;
    public int gameLowerLimit;
    public int gameUpperLimit;
    public NumberGuesser() {
        lowerLimit = 1;
        upperLimit = 100;
        gameLowerLimit = 1;
        gameUpperLimit = 100;
    }
    public NumberGuesser(int low, int high) {
        if(lowerLimit < upperLimit) {
            lowerLimit = low;
            upperLimit = high;
            gameLowerLimit = low;
            gameUpperLimit = high;
        }
        else {
            upperLimit = high;
            lowerLimit = low;
            gameUpperLimit = high;
            gameLowerLimit = low;
        }
    }
    public int getCurrentGuess() {
        int guess = (lowerLimit + upperLimit)/2;
//        System.out.print("Is the number " + guess + "? (h/l/c): ");
        return guess;
    }
    public void lower() {
        upperLimit = getCurrentGuess();
    }
    public void higher() {
        lowerLimit = getCurrentGuess();
    }
    public void reset() {
        lowerLimit = gameLowerLimit;
        upperLimit = gameUpperLimit;
        System.out.println("Think of a number beween " + gameLowerLimit + " and " + gameUpperLimit);
        System.out.print("Is the number " + getCurrentGuess() + "? (h/l/c): ");
    }
}

// Guesses what the user has selected as a random number within a range of 1 to 100.
class oldGuesser {
    //    Scanner to listen to keyboard
    static Scanner input = new Scanner(System.in);

    private static int getMidpoint(int lowerLimit, int upperLimit) {
        int averageValue = (lowerLimit + upperLimit)/2;
        return averageValue;
    }

    public static void main(String[] args) {
        do {
            playOneGame();
        } while (shouldPlayAgain());
    }
    //    Runs through the sequence of a game
    public static void playOneGame() {
        //    variables: lower limit, upper limit, gameActive
        int lowerLimit = 1;
        int upperLimit = 100;
        int averageValue;
        boolean gameActive = true;
        char response;
        int numberOfGuesses = 1;

//        Loop of a round to guess the value
        while (gameActive == true) {
            averageValue = getMidpoint(lowerLimit, upperLimit);

            System.out.println("Choose a number 1-100.");
            System.out.println("Is it " + averageValue + "? (h)igher, (l)ower, (c)orrect");
            response = getUserResponseToGuess();
            switch(response) {
                case 'h':
                    lowerLimit = averageValue;
                    numberOfGuesses += 1;
                    break;
                case 'l':
                    upperLimit = averageValue;
                    numberOfGuesses += 1;
                    break;
                case 'c':
                    System.out.println("Great! That took " + numberOfGuesses + " guesses.");
                    gameActive = false;
                    break;
            }
        }
    }
    /*    function: keyboard listener for key input
            @return the character for the listener, checking for the value h/l/c
     */
    public static char getUserResponseToGuess() {
//        converts the value entered into a lowercase value.
        char response = Character.toLowerCase(input.next().charAt(0));
        while(!(response == 'h' || response == 'l' || response == 'c')) {
            System.out.println("That is not a valid entry. Please type h, l, or c.");
            response = Character.toLowerCase(input.next().charAt(0));
        }
        return response;
    }
//    function: comparison of keyboard to lower/upper
//    function: average of lower/upper

    /**  Asks the question if the player would like to play again.
     @return a boolean dependent on the input submitted
     */
    public static boolean shouldPlayAgain() {
        System.out.println("Would you like to play again? (y)es or (n)o");
//        converts the value entered into a lowercase value.
        char response = Character.toLowerCase(input.next().charAt(0));
        while(!(response == 'y' || response == 'n')) {
            System.out.println("That is not a valid entry. Please type y or n.");
            response = Character.toLowerCase(input.next().charAt(0));
        }
        switch(response) {
            case 'n':
                return false;
            case 'y':
                return true;
            default:
                return false;
        }
    }
}