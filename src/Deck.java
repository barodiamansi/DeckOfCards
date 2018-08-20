/**
 * @author Mansi B
 * Deck class with implementations of functions for a deck such a shuffling the deck and dealing a card from the deck.
 *
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import CardUtilities.Dealer;
import CardUtilities.Shuffler;
import java.util.logging.Logger;
import CardFactory.PlayingDeckCard;

public class Deck {
	
	// Logger for Deck class.
	private final static Logger LOGGER = Logger.getLogger(Deck.class.getName());

    /**
     * Will hold a deck of cards.
     */
    List<PlayingDeckCard> cards = new ArrayList<PlayingDeckCard>();

    /**
     * Populates the cards deck with the cards provided within cards list.
     *
     * @param cardList Used to create the deck. 
     */
    public Deck(List<PlayingDeckCard> cardList) {
        cards.addAll(cardList);
    }

    /**
     * Creates an empty Deck.
     */
    public Deck() {
        this(new Stack<PlayingDeckCard>());
    }

    /**
     * Shuffles the Deck. The cards in the deck will be in random order after this operation.
     */
    public void shuffle() {
        new Shuffler().shuffle(cards);
    }

    /**
     * Deals one card random card from the Deck. Throws an exception and returns null incase if there are no cards to deal.
     *
     * @return random card in the deck, or exception if no cards are left in the deck.
     */
    public PlayingDeckCard dealOneCard() {
    	try {
           return new Dealer().dealOneRandomCard(cards);
    	} catch (Exception e) {
    		LOGGER.severe(e.getMessage());
    		return null;
    	}
    }
    
    /**
     * Prints the cards sorted based on suit in the order of Hearts, Spades, Clubs and Diamonds.
     * @param cardsDeck Deck of cards that needs to be sorted. Should not be null or empty.
     */
    public void prettyPrintCardsDeck(List<PlayingDeckCard> cardsDeck) {
    	(cardsDeck).sort((card1, card2) -> card1.getSuit().compareTo(card2.getSuit()));
    	for(PlayingDeckCard card : cardsDeck) {
    		System.out.print("Card - " + card.getDisplayStringWithSymbols() + "\n");
    	}
    	
    }
}
