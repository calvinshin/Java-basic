import java.util.Scanner;
import java.util.Arrays;

public class PokerHands {
    public static void main(String[] args) {
//      Initialize variables
        int[] pokerHand = new int[5];
//      Get user values for hand
        pokerHand = askUserInput();
//      Determine the rank of the hand
        handRank(pokerHand);
    }
//      Get user values for hand
    public static int[] askUserInput() {
        Scanner keyboard = new Scanner(System.in);
        int[] pokerHand = new int[5];
        System.out.println("Enter five numeric cards, no face cards. Use 2 - 9.");
        for(int i = 1; i < 6; i++) {
            System.out.print("Card " + i + ": ");
            pokerHand[i-1] = keyboard.nextInt();
            while(pokerHand[i-1] > 9 || pokerHand[i-1] < 2) {
                System.out.print("Invalid entry. Please use a number 2-9: ");
                pokerHand[i-1] = keyboard.nextInt();
            }
        }
        return pokerHand;
    }
//  Display hand - used internally for testing
    private static void displayHand(int[] hand) {
        for(int i = 0; i < 5; i++) {
            System.out.print("Card" + i + ": " + hand[i] + " | ");
        }
        System.out.println("End");
    }
//  determine rank of the hand
    private static void handRank(int[] hand) {
//      hand is set to the original hand
//      reorderedHand is used for simplicity in other hands
        int[] reorderedHand = reorderHand(hand);
//      frequencyHand is used for determining the frequency of cards
        int[] frequencyedHand = frequencyHand(reorderedHand);

//      Order of these do not matter; the config of each function is dependent on an input of an int[5]
        if(containsPair(frequencyedHand)) {
            System.out.println("Pair!");
        }
        else if(containsTwoPair(frequencyedHand)) {
            System.out.println("Two Pair!");
        }
        else if(containsThreeOfaKind(frequencyedHand)) {
            System.out.println("Three of a Kind!");
        }
        else if(containsFourOfaKind(frequencyedHand)) {
            System.out.println("Four of a Kind!");
        }
        else if(containsFiveOfaKind(frequencyedHand)) {
            System.out.println("Five of a kind... that seems odd.");
        }
        else if(containsFullHouse(frequencyedHand)) {
            System.out.println("Full House!");
        }
//      Note the use of orderedHand to identify the straight
        else if(containsStraight(reorderedHand)) {
            System.out.println("Straight!");
        }
//      Else statement to indicate failure of any higher valued hand
        else {
            System.out.println("High Card!");
        }
    }
    //  Reorder the hand - for internal use to re-order the hand for easier calculations.
//  Output is a new array in order to not change the relationship of the array; Arrays.sort(input) would change the input
    public static int[] reorderHand(int[] input) {
        int[] output = new int[5];
        for(int i = 0; i < 5; i++) {
            output[i] = input[i];
        }
        Arrays.sort(output);
        return output;
    }
//    frequency hand - for internal use to display the frequency of cards
    private static int[] frequencyHand(int[] hand) {
        int[] frequencyHand = new int[5];
        int index = 0;
        frequencyHand[0] = 1;
        for(int i = 1; i < 5; i++) {
            if(hand[i] == hand[i-1]) {
                frequencyHand[index] += 1;
            }
            else {
                index += 1;
                frequencyHand[index] += 1;
            }
        }
        Arrays.sort(frequencyHand);
        return frequencyHand;
    }


//    -------------------------------------------------------------

//  boolean functions and checks
//  In order to properly execute these hands of variable size, the index of hand could be changed to hand.length relative values
//  As the constraint for the hand size is 5, this was not implemented.

//  Uses Frequencyed hand
    public static boolean  containsPair(int hand[]) {
        if(hand[4] == 2 && hand[3] == 1) return true;
        return false;
    }

    public static boolean  containsTwoPair(int hand[]) {
        if(hand[4] == 2 && hand[3] == 2) return true;
        return false;
    }

    public static boolean  containsThreeOfaKind(int hand[]) {
        if(hand[4] == 3 && hand[3] == 1) return true;
        return false;
    }

    public static boolean  containsFullHouse(int hand[]) {
        if(hand[4] == 3 && hand[3] == 2) return true;
        return false;
    }

    public static boolean  containsFourOfaKind(int hand[]) {
        if(hand[4] == 4) return true;
        return false;
    }
    public static boolean  containsFiveOfaKind(int hand[]) {
        if(hand[4] == 5) return true;
        return false;
    }

//  uses Ordered Hand
    public static boolean  containsStraight(int hand[]) {
        for(int i = 1; i < 5; i++) {
            if(hand[i] != hand[i-1] + 1) {
                return false;
            }
        }
        return true;
    }

}

