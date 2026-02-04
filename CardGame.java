public class CardGame {
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();

        deck.shuffle();

        // Deal 5 cards
        System.out.println("Dealing 5 cards");
        Card[] hand = deck.dealCards(5);
        for (Card card : hand) System.out.println(card);

        // Peek at next card
        System.out.println("\nNext card (peek): " + deck.peekNextCard());

        // Print remaining cards
        System.out.println("\nNext card (peek): " + deck.peekNextCard());

        // Reset deck
        deck.reset();
        System.out.println("\nDeck reset. Cards Remaining: " + deck.cardsRemaining());
        System.out.println("Next card after reset: " + deck.peekNextCard());
        }

    }
    


