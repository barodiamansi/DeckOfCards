/**
 * @author Mansi B
 * Exception when a card deck is empty.
 *
 */

package CardExceptions;

@SuppressWarnings("serial")
public class EmptyDeckException extends Exception {
    
	// Empty constructor
	public EmptyDeckException() {
    }

    /**
     * Populates the cards deck with the provided cards list.
     *
     * @param message the detail message specifying what caused the exception i.e. an empty deck in this case.
     */
    public EmptyDeckException(String message) {
        super(message);
    }
}
