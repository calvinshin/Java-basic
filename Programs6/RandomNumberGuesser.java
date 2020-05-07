import java.util.Random;

class RandomNumberGuesser extends NumberGuesser{
    Random rand = new Random();
    int max = 0;
    int currentGuess = 0;

    @Override
    public int getCurrentGuess() {
        if(currentGuess == 0) {
            int guess;
            max ++;
                if(upperLimit - lowerLimit > 0) {
                    guess = rand.nextInt(upperLimit - lowerLimit - 1) + lowerLimit + 1;
                }
                else {
                    guess = upperLimit;
                }

                System.out.println("Guess executed (obj) " + guess);
                if(guess < gameLowerLimit) {
                    currentGuess = gameLowerLimit;
                    return gameLowerLimit;
                }
                else if(guess > gameUpperLimit) {
                    currentGuess = gameUpperLimit;
                    return gameUpperLimit;
                }
                else {
                    currentGuess = guess;
                    return guess;
                }
        }
        else {
                return currentGuess;
        }
    }

    @Override
    public void lower() {
        super.lower();
        currentGuess = 0;
    }

    @Override
    public void higher() {
        super.higher();
        currentGuess = 0;
    }

    public RandomNumberGuesser(int low, int high) {
        super(low, high);
    }
}