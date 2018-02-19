import java.util.ArrayList;
import java.util.Random;

/**
 * The DeckOfCards class instantiates the arraylist of Cards and
 * all of the cards in the cards in the deck. Also provides the functionality
 * of the deck.
 */
public class DeckOfCards {

    private ArrayList<Cards> deck;

    public DeckOfCards() {

        deck = new ArrayList<>();

        // Creates 52 instances of playing cards
        deck.add(new Cards("Ace", "Diamonds"));
        deck.add(new Cards("Ace", "Hearts"));
        deck.add(new Cards("Ace", "Clubs"));
        deck.add(new Cards("Ace", "Spades"));

        deck.add(new Cards("Two", "Diamonds"));
        deck.add(new Cards("Two", "Hearts"));
        deck.add(new Cards("Two", "Clubs"));
        deck.add(new Cards("Two", "Spades"));

        deck.add(new Cards("Three", "Diamonds"));
        deck.add(new Cards("Three", "Hearts"));
        deck.add(new Cards("Three", "Clubs"));
        deck.add(new Cards("Three", "Spades"));

        deck.add(new Cards("Four", "Diamonds"));
        deck.add(new Cards("Four", "Hearts"));
        deck.add(new Cards("Four", "Clubs"));
        deck.add(new Cards("Four", "Spades"));

        deck.add(new Cards("Five", "Diamonds"));
        deck.add(new Cards("Five", "Hearts"));
        deck.add(new Cards("Five", "Clubs"));
        deck.add(new Cards("Five", "Spades"));

        deck.add(new Cards("Six", "Diamonds"));
        deck.add(new Cards("Six", "Hearts"));
        deck.add(new Cards("Six", "Clubs"));
        deck.add(new Cards("Six", "Spades"));

        deck.add(new Cards("Seven", "Diamonds"));
        deck.add(new Cards("Seven", "Hearts"));
        deck.add(new Cards("Seven", "Clubs"));
        deck.add(new Cards("Seven", "Spades"));

        deck.add(new Cards("Eight", "Diamonds"));
        deck.add(new Cards("Eight", "Hearts"));
        deck.add(new Cards("Eight", "Clubs"));
        deck.add(new Cards("Eight", "Spades"));

        deck.add(new Cards("Nine", "Diamonds"));
        deck.add(new Cards("Nine", "Hearts"));
        deck.add(new Cards("Nine", "Clubs"));
        deck.add(new Cards("Nine", "Spades"));

        deck.add(new Cards("Ten", "Diamonds"));
        deck.add(new Cards("Ten", "Hearts"));
        deck.add(new Cards("Ten", "Clubs"));
        deck.add(new Cards("Ten", "Spades"));

        deck.add(new Cards("Jack", "Diamonds"));
        deck.add(new Cards("Jack", "Hearts"));
        deck.add(new Cards("Jack", "Clubs"));
        deck.add(new Cards("Jack", "Spades"));

        deck.add(new Cards("Queen", "Diamonds"));
        deck.add(new Cards("Queen", "Hearts"));
        deck.add(new Cards("Queen", "Clubs"));
        deck.add(new Cards("Queen", "Spades"));

        deck.add(new Cards("King", "Diamonds"));
        deck.add(new Cards("King", "Hearts"));
        deck.add(new Cards("King", "Clubs"));
        deck.add(new Cards("King", "Spades"));
    }

    /**
     * Shuffles the deck of cards into random order.
     * Removes the cards randomly into a sub-array list,
     * and then puts the random cards back into the deck.
     */
    public void shuffleDeck() {

        Random rand = new Random();
        ArrayList<Cards> tempDeck = new ArrayList<>();

        int count = 52;

        for (int i = 0; i < 52; i++) {
            int num = rand.nextInt(count);
            tempDeck.add(deck.get(num));
            deck.remove(num);
            count--;
        }

        for (int i = 0; i < tempDeck.size(); i++) {
            deck.add(tempDeck.get(i));
        }
    }

    /**
     * Deals the topmost card of the deck, and then removes that
     * card out of the list
     * @return cardReturned
     */
    public String dealCard() {

        String cardReturned;

        if (deck.size() != 0) {
            cardReturned = deck.get(deck.size() - 1).getCard();
            deck.remove(deck.size() - 1);
        } else {
            cardReturned = "Deck is empty";
        }

        return cardReturned;
    }
}
