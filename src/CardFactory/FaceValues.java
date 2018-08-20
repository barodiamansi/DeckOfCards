/**
 * 
 */
package CardFactory;

/**
 * @author Mansi B
 * Standard face values of playing cards in number, string and symbols.
 *
 */
public enum FaceValues {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13);

	// Holds the numeric face value.
    private final int numericFaceValue;

    /**
     * Sets a numeric face value.
     *
     * @param value number that needs to be set.
     */
    FaceValues(final int value) {
        this.numericFaceValue = value;
    }

    /**
     * @return numeric face value
     */
    public int getNumbericFaceValue() {
        return numericFaceValue;
    }

    /**
     * @return String name for every face value. Will throw an exception incase of not a valid face value.
     */
    @Override
    public String toString() {
        switch (this) {
            case ACE:
                return "Ace";
            case TWO:
                return "Two";
            case THREE:
                return "Three";
            case FOUR:
                return "Four";
            case FIVE:
                return "Five";
            case SIX:
                return "Six";
            case SEVEN:
                return "Seven";
            case EIGHT:
                return "Eight";
            case NINE:
                return "Nine";
            case TEN:
                return "Ten";
            case JACK:
                return "Jack";
            case QUEEN:
                return "Queen";
            case KING:
                return "King";
            default:
                throw new EnumConstantNotPresentException(FaceValues.class, "Not a valid face value");
        }
    }

    /**
     * @return string symbols for Ace, Jack, Queen and King. For rest this will return string of numeric face value.
     */
    public String toSymbol() {
        switch (this) {
            case ACE:
                return "A";
            case JACK:
                return "J";
            case QUEEN:
                return "Q";
            case KING:
                return "K";
            default:
                return String.valueOf(numericFaceValue);
        }
    }
}