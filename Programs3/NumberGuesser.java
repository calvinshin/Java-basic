import java.util.Scanner;

public class NumberGuesser{
    private int lowerLimit;
    private int upperLimit;
    private int gameLowerLimit;
    private int gameUpperLimit;
    public NumberGuesser() {
        lowerLimit = 1;
        upperLimit = 100;
        gameLowerLimit = 1;
        gameUpperLimit = 100;
    }
    public NumberGuesser(int low, int high) {
        if(low < high) {
            lowerLimit = low-1;
            upperLimit = high+1;
            gameLowerLimit = low;
            gameUpperLimit = high;
        }
        else {
            upperLimit = low-1;
            lowerLimit = high+1;
            gameUpperLimit = low;
            gameLowerLimit = high;
        }
    }
    public int getCurrentGuess() {
        int guess = (lowerLimit + upperLimit)/2;
        if(guess < gameLowerLimit) {
            return gameLowerLimit;
        }
        else if(guess > gameUpperLimit) {
            return gameUpperLimit;
        }
        else {
            return guess;
        }
    }

    public void lower() {
        upperLimit = getCurrentGuess();
    }
    public void higher() {
        lowerLimit = getCurrentGuess();
    }
    public void reset() {
        lowerLimit = gameLowerLimit - 1;
        upperLimit = gameUpperLimit + 1;
    }
    public int getGameLowerLimit() {
        return gameLowerLimit;
    }
    public int getGameUpperLimit() {
        return gameUpperLimit;
    }
}