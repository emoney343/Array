public class CardGame {

    // private static boolean isElementPresent(int[] arr, int key) {
    //     for (int element : arr) {
    //         if (element == key) {
    //             return true;
            // }
    //     }
    //     return false;
    // }

    // Count pairs in a hand of cards
    private static int countPairs(Card[] hand) {

        int[] counts = new int[15];

        for (Card card : hand) {
            counts[card.getValue()]++;

        }
        
        int pairCount = 0;
        for (int i = 2; i < 14; i++) {
            if (counts[i] >= 2) pairCount++;

        }

        return pairCount;

    }

       
 
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();

        deck.shuffle();

        

        // Deal cards
        System.out.println("Dealing 10 cards");
        Card[] hand = deck.dealCards(10);
        for (Card card : hand) System.out.println(card);

        int pairCount = countPairs(hand);
        System.out.println("Number of pairs in hand: " + pairCount);
        

    
        

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
        }

    }


    // SO then i need to make a if statement that checks if a certain sequence of numbers is in an array so it can add points to a total score variable and if not
    // it adds the highest card 

    
    


