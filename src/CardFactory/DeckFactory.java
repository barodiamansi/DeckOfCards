/**
 * @author Mansi B
 * Generates a deck of 52 cards.
 */
package CardFactory;
import CardInterfaces.CardsFactory;
import CardFactory.PlayingDeckCard;

import java.util.ArrayList;
import java.util.List;

public class DeckFactory implements CardsFactory {

    @Override
    public List<PlayingDeckCard> generateCards() {
        List<PlayingDeckCard> cards = new ArrayList<PlayingDeckCard>();
        // Create a new card for each suit with different supported face values.
        for (SuitDetails suit : SuitDetails.values()) {
            for (FaceValues value : FaceValues.values()) {
                cards.add(new PlayingDeckCard(value, suit));
            }
        }

        return cards;
    }
}


