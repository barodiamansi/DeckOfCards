/**
 * @author Mansi B
 * Creates individual cards with specific suit and face value for the deck of cards.
 */
package CardFactory;

import CardInterfaces.Card;

public class PlayingDeckCard implements Card {
	// Holds the suit value of the card.
    private SuitDetails suit;
    
    // Holds the face value of the card.
    private FaceValues faceValue;

    /**
     * Constructs a playing card with the provided suit and face value details. Will throw a NPE if these values are not provided.
     * @param faceValue face value of the card. Will throw NPE if value is null. Should be a valid value from @see CardFactory.FaceValues
     * @param suit specific suit value of the card. Will throw NPE if value is null. Should be a valid value from @see CardFactory.SuitDetails
     */
    public PlayingDeckCard(FaceValues faceValue, SuitDetails suit) {
        if (faceValue == null) {
            throw new NullPointerException("Face value cannot be null.");
        }
        if (suit == null) {
            throw new NullPointerException("Suit cannot be null.");
        }

        this.suit = suit;
        this.faceValue = faceValue;
    }

    /**
     * @return type of suit of the card.
     */
    public SuitDetails getSuit() {
        return suit;
    }

    /**
     * @return face value of the card.
     */
    public FaceValues getFaceValue() {
        return faceValue;
    }

    /**
     * @return string with suit, face value and color of the card.
     */
    public String getDisplayString() {
        return "Suit " + suit.toString() + " with face value " + faceValue.toString() + " and color " + suit.getCardColor();
    }
    
    /**
     * @return string with suit symbol, face value symbol and color of the card.
     */
    public String getDisplayStringWithSymbols() {
    	return "Suit " + suit.toSymbol() + " with face value " + faceValue.toSymbol() + " and color " + suit.getCardColor();
    }
    
    /**
     * @return string with suit and face values.
     */
    @Override
    public String toString() {
        return "Suit " + suit + " with face value " + faceValue;
    }
}

