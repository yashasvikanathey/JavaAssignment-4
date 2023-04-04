import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Deck deck = new Deck();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while(choice != 9) {
            System.out.println("\nMenu:");
            System.out.println("1. Print the deck");
            System.out.println("2. Print any card");
            System.out.println("3. Cards from same suit");
            System.out.println("4. Cards of the same rank");
            System.out.println("5. Find any card");
            System.out.println("6. Deal 5 cards");
            System.out.println("7. Shuffle the deck");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    deck.printDeck();
                    break;
                case 2:
                    System.out.print("Enter the index of the card (0-51): ");
                    int index = scanner.nextInt();
                    deck.printCard(index);
                    break;
                case 3:
                    System.out.print("Enter the suit of the cards: ");
                    String suit = scanner.next();
                    ArrayList<Card> sameCards = deck.sameCard(suit);
                    for(Card card : sameCards) {
                        System.out.println(card);
                    }
                    break;
                case 4:
                    System.out.print("Enter the rank of the cards: ");
                    String rank = scanner.next();
                    ArrayList<Card> sameRankCards = deck.compareCard(rank);
                    for(Card card : sameRankCards) {
                        System.out.println(card);
                    }
                    break;
                case 5:
                    System.out.print("Enter the suit of the card: ");
                    String cardSuit = scanner.next();
                    System.out.print("Enter the rank of the card: ");
                    String cardRank = scanner.next();
                    ArrayList<Card> foundCards = deck.findCard(cardSuit, cardRank);
                    for(Card card : foundCards) {
                        System.out.println(card);
                    }
                    break;
                case 6:
                    ArrayList<Card> dealtCards = deck.dealCard();
                    for(Card card : dealtCards) {
                        System.out.println(card);
                    }
                    break;
                case 7:
                    deck.shuffleDeck();
                    System.out.println("Deck shuffled.");
                    break;
                case 8:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
