public class Card {
    private final String cardType; // suit of the card
    private final String cardNumber; // rank of the card
    
    public Card(String cardType, String cardNumber) {
        this.cardType = cardType;
        this.cardNumber=cardNumber;
    }
    
    public String getType() {
        return cardType;
    }
    
    public String getNumber() {
        return cardNumber;
    }
    
    public String toString() {
        return cardNumber + "," + cardType;
    }
}
