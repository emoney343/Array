

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

        for (Card c : hand) {
            int Value = c.getValue();
            counts[Value]++;
        }
        
        int pairs= 0;
        int triples = 0;
        int quads = 0;

        // I have a way to count if theres pairs three of a kind and four of a kind but i need to figure out how to display it correctly
        
        for (int i = 2; i <= 14; i++) {
            if (counts[i] == 2) {
                pairs++;
            System.out.println("Pair!");
            }
        else if (counts [i] == 3) {
            triples++;
            System.out.println("Three of a kind!");
        }
        else if (counts [i] == 4) {
            quads++;
            System.out.println("Four of a kind!");
        }
        }
        return pairs;
        }

            
        


 
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();

        deck.shuffle();

        

        // Deal cards
        System.out.println("Dealing 20 cards");
        Card[] hand = deck.dealCards(20);
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

    
    


