import java.util.Random;

public class numguesserTest {

    public static void main(String[] args) {
        final int GAME_COUNT = 100;
        final int MIN = 1;
        final int MAX = 100;
        Random random = new Random();
        RandomNumberGuesser guesser = new RandomNumberGuesser(MIN, MAX);
        int totalGuessCount = 0;
        // Make the guesser look for a random number, GAME_COUNT times
        for (int i = 0; i < GAME_COUNT; i++) {
            // There is always the initial guess
            int guessCount = 1;
            // Generate a random value to look for, from MIN to MAX, inclusive.
            int targetValue = MIN + random.nextInt(MAX - MIN + 1);
            System.out.println("Target value : " + targetValue);
            // Keep looping until the guesser gets it right
            while (targetValue != guesser.getCurrentGuess()) {
                System.out.println("Current Guess (main): " + guesser.getCurrentGuess());
                // Adjust the guesser, as needed...
                if (targetValue > guesser.getCurrentGuess()) {
                    guesser.higher();
                    System.out.println("higher executed");
                } else {
                    guesser.lower();
                    System.out.println("lower executed");

                }
                // That's one more guess, bump up the count
                guessCount++;
            }
            // Keep track of the total number of guesses in all the simulated games
            totalGuessCount += guessCount;
            // Return the guesser is in its initial state
            guesser.reset();
        }
        // Calculate and display the average
        double averageGuessCount = totalGuessCount / (double) GAME_COUNT;
        System.out.println("Average number of guesses: " + averageGuessCount);
    }
}