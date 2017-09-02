package technicalProblems.recursion;

import util.Printing;

import java.util.Random;

public class ShuffleCardDeck {

    public static void shuffleRecursive(int[] deck, int n) {
        if (n > 0) {
            shuffleRecursive(deck, n-1);
            Random rand = new Random();
            int randomIndex = rand.nextInt(n);
            int temp = deck[randomIndex];
            deck[randomIndex] = deck[n];
            deck[n] = temp;
        }
    }

    public static void shuffleIteratively(int[] deck) {
        for (int i = 1; i < deck.length; i++) {
            Random rand = new Random();
            int randomIndex = rand.nextInt(i);
            int temp = deck[randomIndex];
            deck[randomIndex] = deck[i];
            deck[i] = temp;
        }
    }

    public static void main(String args[]) {
        int[] deck = new int[]{2, 3, 6, 0, 10, 23, 432, 123};

        shuffleRecursive(deck, deck.length-1);

        Printing.printArray(deck);

        deck = new int[]{2, 3, 6, 0, 10, 23, 432, 123};

        shuffleIteratively(deck);

        Printing.printArray(deck);
    }
}
