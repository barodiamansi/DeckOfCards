/**
 * @author Mansi B
 * Standard Suits of playing cards with colors assigned to it.
 *
 */
package CardFactory;

public enum SuitDetails {
    HEARTS(Color.RED),
    SPADES(Color.BLACK),
    CLUBS(Color.BLACK),
    DIAMONDS(Color.RED);

	/*
	 * Enum for suit color.
	 */
    public enum Color {
        BLACK,
        RED
    }

    // Holds the value of card color.
    private final Color cardColor;

    /*
     * Sets the color of card for a particular suit.
     */
    SuitDetails(final Color color) {
        this.cardColor = color;
    }

    /**
     * Returns the color of a particular suit.
     *
     * @return the color of the suit
     */
    public Color getCardColor() {
        return cardColor;
    }

    /**
     * Returns the Unicode symbol for the card suit. Throws an exception if the enum value is not supported.
     *
     * @return a single-character Unicode symbol
     */
    public String toSymbol() {
        switch (this) {
            case CLUBS:
                return "\u2663";
            case DIAMONDS:
                return "\u2666";
            case HEARTS:
                return "\u2665";
            case SPADES:
                return "\u2660";
            default:
                throw new EnumConstantNotPresentException(SuitDetails.class, "Not a valid suit value");
        }
    }

    @Override
    public String toString() {
        switch (this) {
            case CLUBS:
                return "Clubs";
            case DIAMONDS:
                return "Diamonds";
            case HEARTS:
                return "Hearts";
            case SPADES:
                return "Spades";
            default:
                return super.toString();
        }
    }
}
