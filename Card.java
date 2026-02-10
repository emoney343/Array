public class Card {
    public final String face;
    public final String suit;

    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }

    public int getValue() {
    String face = this.face;
    switch (face) {
        case "Ace": return  14;
        case "King": return 13;
        case "Queen": return 12;
        case "Jack":  return 11;
        case "Ten": return  10;
        case "Nine": return 9;
        case "Eight": return 8;
        case "Seven": return 7;
        case "Six": return 6;
        case "Five": return 5;
        case "Four": return 4;
        case "Three": return 3;
        case "Two": return 2;
    }
    throw new IllegalArgumentException("Invalid card face: " + face);
    }

     public int getSuits() {
    String suit = this.suit;
    switch (suit) {
        case "Spades": return  1;
        case "Clubs": return 2;
        case "Diamonds": return 3;
        case "Hearts":  return 4;
    }
    throw new IllegalArgumentException("Invalid card Suit: " + suit);
 }
}
    

