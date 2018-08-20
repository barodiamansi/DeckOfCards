/**
 * @author Mansi B
 * Class that deals cards from a deck in either random order, top card or a bottom card. 
 * Throws an exception when asked to deal from an empty deck.
 */
package CardUtilities;

import java.util.List;
import java.util.Random;
import CardExceptions.EmptyDeckException;
import CardFactory.PlayingDeckCard;

public class Dealer {

    /**
     * Random number generator.
     */
    private final Random random = new Random();

    /**
     * Empty constructor.
     */
    public Dealer() {

    }

    /**
     * This method deals one random card from the deck of cards.
     *
     * @param deckOfCards The list of cards to choose a card from.
     *
     * @return The card dealt. The original list of cards will no longer contain the dealt card.
     */
    public final PlayingDeckCard dealOneRandomCard(final List<PlayingDeckCard> deckOfCards) throws EmptyDeckException {
        if (deckOfCards.isEmpty()) {
            throw new EmptyDeckException("Cannot deal a random card when the deck is empty");
        }

        return deckOfCards.remove(random.nextInt(deckOfCards.size()));
    }

    /**
     * This method deals the top card from the deck of cards.
     *
     * @param deckOfCards The list of cards to choose a card from.
     *
     * @return The card dealt. The original list of cards will no longer contain the dealt card.
     */
    public final PlayingDeckCard dealTopCard(final List<PlayingDeckCard> deckOfCards) throws EmptyDeckException {
        if (deckOfCards.isEmpty()) {
            throw new EmptyDeckException("Cannot deal a top card when the deck is empty");
        }
        
        return deckOfCards.remove(0);
    }

    /**
     * This method deals the bottom card from the deck of cards.
     *
     * @param deckOfCards The list of cards to choose a card from.
     *
     * @return The card dealt. The original list of cards will no longer contain the dealt card.
     */
    public final PlayingDeckCard dealBottomCard(final List<PlayingDeckCard> deckOfCards) throws EmptyDeckException {
        if (deckOfCards.isEmpty()) {
            throw new EmptyDeckException("Cannot deal a bottom card when the deck is empty");
        }

        return deckOfCards.remove(deckOfCards.size() - 1);
    }
}

