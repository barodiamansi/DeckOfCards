/**
 * @author Mansi B
 * Reusable class to generate a set of cards.
 */
package CardInterfaces;

import java.util.List;

public interface CardsFactory {
	/*
	 * Generates and returns a list of cards for a specific class type.
	 */
    public List<?> generateCards();
}