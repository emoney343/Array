import java.util.Arrays;

public class CardGame {

    // Method to get straight
    static boolean isStraight(int[] arr) {
        int[] a = arr.clone();
        Arrays.sort(a);

        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1] + 1) return false;
        }
        return true;
    }

    // Method to get highcard
    static int highCard(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    private static void evaluateAndPrint(Card[] hand) {

        // Store counts
        int[] counts = new int[15];     
        int[] suitCounts = new int[5];
        int[] values = new int[hand.length];

        // Get values of hands and suits in hand
        for (int i = 0; i < hand.length; i++) {
            int v = hand[i].getValue();
            int s = hand[i].getSuits();

            values[i] = v;
            counts[v]++;
            suitCounts[s]++;
        }

        int pairs = 0;
        int triples = 0;
        int quads = 0;

        for (int v = 2; v <= 14; v++) {
            if (counts[v] == 2) pairs++;
            else if (counts[v] == 3) triples++;
            else if (counts[v] == 4) quads++;
        }

        boolean flush = false;
        for (int s = 1; s <= 4; s++) {
            if (suitCounts[s] == 5) flush = true;
        }

        boolean straight = isStraight(values);

        // Print hand evaluation
        if (flush && straight) {
            System.out.println("Straight Flush");
        } else if (quads == 1) {
            System.out.println("Four of a Kind");
        } else if (triples == 1 && pairs == 1) {
            System.out.println("Full House");
        } else if (flush) {
            System.out.println("Flush");
        } else if (straight) {
            System.out.println("Straight");
        } else if (triples == 1) {
            System.out.println("Three of a Kind");
        } else if (pairs == 2) {
            System.out.println("Two Pair");
        } else if (pairs == 1) {
            System.out.println("One Pair");
        } else {
            System.out.println("High Card: " + highCard(values));
        }
    }

    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();

        System.out.println("Dealing 5 cards");
        Card[] hand = deck.dealCards(5);

        for (Card card : hand) {
            System.out.println(card);
        }

        evaluateAndPrint(hand);
    }
}



        

    
        

        // // Peek at next card
        // System.out.println("\nNext card (peek): " + deck.peekNextCard());

        // // Print remaining cards
        // System.out.println("\nNext card (peek): " + deck.peekNextCard());

        // // Reset deck
        // deck.reset();
        // System.out.println("\nDeck reset. Cards Remaining: " + deck.cardsRemaining());
        // System.out.println("Next card after reset: " + deck.peekNextCard());

        // int[] hand1 = new int[5];
        // int key = 3;

        // boolean res = isElementPresent(hand1, key);
        // System.out.println("Is " + key + " present in the hand: " + res);
    

    


    // SO then i need to make a if statement that checks if a certain sequence of numbers is in an array so it can add points to a total score variable and if not
    // it adds the highest card 

    
    


