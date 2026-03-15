# Poker Hand Card Game
 
A command-line card game written in Java. Players are dealt 10 cards each round and choose 5 to form the best poker hand they can. Built as a hands-on project to practice arrays, sorting, and game logic.
 
## How to Run
 
```bash
javac *.java
java CardGame
```
 
## How to Play
 
- Each round you are dealt 10 cards
- Pick 5 cards by entering their index numbers
- Your hand is evaluated and you earn points based on its rank
- Play through 5 rounds and try to maximize your total score
 
## Scoring
 
| Hand | Points |
|------|--------|
| Straight Flush | 9 |
| Four of a Kind | 8 |
| Full House | 7 |
| Flush | 6 |
| Straight | 5 |
| Three of a Kind | 4 |
| Two Pair | 3 |
| One Pair | 2 |
| High Card | 1 |
 
## What I Learned
 
- How to use arrays as the core data structure - the deck, hand, and card counts are all stored and manipulated using arrays
- How to traverse and search arrays to evaluate hand combinations like pairs, straights, and flushes
- How to sort an array and use index-based logic to detect sequential values (straights) and duplicates (pairs, triples)
- How to track state across an array using a boolean array to prevent duplicate card selections
