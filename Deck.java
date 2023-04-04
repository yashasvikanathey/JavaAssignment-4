import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards; // arraylist of Card objects
    
    public Deck() {
        createDeck(); // create the deck when the object is instantiated
    }
    
    public void createDeck() {
        cards = new ArrayList<Card>();
        //Manually entering the card types and numbers
        String[] cardTypes = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        for(String cardType : cardTypes) {
            for(String cardNumber : cardNumbers) {
                Card card = new Card(cardType, cardNumber);
                cards.add(card);
            }
        }
    }
    
    public void printDeck() {
        for(Card card : cards) {
            System.out.println(card);
        }
    }
    
    public void printCard(int index) {
        System.out.println(cards.get(index));
    }
    //Prints cards of the same type
    public ArrayList<Card> sameCard(String cardType) {
        ArrayList<Card> sameCards = new ArrayList<Card>();
        for(Card card : cards) {
            if(card.getType().equals(cardType)) {
                sameCards.add(card);
            }
        }
        return sameCards;
    }
    
    public ArrayList<Card> compareCard(String cardNumber) {
        ArrayList<Card> sameRankCards = new ArrayList<Card>();
        for(Card card : cards) {
            if(card.getNumber().equals(cardNumber)) {
                sameRankCards.add(card);
            }
        }
        return sameRankCards;
    }
    
    public ArrayList<Card> findCard(String cardType, String cardNumber) {
        ArrayList<Card> foundCards = new ArrayList<Card>();
        for(Card card : cards) {
            if(card.getType().equals(cardType) && card.getNumber().equals(cardNumber)) {
                foundCards.add(card);
            }
        }
        return foundCards;
    }
    
    public ArrayList<Card> dealCard() {
        ArrayList<Card> dealtCards = new ArrayList<Card>();
        Collections.shuffle(cards);
        for(int i = 0; i < 5; i++) {
            dealtCards.add(cards.get(i));
        }
        return dealtCards;
    }
    
    public void shuffleDeck() {
        Collections.shuffle(cards);
    }
}
